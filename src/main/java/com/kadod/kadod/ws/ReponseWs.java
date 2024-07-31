package com.kadod.kadod.ws;

import lombok.Data;


@Data
public class ReponseWs {

    private Integer id;
    private String status;
    private String message;
    private Integer code;
    private Object data;

    public ReponseWs(String status, String message, Integer code, Object data){
        this.status = status;
        this.message = message;
        this.code = code;
        this.data = data;
    }
    public ReponseWs(){
    }

}
