package com.ecommerce.carrito.de.compras.service.repository;

import com.ecommerce.carrito.de.compras.service.model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="productos-service")
public interface ProductoClient {
    
    @GetMapping("/find/{idProducto}")
    public Producto traerProducto(@PathVariable("idProducto") Long idProducto);

}