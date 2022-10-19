package com.lalaina.api.exception;

import lombok.RequiredArgsConstructor;

import javax.ws.rs.ext.Provider;

public class CoreException extends RuntimeException{

    public CoreException(String mensagem){
        super(mensagem);
    }

}
