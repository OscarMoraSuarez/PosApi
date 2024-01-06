package com.NetTools.API.venta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRepository;

    @Transactional
    public DatosDetalleVenta registrar(DatosRegistroVenta datosRegistroVenta) {

        if (datosRegistroVenta == null) {
            // Utilizar un framework de logging como SLF4J con Logback o Log4j. Esto proporcionará un mejor control sobre la salida de log
            System.out.println("Los datos de la venta están vacíos");
            return null;
        }
        // Obtener el número de la última venta
        Optional<Long> ultimoNumeroVentaOptional = ventaRepository.findMaxNumeroVenta();
        Long ultimoNumeroVenta = ultimoNumeroVentaOptional.orElse(null);
        System.out.println("Último número de venta " + ultimoNumeroVenta);
        // Incrementar el número de la última venta
        Long nuevoNumeroVenta = incrementarNumeroVenta(ultimoNumeroVenta);
        System.out.println("Nuevo número de venta " + nuevoNumeroVenta);
        // Crear instancia de Venta
        Venta venta = new Venta(
                datosRegistroVenta.subtotal(),
                datosRegistroVenta.descuento(),
                datosRegistroVenta.total()
        );
        // Asignar el número de venta
        venta.setNumeroVenta(nuevoNumeroVenta);
        // Guardar la venta en la base de datos
        // Podrías capturar excepciones específicas (como DataAccessException)
        ventaRepository.save(venta);
        return new DatosDetalleVenta(nuevoNumeroVenta.intValue(), venta.getSubtotal(), venta.getDescuento(), venta.getTotal());
    }

    private Long incrementarNumeroVenta(Long ultimoNumeroVenta) {
        // Si no hay registros, establecer como 1
        if (ultimoNumeroVenta == null) {
            return 1L;
        } else {
            return ultimoNumeroVenta + 1;
        }
    }
}
