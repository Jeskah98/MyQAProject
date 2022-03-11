package com.project.rest.Services;

import com.project.rest.DTO.CandidateDTO;
import com.project.rest.Enums.Candidates;
import com.project.rest.Models.User;
import com.project.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateService {

    @Autowired
    private UserRepo userRepo;

    public List<CandidateDTO> getAllUsers() {
        return userRepo.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }

    private CandidateDTO convertEntityToDTO(User candidatesUser) {

        CandidateDTO candidateDTO = new CandidateDTO();
        candidateDTO.setId(candidatesUser.getId());
        candidateDTO.setLastName(candidatesUser.getLastName());
        candidateDTO.setCandidateName(getCandidateName(candidatesUser.getVoteReferenceNumber()));

        return candidateDTO;
    }

    private String getCandidateName(int voteReferenceNumber) {
        return Candidates.getCandidate(voteReferenceNumber).name();
    }
}
