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


import com.konkow.arda.domain.knowledge.Knowledge;
import com.konkow.arda.repository.IKnowledgeRepository;

@Component
@Path("/knowledge")
public class KnowledgeApiService {

	
	@Autowired
	private IKnowledgeRepository kRepository;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	//@Transactional
	public Response getList()
	{
		List<Knowledge> result = kRepository.finAll();
		GenericEntity<List<Knowledge>> entity = new GenericEntity<List<Knowledge>>(result){};
		return Response.ok(entity).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{key}")
	//@Transactional
	public Response getDetail(@PathParam("key") Integer key)
	{
		Knowledge result= kRepository.findByKey(key);
		return Response.ok(result).build();
	}
}
