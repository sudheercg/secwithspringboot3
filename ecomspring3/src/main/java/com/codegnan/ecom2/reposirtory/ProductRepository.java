package com.codegnan.ecom2.reposirtory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.ecom2.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
