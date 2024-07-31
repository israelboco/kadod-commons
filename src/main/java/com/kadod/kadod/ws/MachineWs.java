package com.kadod.kadod.ws;

import lombok.Data;

@Data
public class MachineWs {

    private Integer id;
    private String serialNo;
    private TypeMachineWs typeMachine;
    private String name;
    private String adressMac;
    private String adresseIp;
    private CompanieWs companie;
    private Boolean active;
    private long createdTimestamp;

}
