package com.konkow.arda.web.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.konkow.arda.domain.archievement.Archievement;
import com.konkow.arda.repository.IArchievementRepository;

@Component
@Path("/archievement")
public class ArchievementApiService {

	
	@Autowired
	private IArchievementRepository aRepository;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response getList()
	{
		List<Archievement> result = aRepository.finAll();
		GenericEntity<List<Archievement>> entity = new GenericEntity<List<Archievement>>(result){};
		return Response.ok(entity).build();
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{key}")
	public Response getDetail(@PathParam("key") Integer key)
	{
		Archievement result = aRepository.findByKey(key);
		return Response.ok(result).build();
		
	}
}
