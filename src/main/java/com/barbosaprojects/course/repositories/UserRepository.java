package com.barbosaprojects.course.repositories;

import com.barbosaprojects.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
