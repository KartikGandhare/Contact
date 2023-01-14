package com.rahul.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Contact_Details")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer contactid;
	
	@Column(name="Contact_Name")
	private String contactname;
	
	@Column(name="Contact_Number")
	private Long contactnumber;
	
	@Column(name="Contact_Email")
	private String contactemail;
	
	@Column(name="Contact_date",updatable = false)
	@UpdateTimestamp
	private LocalDate createddate;
	
	@Column(name="Update",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedate;
	
	@Column(name="isactive_switch")
	private Character isactive;
	
	

}
