package com.ecommerce.carrito.de.compras.service.service;

import com.ecommerce.carrito.de.compras.service.model.Carrito;
import java.util.List;

public interface ICarritoService {
    
    public void saveCarrito(Carrito carrito);
    
    public void deleteCarrito(Long idCarrito);
    
    public void editCarrito(Long idCarrito, Carrito nuevoCarrito);
    
    public Carrito findCarrito(Long idCarrito);
    
    public List<Carrito> getCarritos();
}
