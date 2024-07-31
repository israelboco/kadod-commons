package com.kadod.kadod.ws;

import com.kadod.kadod.enums.PresenceEnum;
import lombok.Data;

@Data
public class JourWs {

    private String jour;
    private String mois;
    private String annee;
    private String hours;
    private PresenceEnum presence;

}
