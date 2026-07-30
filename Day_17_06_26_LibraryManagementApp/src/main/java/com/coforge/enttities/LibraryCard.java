package com.coforge.enttities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class LibraryCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cardId;
	private String cardNumber;
	private String issueDate;
	
	@OneToOne
	@JoinColumn(name="sid",referencedColumnName = "sid")
	@JsonBackReference
	private Student student;

}
