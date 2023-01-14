package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.entity.Contact;

public interface ContactDaoI extends JpaRepository<Contact, Integer>{
	
	
}
