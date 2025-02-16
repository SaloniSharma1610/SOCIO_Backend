package com.society.SocioHomes.model;


import java.util.Objects;

public class LoginDetails {

    Long userId;
    String userPassword;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LoginDetails that = (LoginDetails) o;
        return Objects.equals(userId, that.userId) && Objects.equals(userPassword, that.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userPassword);
    }

    @Override
    public String toString() {
        return "LoginDetails{" +
                "userId=" + userId +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
