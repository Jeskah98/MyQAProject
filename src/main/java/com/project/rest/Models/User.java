package com.project.rest.Models;

import com.project.rest.Enums.Candidates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private int age;

    @Column
    private String occupation;

    @Column
    private int voteReferenceNumber;

    private String candidateName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getVoteCandidateName() {
        Candidates myCandidate = Candidates.getCandidate(voteReferenceNumber);
        return myCandidate.name();
    }

    public int getVoteReferenceNumber() { return voteReferenceNumber; }

    public void setVoteReferenceNumber(int voteReferenceNumber) {
        if (voteReferenceNumber > 3) {
            throw new IllegalArgumentException("Vote reference must be between 1 and 3");
        }
        if (voteReferenceNumber <1){
            throw  new IllegalArgumentException("Vote reference must be between 1 and 3");
        }
        this.voteReferenceNumber = voteReferenceNumber;
    }
}
