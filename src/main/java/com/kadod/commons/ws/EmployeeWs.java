package com.kadod.commons.ws;

import lombok.Data;

@Data
public class EmployeeWs {

    private Integer id;
    private Integer enrollId;
    private Integer user_id;
    private String nom;
    private String prenom;
    private String fonction;
    private String telephone;
    private String email;
    private Integer idCompany;
    private String company;
    private byte[] imageProfile;
    private Boolean isAdmin;
    private String deviceSerial;

}
