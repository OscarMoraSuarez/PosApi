package com.NetTools.API.ubicacion;

import com.NetTools.API.categoria.Categoria;

public record DatosDetalleUbicacion(
        Long id,
        String codigoUbicacion,
        Categoria categoria,
        String zona

        ) {
        public DatosDetalleUbicacion(Ubicacion ubicacion){

            this(ubicacion.getUbicacionId(),ubicacion.getCodigoUbicacion(),ubicacion.getCategoria(),ubicacion.getZona());

        }




}
