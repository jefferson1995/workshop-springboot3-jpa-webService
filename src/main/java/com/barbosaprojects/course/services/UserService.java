package com.barbosaprojects.course.services;

import com.barbosaprojects.course.entities.User;
import com.barbosaprojects.course.repositories.UserRepository;
import com.barbosaprojects.course.services.exceptions.DatabaseException;
import com.barbosaprojects.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Long id){
        try {
            userRepository.deleteById(id);

        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
            //e.printStackTrace(); para verificar qual exceção é lançada e criar o tratamento
        }

    }

    public User update(Long id, User obj){
        User entity = userRepository.getReferenceById(id); //Traz o objeto monitorado
        updateData(entity, obj);
        return userRepository.save(entity);

    }

    //Método auxiliar para atualizar o user
    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }

}
