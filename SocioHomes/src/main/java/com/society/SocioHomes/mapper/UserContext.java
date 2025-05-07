package com.society.SocioHomes.mapper;

import com.society.SocioHomes.entity.Roles;
import com.society.SocioHomes.entity.UserEntity;

public class UserContext {

    UserEntity userEntity;
    Roles rolesDetails;

    public Roles getRolesDetails() {
        return rolesDetails;
    }

    public void setRolesDetails(Roles rolesDetails) {
        this.rolesDetails = rolesDetails;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
