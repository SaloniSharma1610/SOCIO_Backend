package com.society.SocioHomes.model;

public class UserDetails {

    Long userId;
    String userName;
    String govtIdNo;
    String password;
    Long societyId;
    String userAddress;
    Long userContact;
    String userEmail;


    public UserDetails(Long userId, String userName, String govtIdNo, String password, Long societyId, String userAddress, Long userContact, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.govtIdNo = govtIdNo;
        this.password = password;
        this.societyId = societyId;
        this.userAddress = userAddress;
        this.userContact = userContact;
        this.userEmail = userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Long getSocietyId() {
        return societyId;
    }

    public void setSocietyId(Long societyId) {
        this.societyId = societyId;
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
}
