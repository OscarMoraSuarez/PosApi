package com.NetTools.API.controller;



import com.NetTools.API.producto.DatosRegistroProducto;

import com.NetTools.API.producto.Producto;
import com.NetTools.API.producto.ProductoRepository;
import com.NetTools.API.producto.RegistroDeProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {


    @Autowired
    private RegistroDeProductoService service;

    @PostMapping
    public ResponseEntity registrarProducto(@RequestBody @Valid DatosRegistroProducto datosRegistroProducto){

        var response=service.registrar(datosRegistroProducto);

        return ResponseEntity.ok(response);

    }


}
