package com.loginspringbootv2.demo.service.ServiceImpl;

import com.loginspringbootv2.demo.models.User;
import com.loginspringbootv2.demo.repository.UserRepository;
import com.loginspringbootv2.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user){return userRepository.save(user);}

    @Override
    public User getUserByUsername(String username){ return userRepository.findByUsername(username);}
}
