//package com.guestbook.model;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = DemoApplication.class)
//@WebAppConfiguration
//public class UserControllerTest {
//	
//	protected MockMvc mvc;
//	   @Autowired
//	   WebApplicationContext webApplicationContext;
//
//	   protected void setUp() {
//	      mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//	   }
//	   
//	   
//	   
//	   
//	   
//	
//	
//	
//	
//	
//	@Test
//	public void getUserListTest() throws Exception {
//	   String uri = "/indexadmin";
//	   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
//	      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
//	   
//	   int status = mvcResult.getResponse().getStatus();
//	   assertEquals(200, status);
//	   String content = mvcResult.getResponse().getContentAsString();
////	   User[] productlist =(content, User[].class);
////	   assertTrue(productlist.length > 0);
//	}
//
//
//}
