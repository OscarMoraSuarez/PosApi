package com.NetTools.API.Ingreso;

import com.NetTools.API.producto.Producto;
import com.NetTools.API.producto.ProductoRepository;
import com.NetTools.API.ubicacion.Ubicacion;
import com.NetTools.API.ubicacion.UbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistroIngresoService {

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private UbicacionRepository ubicacionRepository;
    @Autowired
    private IngresoRepository inventarioRepository;

    @Transactional
    public DatosDetalleIngreso registrar(DatosRegistroIngreso datos) {

        Producto producto= productoRepository.findByProductoId(datos.productoId());
        Ubicacion ubicacion =ubicacionRepository.findByUbicacionId(datos.ubicacionId());

        if (producto==null){
            System.out.println("no existe un producto con ese id");
        }
        if (ubicacion==null){
            System.out.println("no existe una ubicacion con ese id");
        }
        var inventario=new Ingreso(producto,datos.cantidad(),ubicacion);
        inventarioRepository.save(inventario);
        return new DatosDetalleIngreso(inventario);

    }


}
