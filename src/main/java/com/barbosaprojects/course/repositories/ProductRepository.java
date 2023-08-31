package com.barbosaprojects.course.repositories;

import com.barbosaprojects.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
