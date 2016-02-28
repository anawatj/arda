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

import com.konkow.arda.domain.question.Question;
import com.konkow.arda.repository.IQuestionRepository;

@Component
@Path("/question")
public class QuestionApiService {

	
		@Autowired
		private IQuestionRepository qRepository;
		
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/")
		//@Transactional
		public Response getList()
		{
			List<Question> result= qRepository.finAll();
			GenericEntity<List<Question>> entity =new GenericEntity<List<Question>>(result){};
			return Response.ok(entity).build();
		}
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("{key}")
		//@Transactional
		public Response getDetail(@PathParam("key") Integer key)
		{
			Question result= qRepository.findByKey(key);
			return Response.ok(result).build();
		}
}
