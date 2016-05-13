package com.balkatek.rma.exeption;

import com.balkatek.rma.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;


public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

    @Override
    public Response toResponse(Throwable e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), 500, "http://google.com");
        return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
    }
}
