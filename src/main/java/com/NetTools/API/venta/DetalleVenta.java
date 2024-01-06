package com.NetTools.API.venta;

import com.NetTools.API.producto.Producto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Table(name ="detalleVenta" )
@Entity(name = "DetalleVenta")

public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long detalleId;
    @ManyToOne
    @JoinColumn(name="ventaId",referencedColumnName = "ventaId")
    private Venta venta;

    @OneToOne
    private Producto producto;

    private Integer cantidad;

    private BigDecimal precioUnitario;

    private BigDecimal subtotal;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

}
