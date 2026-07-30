package com.coforge.enttities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	private String sname;
	private String branch;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="stud_subj",
			joinColumns = @JoinColumn(name="sid"),
			inverseJoinColumns = @JoinColumn(name="subId"))
	private List<Subject> subjectList;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId",referencedColumnName = "addrId")
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "student")
	@JsonManagedReference
	private LibraryCard libraryCard;
	

}
