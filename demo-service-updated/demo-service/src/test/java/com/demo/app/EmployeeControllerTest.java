package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.demo.app.controller.EmployeeController;
import com.demo.app.repository.EmployeeRepository;

@WebMvcTest(EmployeeController.class)
@ExtendWith(SpringExtension.class)
public class EmployeeControllerTest {

	
	@Autowired
	private WebApplicationContext webApp;
	
	
	@Autowired
	private MockMvc mvcMock;
	
	
	
	@Autowired
	EmployeeController empCont;

	
	@MockBean
	EmployeeRepository empRepo;
	
	
	//before each if anything 
	
	
	@Test
	void testGEtEmployee() {
		
		try {
			
			final MvcResult result=mvcMock.perform(MockMvcRequestBuilders.get("/demo/employee/{e1}")).andExpect(status().isOk()).andReturn();
			Assertions.assertEquals(result.getResponse().getStatus(),HttpStatus.OK.value());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	


}
