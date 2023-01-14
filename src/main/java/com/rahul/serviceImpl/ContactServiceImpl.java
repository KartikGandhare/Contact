package com.rahul.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.appconstant.ContactAppConstant;
import com.rahul.entity.Contact;
import com.rahul.repository.ContactDaoI;
import com.rahul.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactDaoI contactDaoI;
	
	


	@Override
	public boolean saveContact(Contact contact) {
		
	contact.setIsactive(ContactAppConstant.YES); 
		
    Contact save = this.contactDaoI.save(contact);
    
    if(save != null && save.getContactid() != null) {
    	
    	return true;
    }
    
		return false ;
	}


	

	

}
