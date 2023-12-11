package com.NetTools.API.ubicacion;

import com.NetTools.API.producto.Producto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UbicacionRepository extends JpaRepository<Ubicacion,Long> {
    Ubicacion findByUbicacionId(@NotNull @Valid Long ubicacionId);
}
