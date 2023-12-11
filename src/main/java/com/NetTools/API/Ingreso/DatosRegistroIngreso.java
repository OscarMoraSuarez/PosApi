package com.NetTools.API.Ingreso;

public record DatosRegistroIngreso(
        Long productoId,
        int cantidad,
        Long ubicacionId
) {
}
