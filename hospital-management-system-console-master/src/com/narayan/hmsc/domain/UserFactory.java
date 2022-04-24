package com.narayan.hmsc.domain;

public class UserFactory {

    public User getUser(String userType) {
        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("DOCTOR")) {
            return new Doctor();
        } else if (userType.equalsIgnoreCase("ADMIN")) {
            return new Admin();

        } else if (userType.equalsIgnoreCase("RECEPTIONIST")) {
            return new Receptionist();
        }
        return null;
    }
}


