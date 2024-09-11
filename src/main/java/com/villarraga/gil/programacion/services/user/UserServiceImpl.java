package com.villarraga.gil.programacion.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.villarraga.gil.programacion.dto.UserDto;
import com.villarraga.gil.programacion.repositories.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{
    private final IUserRepository repository;
    private ObjectMapper mapper;
    
    public UserServiceImpl(@Autowired IUserRepository repository) {
        this.repository = repository;
        this.passwordEncoder = new BCryptPasswordEncoder();
        mapper = new ObjectMapper();
    }
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDto singIn(UserDto user) {
        String encoderPassw = this.passwordEncoder.encode(user.getPassword());
        user.setPassword(encoderPassw);
        return mapper.convertValue(
            repository
            .findByUsernameAndPassword(user.getUsername(), user.getPassword())
            .orElse(null), 
        UserDto.class);


    }
    
}
