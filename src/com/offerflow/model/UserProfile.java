package com.offerflow.model;

public class UserProfile {

    private String fullName;
    private String phoneNumber;
    private String city;
    private String profileImageUrl;
    private String biography;

    public UserProfile(String fullName, String phoneNumber, String address, String biography) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.city = address;
        this.biography = biography;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

}
