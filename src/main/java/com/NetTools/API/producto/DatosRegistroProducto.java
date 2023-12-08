package com.NetTools.API.producto;

import java.math.BigDecimal;

import com.NetTools.API.categoria.DatosRegistroCategoria;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public record DatosRegistroProducto(

        @NotBlank
        String codigo,

        @NotBlank
        String descripcion,

        @NotNull
        @Valid
        Long categoriaId,

        String marca,

        @NotNull
        @DecimalMin(value = "0.0", inclusive = false)
        BigDecimal precioEntrada,

        @NotNull
        @DecimalMin(value = "0.0", inclusive = false)
        BigDecimal precioSalida,

        @NotBlank
        String imagePath) {

}
