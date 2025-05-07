package com.society.SocioHomes.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Society")
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long SocietyId;
    String societyName;
    String societyAddress;
    String govtIdNo;
    String societyRegNo;
    Long noOfFlats;

    public Society(){

    }
    public Society(Long societyId, String societyAddress, String societyName, String govtIdNo, String societyRegNo, Long noOfFlats) {
        SocietyId = societyId;
        this.societyAddress = societyAddress;
        this.societyName = societyName;
        this.govtIdNo = govtIdNo;
        this.societyRegNo = societyRegNo;
        this.noOfFlats = noOfFlats;
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

    public String getGovtIdNo() {
        return govtIdNo;
    }

    public void setGovtIdNo(String govtIdNo) {
        this.govtIdNo = govtIdNo;
    }

    public String getSocietyRegNo() {
        return societyRegNo;
    }

    public void setSocietyRegNo(String societyRegNo) {
        this.societyRegNo = societyRegNo;
    }

    public Long getNoOfFlats() {
        return noOfFlats;
    }

    public void setNoOfFlats(Long noOfFlats) {
        this.noOfFlats = noOfFlats;
    }
}
