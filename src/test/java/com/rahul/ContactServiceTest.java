package com.rahul;

import static org.junit.jupiter.api.Assertions.assertNotNull;

//import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.rahul.repository.ContactDaoI;
import com.rahul.serviceImpl.ContactServiceImpl;

public class ContactServiceTest {
	
	public static ContactServiceImpl contactServiceImpl= null;

	
		@BeforeAll
		public static void inti() {
		
		//Dependent DAo mock
		
	/*	ContactDaoI daoproxy = EasyMock.createMock(ContactDaoI.class);
		
		EasyMock.expect(daoproxy.findNameById(101)).andReturn("kartik");
		EasyMock.expect(daoproxy.findNameById(102)).andReturn("Laxmi");
		EasyMock.expect(daoproxy.findNameById(103)).andReturn("Don");
		
		EasyMock.replay(daoproxy);
	
	//Create Object
	
	ContactServiceImpl contactServiceImpl = new ContactServiceImpl();
	contactServiceImpl.setContactDaoI(daoproxy);
	}
	

		@Test
		public void testfindByNameById() {
	String name = contactServiceImpl.getNameById(101);
	System.out.println(name);
	assertNotNull(name);
	}  */
	
}
}