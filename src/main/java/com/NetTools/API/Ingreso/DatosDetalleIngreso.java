package com.NetTools.API.Ingreso;

import com.NetTools.API.producto.Producto;
import com.NetTools.API.ubicacion.Ubicacion;

public record DatosDetalleIngreso(
        Long ingresoId,
       Producto producto,
        int cantidad,
        Ubicacion ubicacion
) {
    public DatosDetalleIngreso(Ingreso ingreso) {
        this(ingreso.getIngresoId(), ingreso.getProducto(),ingreso.getCantidad(),ingreso.getUbicacion());
    }

}
