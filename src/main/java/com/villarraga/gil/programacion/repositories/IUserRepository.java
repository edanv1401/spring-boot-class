package com.villarraga.gil.programacion.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.villarraga.gil.programacion.entities.User;

@Repository
public interface IUserRepository  extends CrudRepository<User, Long>{
    Optional<User> findByUsernameAndPassword(String username, String password);
}
