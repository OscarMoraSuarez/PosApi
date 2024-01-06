package com.NetTools.API.producto;

import java.math.BigDecimal;

public record DatosRegistroProducto(
        String codigo,
        String descripcion,
        Long categoriaId,
        String marca,
        BigDecimal precioEntrada,
        BigDecimal precioSalida,
        String imagePath


) {
}
