package com.cg.rest.Springrest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("message")

public class Messageresource {

	MessageService msg=new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllmessages(){
        return msg.getAllmessages();
    }
	@GET
	@Path("{messageId}")

  @Produces(MediaType.APPLICATION_JSON)
	public Message getMessages(@PathParam("messageId") long id)
	{
		return msg.getMessages(id);
	}
	
	
}