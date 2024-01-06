package com.NetTools.API.producto;

import com.NetTools.API.categoria.Categoria;
import com.NetTools.API.categoria.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistroDeProductoService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProductoRepository productoRepository;
    @Transactional
    public DatosDetalleProducto registrar(DatosRegistroProducto datos){

        Categoria categoria = seleccionarCategoria(datos);

        if (categoria == null) {
            System.out.println("No existe esa categoria");
            // Aquí deberías manejar el caso en el que la categoría no existe.
        }

        Producto producto = new Producto(
                datos.codigo(),
                datos.descripcion(),
                categoria,
                datos.marca(),
                datos.precioEntrada(),
                datos.precioSalida(),
                datos.imagePath()
        );

        productoRepository.save(producto);

        return new DatosDetalleProducto(
                producto.getProductoId(),
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getCategoria().getCategoriaId(),
                producto.getMarca(),
                producto.getPrecioEntrada(),
                producto.getPrecioSalida(),
                producto.getImagePath()
        );
    }

    private Categoria seleccionarCategoria(DatosRegistroProducto datos) {
        if (datos.categoriaId() != null) {
            return categoriaRepository.findByCategoriaId(datos.categoriaId());
        }
        return null;
    }

}




