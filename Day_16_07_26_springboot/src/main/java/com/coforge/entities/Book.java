package com.coforge.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//modifications for webhook
public class Book { 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	
	@Size(min=3,message = "title can't be less than 3 chars")
	@NotBlank
	private String title;
	
	@NotBlank
	private String author;//findByAuthor(), getByAuthor()
	@Pattern(regexp = "^[6789][0-9]{9}$", message="Mobile number must start with either "
			+ "6/7/8/9 with a length of 10 digits")
	private String authorMobile;
	@Email(message = "Please enter valid email")
	private String email;
	@DecimalMin(value="100",inclusive = true, message="book min cost is 100 rs/-")
	private Double price;
	
}
