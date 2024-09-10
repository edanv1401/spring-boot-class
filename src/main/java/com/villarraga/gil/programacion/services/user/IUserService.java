package com.villarraga.gil.programacion.services.user;

import com.villarraga.gil.programacion.dto.UserDto;

public interface IUserService {    
    UserDto singIn(UserDto user);
}