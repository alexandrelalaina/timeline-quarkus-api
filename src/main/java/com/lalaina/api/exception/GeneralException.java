package com.lalaina.api.exception;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GeneralException implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {

        MessageError messageError = new MessageError();

        if (e instanceof CoreException){
            messageError.setCode(400);
            messageError.setMessage(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(messageError).build();
        }

        messageError.setCode(999);
        messageError.setMessage("Erro geral, contate o suporte..." + e.getMessage());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(messageError)
                .build();
    }
}
