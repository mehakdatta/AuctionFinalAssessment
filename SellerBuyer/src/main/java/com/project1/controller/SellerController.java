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
import com.project1.model.Seller;
import com.project1.repository.SellerRepository;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:64352")
public class SellerController {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@GetMapping("seller")
	public List<Seller> getAllEmployees(){
		return sellerRepository.findAll(); 
	}
	
	@PostMapping("/seller")
	public Seller createSeller(@RequestBody Seller seller){
		return sellerRepository.save(seller);
	}
	
	@GetMapping("/seller/{id}")
	public ResponseEntity<Seller> getSellerById(@PathVariable Long id) {
		Seller seller =sellerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No data with this id"));
		return ResponseEntity.ok(seller);
	}
	
	@PutMapping("/seller/{id}")
	public ResponseEntity<Seller> updateSeller(@PathVariable Long id,@RequestBody Seller sellerDetails){
		Seller seller =sellerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No data with this id"));
		seller.setSellerName(sellerDetails.getSellerName());
		seller.setSellerEmail(sellerDetails.getSellerEmail());
		// seller.setSellerPassword(sellerDetails.getSellerPassword());
		seller.setSellerAddress(sellerDetails.getSellerAddress());
		seller.setSellerNumber(sellerDetails.getSellerNumber());
		
		seller.setProductName(sellerDetails.getProductName());
		seller.setProductID(sellerDetails.getProductID());
		seller.setProductDescription(sellerDetails.getProductDescription());
		seller.setProductPrice(sellerDetails.getProductPrice());
		seller.setProductStartamt(sellerDetails.getProductStartamt());
		seller.setProductBiddingdate(sellerDetails.getProductBiddingdate());
		seller.setProductCategory(sellerDetails.getProductCategory());
		
		Seller updatedSeller = sellerRepository.save(seller);
		return ResponseEntity.ok(updatedSeller);
	}
		
		@DeleteMapping("/seller/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteSeller(@PathVariable Long id){
			Seller seller =sellerRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("No data with this id"));
			
			sellerRepository.delete(seller);
			Map<String, Boolean> response=new HashMap<>();
			response.put("deleted",Boolean.TRUE);
			return ResponseEntity.ok(response);
			
		}
		
		
		
	}
	


