package com.offerflow.model;

import java.util.ArrayList;

public abstract class User {

    private static int userId = 0;
    private String email;
    private String password;
    protected UserProfile profile;
    public static User currentUser;
    
    public User(String email, String pasword, UserProfile profile) {
        this.userId = userId++;
        this.email = email;
        this.password = pasword;
        this.profile = profile;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public String getEmail() {
        return email;
    }

    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(password)) {
            password = newPassword;
            return true;
        }
        return false;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String getRol();

    public abstract ArrayList<Offer> getOffers();
    
   

}
