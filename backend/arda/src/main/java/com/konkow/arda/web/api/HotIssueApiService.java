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
import org.springframework.transaction.annotation.Transactional;

import com.konkow.arda.domain.hotissue.HotIssue;
import com.konkow.arda.repository.IHotIssueRepository;

@Component
@Path("/hotissue")
public class HotIssueApiService {

	
	@Autowired
	private IHotIssueRepository hRepository;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	//@Transactional
	public Response getList()
	{
		List<HotIssue> result= hRepository.finAll();
		GenericEntity<List<HotIssue>> entity = new GenericEntity<List<HotIssue>>(result){};
		return Response.ok(entity).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{key}")
	//@Transactional
	public Response getDetail(@PathParam("key") Integer key)
	{
		HotIssue result= hRepository.findByKey(key);
		return Response.ok(result).build();
	}
	
	
	
}
