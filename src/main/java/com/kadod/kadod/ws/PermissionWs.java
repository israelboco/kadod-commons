package com.kadod.kadod.ws;
import com.kadod.fingerprint.model.enums.TypePermissionEnum;
import lombok.Data;

@Data
public class PermissionWs {
    private Integer id;
    private TypePermissionEnum type;
    private String description;
    private EmployeeWs employeeWs;
    private long startDateTimestamp;
    private long endDateTimestamp;
    private Boolean accepted;
}
