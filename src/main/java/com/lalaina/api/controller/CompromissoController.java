package com.lalaina.api.controller;

import com.lalaina.api.model.Compromisso;
import com.lalaina.api.service.CompromissoService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/compromissos")
@Produces(MediaType.APPLICATION_JSON)
public class CompromissoController {

    @Inject
    CompromissoService compromissoService;

    @GET
    public List<Compromisso> listAll(){
        return compromissoService.listAll();
    }

    @POST
    @Transactional
    public Compromisso insert(Compromisso compromisso){
        return compromissoService.persist(compromisso);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public Compromisso update(@PathParam("id") Long id, Compromisso compromisso){
        return compromissoService.update(id, compromisso);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        compromissoService.deleteById(id);
    }

}
