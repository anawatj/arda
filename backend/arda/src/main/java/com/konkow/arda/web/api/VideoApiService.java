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


import com.konkow.arda.domain.video.Video;
import com.konkow.arda.repository.IVideoRepository;

@Component
@Path("/video")
public class VideoApiService {

	
	@Autowired
	private IVideoRepository vRepository;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	//@Transactional
	public Response getList()
	{
		List<Video> result= vRepository.finAll();
		GenericEntity<List<Video>> entity = new GenericEntity<List<Video>>(result){};
		return Response.ok(entity).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{key}")
	//@Transactional
	public Response getDetail(@PathParam("key") Integer key)
	{
		Video result= vRepository.findByKey(key);
		return Response.ok(result).build();
		
	}
}
