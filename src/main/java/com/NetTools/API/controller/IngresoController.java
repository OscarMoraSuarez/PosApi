package com.NetTools.API.controller;

import com.NetTools.API.Ingreso.DatosRegistroIngreso;
import com.NetTools.API.Ingreso.RegistroIngresoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngresoController {

@Autowired
private RegistroIngresoService service;

@PostMapping("/inventario")
    public ResponseEntity RegistrarInventario(@RequestBody @Valid DatosRegistroIngreso datosRegistroInventario){
        var response= service.registrar(datosRegistroInventario);
        return ResponseEntity.ok(response);

    }
}
