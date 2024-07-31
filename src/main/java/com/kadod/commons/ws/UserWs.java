package com.kadod.commons.ws;

import lombok.Data;

import java.util.Set;

@Data
public class UserWs {

    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String company;
    private Integer enrollId;
    private Set<RoleWs> roles;

}
