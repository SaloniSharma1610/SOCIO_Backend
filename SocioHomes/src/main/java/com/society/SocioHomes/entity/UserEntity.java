package com.society.SocioHomes.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long userId;
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


    @OneToOne(mappedBy = "user")
    private SocietyAdminEntity societyAdmin;

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

    public SocietyAdminEntity getSocietyAdmin() {
        return societyAdmin;
    }

    public void setSocietyAdmin(SocietyAdminEntity societyAdmin) {
        this.societyAdmin = societyAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(userId, that.userId) && Objects.equals(govtIdNo, that.govtIdNo) && Objects.equals(password, that.password) && Objects.equals(userAddress, that.userAddress) && Objects.equals(userContact, that.userContact) && Objects.equals(userEmail, that.userEmail) && Objects.equals(userName, that.userName) && Objects.equals(societyAdmin, that.societyAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, govtIdNo, password, userAddress, userContact, userEmail, userName, societyAdmin);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", govtIdNo='" + govtIdNo + '\'' +
                ", password='" + password + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userContact=" + userContact +
                ", userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", societyAdmin=" + societyAdmin +
                '}';
    }
}
