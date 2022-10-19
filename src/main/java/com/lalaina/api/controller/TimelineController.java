package com.lalaina.api.controller;

import com.lalaina.api.model.Timeline;
import com.lalaina.api.service.TimelineService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/timeline")
public class TimelineController {

    @Inject
    TimelineService timelineService;

    @GET
    public List<Timeline> listAll(){
        return timelineService.listAll();
    }

    @GET
    @Path("/{id}")
    public Timeline get(@PathParam("id") Long id){
        return timelineService.findById(id);
    }

//    @GET
//    @Path("/{descricao}")
//    public List<Timeline> findByDescricao(@PathParam("descricao") String descricao){
//        return timelineService.findByDescricao(descricao);
//    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Timeline insert(Timeline timeline) throws Exception {
        return timelineService.persist(timeline);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        timelineService.deleteById(id);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public Timeline update(@PathParam("id") Long id, Timeline timeline){
        timelineService.update(id, timeline);
        return timeline;
    }

}
