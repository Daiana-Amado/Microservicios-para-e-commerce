package com.ecommerce.productos.service.controller;

import com.ecommerce.productos.service.model.Producto;
import com.ecommerce.productos.service.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired ProductoService produServ;
    
    @PostMapping("/save")
    public String saveProducto(@RequestBody Producto produ){
        produServ.saveProducto(produ);
        return "El producto se guardó correctamente";
    }
    
    @GetMapping("/find/{idProducto}")
    public Producto findProducto(@PathVariable Long idProducto){
        return produServ.findProducto(idProducto);
    }
    
    @GetMapping("/get/all")
    public List<Producto> getAll(){
        return produServ.getAllProductos();
    }
}
