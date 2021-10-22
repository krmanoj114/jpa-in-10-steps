package com.manoj.learning.jpa.jpain10steps;

import com.manoj.learning.jpa.jpain10steps.entity.User;
import com.manoj.learning.jpa.jpain10steps.service.UserDaoService;
import com.manoj.learning.jpa.jpain10steps.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        User save = userRepository.save(user);
        log.info("New user saved is :" +save);
        Optional<User> findWithId = userRepository.findById(1L);
        log.info("user found by id :" +findWithId);

        List<User> users = userRepository.findAll();
        log.info("All users :"+users);

    }
}
