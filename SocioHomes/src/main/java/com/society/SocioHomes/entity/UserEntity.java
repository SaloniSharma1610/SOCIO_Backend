package com.society.SocioHomes.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long userId;
    String fullName;
    @Column
    String govtIdNo;
    @Column
    String password;
    @Column
    String userAddress;
    @Column
    Long userContact;
    @Column
    String userEmail;
    @Column
    String userName;

    public UserEntity(){}

    public UserEntity(Long userId, String fullName, String govtIdNo, String password, String userAddress, Long userContact, String userEmail, String userName) {
        this.userId = userId;
        this.fullName = fullName;
        this.govtIdNo = govtIdNo;
        this.password = password;
        this.userAddress = userAddress;
        this.userContact = userContact;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGovtIdNo() {
        return govtIdNo;
    }

    public void setGovtIdNo(String govtIdNo) {
        this.govtIdNo = govtIdNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Long getUserContact() {
        return userContact;
    }

    public void setUserContact(Long userContact) {
        this.userContact = userContact;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
