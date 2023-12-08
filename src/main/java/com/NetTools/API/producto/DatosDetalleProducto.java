package com.NetTools.API.producto;


import java.math.BigDecimal;

public record DatosDetalleProducto(Long id, String codigo, String descripcion, Long categoriaId, String marca, BigDecimal precioEntrada, BigDecimal precioSalida, String imagePath) {

    public DatosDetalleProducto(Producto producto) {
        this(producto.getProductoId(), producto.getCodigo(), producto.getDescripcion(), producto.getCategoria().getCategoriaId(), producto.getMarca(), producto.getPrecioEntrada(), producto.getPrecioSalida(), producto.getImagePath());
    }
}

