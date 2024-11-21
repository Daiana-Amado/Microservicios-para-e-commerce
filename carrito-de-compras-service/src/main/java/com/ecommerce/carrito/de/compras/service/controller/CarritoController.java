package com.ecommerce.carrito.de.compras.service.controller;

import com.ecommerce.carrito.de.compras.service.model.Carrito;
import com.ecommerce.carrito.de.compras.service.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrito")
public class CarritoController {
    
    @Autowired private CarritoService carritoServ;
    
    @PostMapping("/save")
    public String saveCarrito(@RequestBody Carrito carro){
        carritoServ.saveCarrito(carro);
        return "Carrito guardado correctamente";
    }
    
    
}
