package com.NetTools.API.producto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductoRepository extends JpaRepository<Producto, Long > {
    Producto findByProductoId(@NotNull @Valid Long productoId);
}
