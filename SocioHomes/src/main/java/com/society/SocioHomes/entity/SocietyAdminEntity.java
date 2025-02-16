package com.society.SocioHomes.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="Society_Admin")
public class SocietyAdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long SocietyId;
    String societyName;
    String societyAddress;
    String userName;
    String contactNo;
    String email;
    String address;
    String govtIdNo;
    String societyRegNo;
    String password;

    @OneToOne
    UserEntity user;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGovtIdNo() {
        return govtIdNo;
    }

    public void setGovtIdNo(String govtIdNo) {
        this.govtIdNo = govtIdNo;
    }

    public Long getSocietyId() {
        return SocietyId;
    }

    public void setSocietyId(Long societyId) {
        SocietyId = societyId;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getSocietyAddress() {
        return societyAddress;
    }

    public void setSocietyAddress(String societyAddress) {
        this.societyAddress = societyAddress;
    }

    public String getSocietyRegNo() {
        return societyRegNo;
    }

    public void setSocietyRegNo(String societyRegNo) {
        this.societyRegNo = societyRegNo;
    }

    @Override
    public String toString() {
        return "SocietyAdminEntity{" +
                "SocietyId=" + SocietyId +
                ", societyName='" + societyName + '\'' +
                ", societyAddress='" + societyAddress + '\'' +
                ", userName='" + userName + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", govtIdNo='" + govtIdNo + '\'' +
                ", societyRegNo='" + societyRegNo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SocietyAdminEntity that = (SocietyAdminEntity) o;
        return Objects.equals(SocietyId, that.SocietyId) && Objects.equals(societyName, that.societyName) && Objects.equals(societyAddress, that.societyAddress) && Objects.equals(userName, that.userName) && Objects.equals(contactNo, that.contactNo) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(govtIdNo, that.govtIdNo) && Objects.equals(societyRegNo, that.societyRegNo) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SocietyId, societyName, societyAddress, userName, contactNo, email, address, govtIdNo, societyRegNo, password);
    }
}
