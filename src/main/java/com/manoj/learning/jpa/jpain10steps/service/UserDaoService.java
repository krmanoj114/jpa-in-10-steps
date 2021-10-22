package com.manoj.learning.jpa.jpain10steps.service;

import com.manoj.learning.jpa.jpain10steps.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        //Open transaction
        entityManager.persist(user);
        //Close transaction
        return user.getId();
    }
}
