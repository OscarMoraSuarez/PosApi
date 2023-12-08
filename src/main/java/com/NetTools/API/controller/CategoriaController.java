package com.NetTools.API.controller;

import com.NetTools.API.categoria.Categoria;
import com.NetTools.API.categoria.CategoriaRepository;
import com.NetTools.API.categoria.DatosRegistroCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @PostMapping
    public void registrarCategoria(@RequestBody DatosRegistroCategoria datosRegistroCategoria){
        Categoria categoria=new Categoria(datosRegistroCategoria);
        categoriaRepository.save(categoria);
    }

}
