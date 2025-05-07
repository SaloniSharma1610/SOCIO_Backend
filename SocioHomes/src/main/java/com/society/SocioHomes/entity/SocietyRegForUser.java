package com.society.SocioHomes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SocietyRegUser")
public class SocietyRegForUser {
    @Id
    @GeneratedValue
    Long SocietyUserRegId;
    String societyId;
    String userId;
    String status;
    String requestedRole;
    String flatNo;

    public SocietyRegForUser(){}

    public SocietyRegForUser(Long societyUserRegId, String societyId, String userId, String status, String requestedRole, String flatNo) {
        SocietyUserRegId = societyUserRegId;
        this.societyId = societyId;
        this.userId = userId;
        this.status = status;
        this.requestedRole = requestedRole;
        this.flatNo = flatNo;
    }

    public Long getSocietyUserRegId() {
        return SocietyUserRegId;
    }

    public void setSocietyUserRegId(Long societyUserRegId) {
        SocietyUserRegId = societyUserRegId;
    }

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestedRole() {
        return requestedRole;
    }

    public void setRequestedRole(String requestedRole) {
        this.requestedRole = requestedRole;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }
}
