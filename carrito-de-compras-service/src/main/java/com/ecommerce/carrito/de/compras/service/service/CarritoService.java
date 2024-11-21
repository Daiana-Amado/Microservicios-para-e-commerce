package com.ecommerce.carrito.de.compras.service.service;

import com.ecommerce.carrito.de.compras.service.model.Producto;
import com.ecommerce.carrito.de.compras.service.model.Carrito;
import com.ecommerce.carrito.de.compras.service.repository.ICarritoRepository;
import com.ecommerce.carrito.de.compras.service.repository.ProductoClient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService implements ICarritoService{
    
    @Autowired ICarritoRepository carritoRepo;
    @Autowired ProductoClient productoApi;

    /*ACÁ SERÍA MEJOR RECIBIR MENOS PARÁMETROS DESDE LA API PRODUCTOS,
    POR EJEMPLO, QUE SÓLO NECESITE EL CÓDIGO DEL PRODUCTO (ID) Y AUTOMÁTICAMENTE
    LLENE LOS DATOS COMO NOMBRE, PRECIO Y STOCK PARA EL SERVICIO DE VENTAS.
    ASÍ SE AGILIZA EL PROCESO PARA EL CLIENTE*/
    @Override
    public void saveCarrito(Carrito carrito) {
        Carrito carritoLimpio = new Carrito();
        //recorro la lista de productos que quiero guardar en el carrito
        for(Producto listita : carrito.getListaProductos()){
            //llamo a los productos consumiendo la api externa
            Producto productoEncontrado = productoApi.traerProducto(listita.getIdProducto());
            //si los encuentra uno por uno, los va guardando en la lista del carrito
            if(productoEncontrado!=null){
                carritoLimpio.getListaProductos().add(productoEncontrado);
            }
        }        
        carritoRepo.save(carritoLimpio);
    }

    @Override
    public void deleteCarrito(Long idCarrito) {
        carritoRepo.deleteById(idCarrito);
    }

    @Override
    public void editCarrito(Long idCarrito, Carrito nuevoCarrito) {
        Carrito carritoEncontrado = carritoRepo.findById(idCarrito).orElse(null);
        if(carritoEncontrado!=null){
            carritoEncontrado.setListaProductos(nuevoCarrito.getListaProductos());
        }else{
            System.out.println("Carrito no encontrado");
        }
    }

    @Override
    public Carrito findCarrito(Long idCarrito) {
        return carritoRepo.findById(idCarrito).orElse(null);
    }

    @Override
    public List<Carrito> getCarritos() {
        return carritoRepo.findAll();
    }
    
}
