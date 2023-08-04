package com.cbfacademy.people;

import java.util.Optional;

public class ImmutablePerson {
    String firstname;
    Optional<String> middleName;
    String lastname;
    Optional<String> nicknames;

    public void ImmutablePerson(String firstname, Optional<String> middleName, String lastname,
            Optional<String> nicknames) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastname = lastname;
        this.nicknames = nicknames;
    }
}
