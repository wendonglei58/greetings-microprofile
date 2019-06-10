package com.drkiettran.microprofile.rest;

import java.net.UnknownHostException;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greetings")
public class HelloWorldEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{year}/{month}/{day}")
	public Response doGetDate(@PathParam("year") int year, @PathParam("month") int month, @PathParam("day") int day) {

		String date = year + "/" + month + "/" + day;
		Message message = new Message();
		message.setName("Thorntail");
		message.setMessage("Request date: " + date);
		message.setDate(new Date());
		return Response.status(200).entity(message).build();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/put")
	public Response doPutDate(Message inMessage) throws UnknownHostException {
		System.out.println("inMessage {}: " + inMessage);

		Message message = new Message();
		Greetings greetings = new Greetings();
		message.setName("Thorntail to " + inMessage.getName());
		message.setMessage(greetings.hello(inMessage.getName()));
		message.setDate(new Date());
		return Response.status(200).entity(message).build();
	}
}
