package com.NetTools.API.venta;

import java.math.BigDecimal;

public record DatosDetalleVenta(

        Integer numeroVenta,
        BigDecimal subtotal,
        BigDecimal descuento,
        BigDecimal total

) {






}
