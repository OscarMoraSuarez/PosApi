package com.NetTools.API.categoria;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    Categoria findByCategoriaId(@NotNull @Valid Long categoriaId);
}
