package com.barbosaprojects.course.config;

import com.barbosaprojects.course.repositories.UserRepository;
import com.barbosaprojects.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

/*
    Configuração necessário para fazer os seed de dados no banco H2
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    //Tudo que está dentro será executado quando a aplicação for iniciada.
    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2)); //Salva uma lista no BD.

    }


}
