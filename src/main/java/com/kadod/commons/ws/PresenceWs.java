package com.kadod.commons.ws;

import lombok.Data;

@Data
public class PresenceWs {

    private Integer id;
    private UserWs user;
    private EmployeeWs employeeWs;
    private long dateTimestamp;

}
