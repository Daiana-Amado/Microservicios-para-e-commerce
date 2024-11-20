package com.ecommerce.productos.service.repository;

import com.ecommerce.productos.service.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {

    //@Query("SELECT p FROM Person p WHERE p.email = :email")
    //Person findByEmail(@Param("email")String email);
}
