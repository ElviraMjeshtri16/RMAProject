package com.balkatek.rma.resource;


import com.balkatek.rma.model.Status;
import com.balkatek.rma.service.StatusService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/statuses")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class StatusResource {
    StatusService statusService = new StatusService();
    @GET
    public List<Status> getStatuses() throws Exception {
        return  statusService.getAllStatuses();
    }

}
