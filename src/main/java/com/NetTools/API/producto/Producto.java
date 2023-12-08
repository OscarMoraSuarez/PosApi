package com.NetTools.API.producto;

import com.NetTools.API.categoria.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name="producto")
@Entity(name = "Producto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="productoId")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    private String codigo;
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoriaId",referencedColumnName = "categoriaId")
    private Categoria categoria;
    private String marca;
    private BigDecimal precioEntrada;
    private BigDecimal precioSalida;
    private String imagePath;

    public Producto(String codigo,String descripcion,Categoria categoria,String marca,BigDecimal precioEntrada,BigDecimal precioSalida,String imagePath) {

        this.codigo=codigo;
        this.descripcion=descripcion;
        this.categoria=categoria;
        this.marca=marca;
        this.precioEntrada=precioEntrada;
        this.precioSalida=precioSalida;
        this.imagePath=imagePath;
    }
}

