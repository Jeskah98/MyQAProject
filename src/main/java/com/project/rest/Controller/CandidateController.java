package com.project.rest.Controller;

import com.project.rest.DTO.CandidateDTO;
import com.project.rest.Services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping(value = "/candinfo")
    public List<CandidateDTO> getCands() {

        return candidateService.getAllUsers();
    }

}
