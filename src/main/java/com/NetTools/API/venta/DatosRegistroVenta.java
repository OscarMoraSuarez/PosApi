package com.NetTools.API.venta;

import java.math.BigDecimal;

public record DatosRegistroVenta(
        BigDecimal subtotal,
        BigDecimal descuento,
        BigDecimal total


) {
}
