package com.example.segundaApi;

import com.example.segundaApi.entities.*;
import com.example.segundaApi.entities.enums.*;
import com.example.segundaApi.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class SegundaApiApplication { 

	public static void main(String[] args) {
		SpringApplication.run(SegundaApiApplication.class, args);
		System.out.println("Servidor iniciando");

	}

	@Bean
	@Transactional
	CommandLineRunner init(ImagenRepository imagenRepository,
						   UsuarioRepository usuarioRepository,
						   EmpleadoRepository empleadoRepository,
						   ClienteRepository clienteRepository,
						   PaisRepository paisRepository,
						   ProvinciaRepository provinciaRepository,
						   LocalidadRepository localidadRepository,
						   DomicilioRepository domicilioRepository,
						   EmpresaRepository empresaRepository,
						   SucursalRepository sucursalRepository,
						   PedidoRepository pedidoRepository,
						   DetallePedidoRepository detallePedidoRepository,
						   CategoriaRepository categoriaRepository,
						   PromocionRepository promocionRepository,
						   UnidadMedidaRepository unidadMedidaRepository,
						   ArticuloInsumoRepository articuloInsumoRepository,
						   ArticuloManuFacturadoRepository articuloManuFacturadoRepository,
						   ArticuloManuFacturadoDetalleRepository articuloManuFacturadoDetalleRepository,
						   PromocionDetalleRepository promocionDetalleRepository,
						   FacturaRepository facturaRepository){
		return args -> {
            Pais pais1 = Pais.builder()
                    .nombre("Argentina")
                    .build();
            paisRepository.save(pais1);

            Pais pais2 = Pais.builder()
                    .nombre("Uruguay")
                    .build();
            paisRepository.save(pais2);

            Provincia pro1 = Provincia.builder()
                    .nombre("Mendoza")
                    .pais(pais1)
                    .build();
            provinciaRepository.save(pro1);

            Provincia pro2 = Provincia.builder()
                    .nombre("Montevideo")
                    .pais(pais2)
                    .build();
            provinciaRepository.save(pro2);

            Localidad loc1 = Localidad.builder()
                    .nombre("Guaymallen")
                    .provincia(pro1)
                    .build();
            localidadRepository.save(loc1);

            Localidad loc2 = Localidad.builder()
                    .nombre("Maipu")
                    .provincia(pro2)
                    .build();
            localidadRepository.save(loc2);

            Domicilio dom1 = Domicilio.builder()
                    .calle("Av. San Martin")
                    .numero(7234)
                    .cp(3234)
                    .localidad(loc1)
                    .build();
            domicilioRepository.save(dom1);

            Domicilio dom2 = Domicilio.builder()
                    .calle("Av. San Juan")
                    .numero(3472)
                    .cp(3142)
                    .localidad(loc2)
                    .build();
            domicilioRepository.save(dom2);


            Empresa empresa1 = Empresa.builder()
                    .nombre("Amazon")
                    .razonSocial("Amazon EU SARL")
                    .cuil(325232322)
                    .build();
            empresaRepository.save(empresa1);

            Sucursal sucursal1 = Sucursal.builder()
                    .nombre("Sucursal 1")
                    .horarioApertura(LocalTime.of(8,30))
                    .horarioCierre(LocalTime.of(21, 30))
                    .casaMatriz(true)
                    .domicilio(dom1)
                    .empresa(empresa1)
                    .build();
            sucursalRepository.save(sucursal1);

            Sucursal sucursal2 = Sucursal.builder()
                    .nombre("Sucursal 2")
                    .horarioApertura(LocalTime.of(10,15))
                    .horarioCierre(LocalTime.of(23, 45))
                    .casaMatriz(false)
                    .domicilio(dom2)
                    .empresa(empresa1)
                    .build();
            sucursalRepository.save(sucursal2);

            Imagen ima1 = Imagen.builder()
                    .denominacion("Primera Imagen")
                    .build();
            imagenRepository.save(ima1);

            Imagen ima2 = Imagen.builder()
                    .denominacion("Segunda Imagen")
                    .build();
            imagenRepository.save(ima2);

            Usuario usu1 = Usuario.builder()
                    .auth0Id("pass")
                    .userName("matu012")
                    .build();
            usuarioRepository.save(usu1);

            Usuario usu2 = Usuario.builder()
                    .auth0Id("pass2")
                    .userName("santu345")
                    .build();
            usuarioRepository.save(usu2);

            Empleado empleado1 = Empleado.builder()
                    .rol(Rol.CLIENTE)
                    .imagenEmpleado(ima1)
                    .usuarioEmpleado(usu1)
                    .sucursal(sucursal1)
                    .build();
            empleado1.setNombre("Matias");
            empleado1.setApellido("Rodriguez");
            empleado1.setTelefono("2424124343");
            empleado1.setEmail("prueba@gmail.com");
            empleado1.setFechaDeNacimiento(LocalDate.of(1998, 2, 12));
            empleadoRepository.save(empleado1);

            Cliente cliente1 = Cliente.builder()
                    .domicilio(dom1)
                    .imagenCliente(ima2)
                    .usuarioCliente(usu2)
                    .build();
            cliente1.setNombre("Santiago");
            cliente1.setApellido("Benjamin");
            cliente1.setTelefono("8712381232");
            cliente1.setEmail("prueba2@gmail.com");
            cliente1.setFechaDeNacimiento(LocalDate.of(2008, 9, 30));
            clienteRepository.save(cliente1);

            Pedido ped1 = Pedido.builder()
                    .horaEstimadaFinalizacion(LocalTime.of(12,55))
                    .total(1231.34)
                    .totalCosto(170.0)
                    .estado(Estado.PENDIENTE)
                    .formaPago(FormaPago.EFECTIVO)
                    .tipoEnvio(TipoEnvio.DELIVERY)
                    .fechaPedido(LocalDate.of(2023,5,23))
                    .cliente(cliente1)
                    .empleado(empleado1)
                    .sucursal(sucursal1)
                    .domicilio(dom1)
                    .build();
            pedidoRepository.save(ped1);

            Pedido ped2 = Pedido.builder()
                    .horaEstimadaFinalizacion(LocalTime.of(8,45))
                    .total(38456.4)
                    .totalCosto(1231.0)
                    .estado(Estado.PENDIENTE)
                    .formaPago(FormaPago.EFECTIVO)
                    .tipoEnvio(TipoEnvio.DELIVERY)
                    .fechaPedido(LocalDate.of(2023,7,23))
                    .cliente(cliente1)
                    .empleado(empleado1)
                    .sucursal(sucursal2)
                    .domicilio(dom2)
                    .build();
            pedidoRepository.save(ped2);

            DetallePedido detalle1 = DetallePedido.builder()
                    .cantidad(7)
                    .subTotal(400.5)
                    .pedido(ped1)
                    .build();
            detallePedidoRepository.save(detalle1);

            DetallePedido detalle2 = DetallePedido.builder()
                    .cantidad(5)
                    .subTotal(290.6)
                    .pedido(ped2)
                    .build();
            detallePedidoRepository.save(detalle2);

            Categoria cat1 = Categoria.builder()
                    .denominacion("categoria 1")
                    .build();
            categoriaRepository.save(cat1);

            Categoria subCat1 = Categoria.builder()
                    .denominacion("Sub Categoria 1")
                    .categoriaPadre(cat1)
                    .build();

            categoriaRepository.save(subCat1);

            Categoria subCat2 = Categoria.builder()
                    .denominacion("Sub Categoria 2")
                    .categoriaPadre(cat1)
                    .build();
            categoriaRepository.save(subCat2);

            Imagen imgProm1 = Imagen.builder()
                    .denominacion("Imangen promo 1")
                    .build();
            imagenRepository.save(imgProm1);
            Imagen imgProm2 = Imagen.builder()
                    .denominacion("Imangen promo 2")
                    .build();
            imagenRepository.save(imgProm2);

            Promocion prom1 = Promocion.builder()
                    .denominacion("Promocion 1")
                    .descripcionDescuento("10% de descuento")
                    .fechaDesde(LocalDate.of(2024,6,12))
                    .fechaHasta(LocalDate.of(2024, 6, 25))
                    .horaDesde(LocalTime.of(20,30))
                    .horaHasta(LocalTime.of(23,30))
                    .precioDescuento(2500.5)
                    .tipoPromocion(TipoPromocion.HAPPYHOUR)
                    .imagenPromocion(imgProm1)
                    .build();
            promocionRepository.save(prom1);

            sucursal1.setPromocion(prom1);
            sucursalRepository.save(sucursal1);

            Promocion prom2 = Promocion.builder()
                    .denominacion("Promocion 2")
                    .descripcionDescuento("15% de descuento")
                    .fechaDesde(LocalDate.of(2024,6,12))
                    .fechaHasta(LocalDate.of(2024, 6, 25))
                    .horaDesde(LocalTime.of(11,30))
                    .horaHasta(LocalTime.of(14,30))
                    .precioDescuento(3000.0)
                    .tipoPromocion(TipoPromocion.HAPPYHOUR)
                    .imagenPromocion(imgProm2)
                    .build();
            promocionRepository.save(prom2);

            sucursal2.setPromocion(prom2);
            sucursalRepository.save(sucursal2);

            UnidadMedida unMedida = UnidadMedida.builder()
                    .denominacion("Unidad de medida 1")
                    .build();
            unidadMedidaRepository.save(unMedida);

            ArticuloInsumo artInsumo1 = ArticuloInsumo.builder()
                    .precioCompra(460.5)
                    .stockActual(36)
                    .stockMaximo(150)
                    .esParaElaborar(Boolean.TRUE)
                    .build();
            artInsumo1.setDenominacion("Articulo insumo 1");
            artInsumo1.setPrecioVenta(230.0);
            artInsumo1.setCategoria(cat1);
            artInsumo1.setUnidadMedida(unMedida);
            articuloInsumoRepository.save(artInsumo1);

            ArticuloManuFacturado artManuf1 = ArticuloManuFacturado.builder()
                    .descripcion("Descripcion art manuf 1")
                    .tiempoEstimadoMinutos(60)
                    .preparacion("Preparacion art manuf 1")
                    .build();
            artManuf1.setDenominacion("Articulo Manufacturado 1");
            artManuf1.setPrecioVenta(140.5);
            artManuf1.setCategoria(cat1);
            artManuf1.setUnidadMedida(unMedida);
            articuloManuFacturadoRepository.save(artManuf1);

            ArticuloManuFacturadoDetalle artManufDet1 = ArticuloManuFacturadoDetalle.builder()
                    .cantidad(2)
                    .articuloInsumo(artInsumo1)
                    .articuloManuFacturado(artManuf1)
                    .build();
            articuloManuFacturadoDetalleRepository.save(artManufDet1);

            PromocionDetalle promDetalle1 = PromocionDetalle.builder()
                    .cantidad(2)
                    .articulo(artManuf1)
                    .promocion(prom1)
                    .build();
            promocionDetalleRepository.save(promDetalle1);

            Factura factura1 = Factura.builder()
                    .fechaFacturacion(LocalDate.of(2024,6,8))
                    .mpPaymentId(123456)
                    .mpMerchantOrderId(789012)
                    .mpPreferenceId("MP1234567890")
                    .mpPaymentType("Credit Card")
                    .formaPago(FormaPago.EFECTIVO)
                    .totalVenta(150.0)
                    .build();
            facturaRepository.save(factura1);

            Factura fac1 = Factura.builder()
                    .fechaFacturacion(LocalDate.of(2024,6,8))
                    .mpPaymentId(123456)
                    .mpMerchantOrderId(789012)
                    .mpPreferenceId("MP1234567890")
                    .mpPaymentType("Credit Card")
                    .formaPago(FormaPago.EFECTIVO)
                    .totalVenta(150.0)
                    .build();
            facturaRepository.save(fac1);

            ped1.setFactura(fac1);
            pedidoRepository.save(ped1);

            // modificame la factura 2 con otros atributos.
            Factura fac2 = Factura.builder()
                    .fechaFacturacion(LocalDate.of(2024, 6, 9))
                    .mpPaymentId(456789)
                    .mpMerchantOrderId(123456)
                    .mpPreferenceId("MP0987654321")
                    .mpPaymentType("Debit Card")
                    .formaPago(FormaPago.MERCADOPAGO)
                    .totalVenta(200.0)
                    .build();
            facturaRepository.save(fac2);

            ped2.setFactura(fac2);
            pedidoRepository.save(ped2);
		};
	}

}
