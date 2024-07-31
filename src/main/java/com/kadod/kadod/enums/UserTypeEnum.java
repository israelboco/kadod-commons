package com.kadod.kadod.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserTypeEnum {
    BO("Backoffice");

    private String type;

    public String getType() {
        return type;
    }
}
