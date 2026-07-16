package com.coforge.entities;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Account {
	
	private long accNo;
	private String accHolderName;
	private String bankName;
	private String address;
	private double balance;

}
