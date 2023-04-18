package com.market.ApiRest.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @Column(name = "id_producto")
    private Integer  idProducto;
    private  String  nombre;

    @Column(name = "id_categoria")
    private  Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigo_barras;

    @Column(name = "precio_venta")
    private Double precio_venta;

    @Column(name = "cantidad_stock")
    private  Integer cantidad_stock;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false,updatable = false)
    private Categoria categoria;

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setCantidad_stock(Integer cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


}
