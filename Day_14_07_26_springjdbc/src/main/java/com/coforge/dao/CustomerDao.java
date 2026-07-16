package com.coforge.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Customer;

@Repository
public class CustomerDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Customer> getAllCustomers() {
		
		String query="select * from customer";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper(Customer.class));
	}
	
	
	public int addCustomer(Customer customer) {
		String query="insert into customer values (?,?,?)";
		return jdbcTemplate.update(query,customer.getCId(),customer.getCName(),customer.getCity());
	}


	public Customer getCustomerById(long cid) {
		String query="select * from customer where cid=?";
		List<Customer> customers=jdbcTemplate.query(query, 
								new BeanPropertyRowMapper(Customer.class),
								cid);
		if(customers.isEmpty()) {
			return null;
		}
		return customers.get(0);	
	}
	
	public int updateCusotmer(Customer customer) {
		String query="update customer set cname=? ,city=? where cid=?";
		return jdbcTemplate.update(query,customer.getCName(),customer.getCity(),customer.getCId());
	}
	
	
	public int deleteCustomer(long cid)
	{
		String query="delete from customer where cid=?";
		return jdbcTemplate.update(query,cid);
	}
	
	
	

}
