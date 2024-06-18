package com.example.segundaApi.entities;

import com.example.segundaApi.entities.enums.FormaPago;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "factura")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends Base{
    @Column(name = "fecha_facturacion")
    private LocalDate fechaFacturacion;

    @Column(name = "mp_payment_id")
    private Integer mpPaymentId;

    @Column(name = "mp_merchant_order_id")
    private Integer mpMerchantOrderId;

    @Column(name = "mp_preference_id")
    private String mpPreferenceId;

    @Column(name = "mp_payment_type")
    private String mpPaymentType;

    @Column(name = "forma_pago")
    private FormaPago formaPago;

    @Column(name = "total_venta")
    private Double totalVenta;

}
