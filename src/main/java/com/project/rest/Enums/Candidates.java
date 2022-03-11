package com.project.rest.Enums;

public enum Candidates {
    None(0),
    Hillary (1),
    Rihanna (2),
    Michelle (3),
    ;

    private int voteReferenceNumber;
    Candidates(int VoteReferenceNumber) {
        this.voteReferenceNumber = VoteReferenceNumber;
    }

    public static Candidates getCandidate(int voteReferenceNumber) {
        for (Candidates person : Candidates.values()) {
            if (person.voteReferenceNumber == voteReferenceNumber)
                return person;
        }
        return Candidates.None;
    }

}
