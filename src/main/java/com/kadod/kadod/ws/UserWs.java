package com.kadod.kadod.ws;

import com.kadod.fingerprint.model.entities.Role;
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
    private Set<Role> roles;

}
