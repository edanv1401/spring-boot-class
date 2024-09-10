package com.villarraga.gil.programacion.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.villarraga.gil.programacion.dto.UserDto;
import com.villarraga.gil.programacion.services.user.IUserService;

@Controller
public class UserController {
    private final IUserService service;

    public UserController(@Autowired IUserService service) {
        this.service = service;
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new UserDto());
        return "login";
    }

    @PostMapping("/sign-in")
    public ResponseEntity<Void> signPage(@ModelAttribute UserDto user, Model model) {
        UserDto userLogin = service.singIn(user);
        String url = userLogin  == null ? "login": "index";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Role-Auth", userLogin.getRole().getId().toString());
        headers.setLocation(URI.create(url));
        return new ResponseEntity<>(headers, HttpStatus.FOUND);
    }

    @GetMapping("/index")
    public String indexPage(@RequestHeader(value="Role-Auth") String roleAgent, Model model) {
        model.addAttribute("role", roleAgent);
        return "index";
    }
}
