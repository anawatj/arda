package com.konkow.arda.web.api;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.konkow.arda.domain.product.Product;
import com.konkow.arda.repository.IProductRepository;

@Component
@Path("/product")
public class ProductApiService {

	
	@Autowired
	private IProductRepository pRepository;
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response getList()
	{
		List<Product> result = pRepository.finAll();
		GenericEntity<List<Product>> entity = new GenericEntity<List<Product>>(result){};
		return Response.ok(entity).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{key}")
	public Response getDetail(@PathParam("key") Integer key)
	{
		Product result = pRepository.findByKey(key);
		return Response.ok(result).build();
	}
	
	
	
}
