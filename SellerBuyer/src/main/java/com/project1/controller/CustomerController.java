package com.project1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.exception.ResourceNotFoundException;
import com.project1.model.Customer;
import com.project1.repository.CustomerRepository;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:64352")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customer")
	public List<Customer> getAllEmployees(){
		return customerRepository.findAll(); 
	}
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer){
		return customerRepository.save(customer);
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
		Customer customer =customerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No data with this id"));
		return ResponseEntity.ok(customer);
	}
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,@RequestBody Customer customerDetails){
		Customer customer =customerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No data with this id"));
		customer.setCustomerName(customerDetails.getCustomerName());
		customer.setCustomerEmail(customerDetails.getCustomerEmail());
		customer.setCustomerAddress(customerDetails.getCustomerAddress());
		customer.setCustomerNumber(customerDetails.getCustomerNumber());
//		customer.setProduct_id(customerDetails.getProduct_id());
//		customer.setPrice(customerDetails.getPrice());
//		
		 Customer updatedCustomer = customerRepository.save(customer);
		return ResponseEntity.ok(updatedCustomer);
	}
	
		@DeleteMapping("/customer/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCustomer(@PathVariable Long id){
		Customer customer =customerRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("No data with this id"));
		
		customerRepository.delete(customer);
		Map<String, Boolean> response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
		

}
