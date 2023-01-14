package com.rahul.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.appconstant.ContactAppConstant;
import com.rahul.entity.Contact;
import com.rahul.props.AppProps;
import com.rahul.serviceImpl.ContactServiceImpl;



@RestController
@RequestMapping("/con")
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@Autowired
	private ContactAppConstant contactAppConstant;
	
	@Autowired
	private AppProps appProps;
	
	@GetMapping("/contact")
	public String loadControlform(Model model) {
		
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return ContactAppConstant.CONTACTINFO;
		
		
	}
	
	@PostMapping("/saveContact")
	public String saveContact(Contact contact, Model model) {
		
		boolean save = contactServiceImpl.saveContact(contact);
		
		Map<String, String> messages = appProps.getMessages();
		
		if(save) {
			model.addAttribute(ContactAppConstant.SUCCESS,messages.get(contactAppConstant.SAVE_SUCCESS));
		}else {
			model.addAttribute(ContactAppConstant.FAIL,messages.get(contactAppConstant.SAVE_FAIL));
		}
		return contactAppConstant.CONTACTINFO;
		
	}

}
