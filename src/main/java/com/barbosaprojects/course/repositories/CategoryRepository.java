package com.barbosaprojects.course.repositories;

import com.barbosaprojects.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
