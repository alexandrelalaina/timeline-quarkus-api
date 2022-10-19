package com.lalaina.api.exception;

import lombok.Data;

@Data
public class MessageError {

    private int code;
    private String message;

}
