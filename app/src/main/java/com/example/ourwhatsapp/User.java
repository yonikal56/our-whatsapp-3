package com.example.ourwhatsapp;

public class User {
    private final String userName;
    private final String profilePicture;
    private final String lastMassage;
    private final String lastMassageSendingTime;

    public User(String userName, String profilePicture, String lastMassage, String lastMassageSendingTime) {
        this.userName = userName;
        this.profilePicture = profilePicture;
        this.lastMassage = lastMassage;
        this.lastMassageSendingTime = lastMassageSendingTime;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getLastMassage() {
        return lastMassage;
    }

    public String getLastMassageSendingTime() {
        return lastMassageSendingTime;
    }

    public String getUserName() {
        return userName;
    }
}
