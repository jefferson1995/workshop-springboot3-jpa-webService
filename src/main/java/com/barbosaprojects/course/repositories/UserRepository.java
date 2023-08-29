package com.barbosaprojects.course.repositories;

import com.barbosaprojects.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    Opcional adicionar a anotação
    @Respository
    Porque o JpaRepository já está registrado como um componente do spring
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
