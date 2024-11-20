package com.ecommerce.productos.service.service;

import com.ecommerce.productos.service.model.Producto;

import java.util.List;

public interface IProductoService {

    public void saveProducto(Producto pro);

    public void deleteProducto(Long idProducto);

    public List<Producto> getAllProductos();

    public Producto findProducto(Long idProducto);

    public void editProducto(Long idProducto, Producto nuevoProducto);

    //public ProductoPredcioDTO getPrecioProducto(Long idProducto);

    //public ProductoStockDTO getStockProducto(Long idProducto);
}
