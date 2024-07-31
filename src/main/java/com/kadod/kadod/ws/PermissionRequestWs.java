package com.kadod.kadod.ws;
import com.kadod.fingerprint.model.enums.TypePermissionEnum;
import lombok.Data;

@Data
public class PermissionRequestWs {
    private Integer id;
    private TypePermissionEnum type;
    private String description;
    private Integer employeeId;
    private Integer startDateTimestamp;
    private Integer endDateTimestamp;
    private Boolean accepted;
}
