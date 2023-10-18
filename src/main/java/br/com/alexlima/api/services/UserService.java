package br.com.alexlima.api.services;

import br.com.alexlima.api.domain.User;

import java.util.List;

public interface UserService {
        User findById(Integer id);
        List<User> findAll();

}
