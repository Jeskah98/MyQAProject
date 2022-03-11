package com.project.rest.Controller;

import com.project.rest.DTO.UserDTO;
import com.project.rest.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/uservotes")
    public List<UserDTO> getVotes() {

        return userService.getAllUsers();
    }
}
