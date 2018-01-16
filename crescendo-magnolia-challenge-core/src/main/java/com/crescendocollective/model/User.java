package com.crescendocollective.model;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private boolean joinMailingList;
    private String _pecid;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isJoinMailingList() {
        return joinMailingList;
    }

    public void setJoinMailingList(boolean joinMailingList) {
        this.joinMailingList = joinMailingList;
    }

    public String get_pecid() {
        return _pecid;
    }

    public void set_pecid(String _pecid) {
        this._pecid = _pecid;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", joinMailingList=" + joinMailingList +
                '}';
    }
}
