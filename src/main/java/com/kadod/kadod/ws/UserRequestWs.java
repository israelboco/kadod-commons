package com.kadod.kadod.ws;

import lombok.Data;

import java.util.List;

@Data
public class UserRequestWs {

    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String company;
    private String password;
    private Integer enrollId;
    private List<Integer> idRoles;

}
