package com.society.SocioHomes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="roles")
public class Roles {
    @Id @GeneratedValue
    Long roleId;
    String userId;
    String societyId;
    String role;

    public Roles() {
    }

    public Roles(Long roleId, String userId, String role, String societyId) {
        this.roleId = roleId;
        this.userId = userId;
        this.role = role;
        this.societyId = societyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return Objects.equals(userId, roles.userId) && Objects.equals(societyId, roles.societyId) && Objects.equals(role, roles.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, societyId, role);
    }
}
