package com.ecommerce.productos.service.service;

import com.ecommerce.productos.service.model.Producto;
import com.ecommerce.productos.service.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository produRepo;

    @Override
    public void saveProducto(Producto pro) {
        produRepo.save(pro);
    }

    @Override
    public void deleteProducto(Long idProducto) {
        produRepo.deleteById(idProducto);
    }

    @Override
    public List<Producto> getAllProductos() {
        return produRepo.findAll();
    }

    @Override
    public Producto findProducto(Long idProducto) {
        Producto productoEncontrado = produRepo.findById(idProducto).orElse(null);
        return productoEncontrado;

    }

    @Override
    public void editProducto(Long idProducto, Producto nuevoProducto) {
        Producto produ = produRepo.findById(idProducto).orElse(null);
        if(produ!=null){
            produ.setNombreProducto(nuevoProducto.getNombreProducto());
            produ.setPrecioProducto(nuevoProducto.getPrecioProducto());
            produ.setStockProducto(nuevoProducto.getStockProducto());
            produ.setDescripcionProducto(nuevoProducto.getDescripcionProducto());
            produRepo.save(produ);
        }else{
            System.out.println("Producto no encontrado");
        }
    }
}
