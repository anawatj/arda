package com.konkow.arda.web.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.konkow.arda.domain.news.News;
import com.konkow.arda.repository.INewsRepository;

@Component
@Path("/news")
public class NewsApiService {

	@Autowired
	private INewsRepository nRepository;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response getList()
	{
		List<News> result = nRepository.finAll();
		GenericEntity<List<News>> entity =  new GenericEntity<List<News>>(result) {};
		
		return Response.ok(entity).build();
		
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{key}")
	public Response getDetail(@PathParam("key") Integer key)
	{
		News result = nRepository.findByKey(key);
		return Response.ok(result).build();
	}
	
}
