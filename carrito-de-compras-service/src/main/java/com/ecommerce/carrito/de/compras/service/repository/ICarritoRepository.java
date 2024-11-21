package com.ecommerce.carrito.de.compras.service.repository;

import com.ecommerce.carrito.de.compras.service.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarritoRepository extends JpaRepository<Carrito, Long>{
    
}
