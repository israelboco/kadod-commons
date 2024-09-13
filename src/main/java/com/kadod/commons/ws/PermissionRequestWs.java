package com.kadod.commons.ws;
import com.kadod.commons.enums.TypePermissionEnum;
import lombok.Data;

@Data
public class PermissionRequestWs {
    private Integer id;
    private TypePermissionEnum type;
    private String description;
    private Integer employeeId;
    private Integer startDateTimestamp;
    private Integer endDateTimestamp;
    private String objet;
    private String path;
    private Boolean accepted;
}
