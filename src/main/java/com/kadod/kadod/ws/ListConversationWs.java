package com.kadod.kadod.ws;

import lombok.Data;

import java.util.List;

@Data
public class ListConversationWs {

    private EmployeeWs employeeWs;
    private List<ConversationWs> conversation;
    private Boolean nonLue;

}
