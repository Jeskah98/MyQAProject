package com.project.rest.Services;

import com.project.rest.DTO.UserDTO;
import com.project.rest.Models.User;
import com.project.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UserDTO> getAllUsers() {
        return userRepo.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }

    private UserDTO convertEntityToDTO(User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setVoteReferenceNumber(user.getVoteReferenceNumber());

        return userDTO;
    }
}
