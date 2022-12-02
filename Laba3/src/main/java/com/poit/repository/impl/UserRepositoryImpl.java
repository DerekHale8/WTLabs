package com.poit.repository.impl;

import com.poit.criteria.Criteria;
import com.poit.dao.UserDAO;
import com.poit.repository.entity.User;
import com.poit.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    private final UserDAO userDAO;

    public UserRepositoryImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findByLogin(String login) {
        var criteria = new Criteria();
        criteria.add("name", login);
        try {
            return userDAO.find(criteria).get(0);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
