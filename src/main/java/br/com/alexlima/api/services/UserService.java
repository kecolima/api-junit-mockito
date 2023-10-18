package br.com.alexlima.api.services;

import br.com.alexlima.api.domain.User;
import br.com.alexlima.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
        User findById(Integer id);
        List<User> findAll();
        User create(UserDTO obj);

}
