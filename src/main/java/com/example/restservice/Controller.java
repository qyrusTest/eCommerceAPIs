package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/TokenGenerator")
	public ResponseEntity<?> tokenGen(@RequestParam(value = "Email") String email, @RequestParam(value = "Password") String password) {
		if(!email.contains("@") || !email.contains(".")) {
			return new ResponseEntity<String>("Enter Valid Email", HttpStatus.BAD_REQUEST);
		}
		String hiddenPassword = "*".repeat(password.length());
		return new ResponseEntity<>(new TokenGenerator(email, hiddenPassword, "Suq0gWRc505Oe1jkH8cXdZgZ4FTyHzE6vNp1Ba14FVbq9VfgEXo6oqgbP4gHjZwHcykPbH4xQoyLzRWL5mc9LL"), HttpStatus.OK);
	}
	

	@GetMapping("/product")
	public ResponseEntity<?> product(@RequestHeader(value = "Authorization") String authorization, @RequestParam(value = "Product") Long product) {
		if(!authorization.equals("Bearer Suq0gWRc505Oe1jkH8cXdZgZ4FTyHzE6vNp1Ba14FVbq9VfgEXo6oqgbP4gHjZwHcykPbH4xQoyLzRWL5mc9LL")) {
			return new ResponseEntity<String>("Unauthorized", HttpStatus.UNAUTHORIZED);
		}
		if(product > 3 || product < 1) {
			return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
		}
		int finalId = Integer.parseInt((""+(product * 113355)).substring(0, 6));
		return new ResponseEntity<>(new Product(finalId, "Product" + product, "Product " + product + " Description"), HttpStatus.OK);
	}
	
	@GetMapping("/price")
    public ResponseEntity<?> index(@RequestHeader(value = "Authorization") String authorization) {
		if(!authorization.equals("Bearer Suq0gWRc505Oe1jkH8cXdZgZ4FTyHzE6vNp1Ba14FVbq9VfgEXo6oqgbP4gHjZwHcykPbH4xQoyLzRWL5mc9LL")) {
			return new ResponseEntity<String>("Unauthorized", HttpStatus.UNAUTHORIZED);
		}
        
        List<String> plist = new ArrayList<String>();
        plist.add("Product1: $33.23");
        plist.add("Product2: $81.12");
        plist.add("Product3: $70.11");
        return new ResponseEntity<>(plist, HttpStatus.OK);
    }
	
	@PostMapping("/price")
	public ResponseEntity<?> totalPrice(@RequestBody Product product, @RequestParam(value = "Quantity") int quantity) {
		if(!(product.getId()==113355 && product.getProductName().equals("Product1") && product.getDescription().equals("Product 1 Description")) &&
				!(product.getId()==226710 && product.getProductName().equals("Product2") && product.getDescription().equals("Product 2 Description")) &&
				!(product.getId()==340065 && product.getProductName().equals("Product3") && product.getDescription().equals("Product 3 Description"))
				) {
			return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
		}
		if(quantity < 1) return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(new Price(product.getId(), product.getProductName(), quantity), HttpStatus.OK);
	}
	
	@PostMapping("/order")
	public ResponseEntity<?> createOrder(@RequestBody Product product, @RequestParam(value = "Quantity") int quantity, @RequestParam(value = "Email") String email, @RequestParam(value = "Password") String password, @RequestParam(value = "Customer") String customer, @RequestParam(value = "Address") String address, @RequestParam(value = "City") String city){
		if(!(product.getId()==113355 && product.getProductName().equals("Product1") && product.getDescription().equals("Product 1 Description")) &&
				!(product.getId()==226710 && product.getProductName().equals("Product2") && product.getDescription().equals("Product 2 Description")) &&
				!(product.getId()==340065 && product.getProductName().equals("Product3") && product.getDescription().equals("Product 3 Description"))
				) {
			return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
			
		}
		
		if(quantity < 1) return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
		
		if(!email.equals("Admin@test.com") || !password.equals("Testingkey123")) {
			return new ResponseEntity<String>("Forbidden", HttpStatus.FORBIDDEN);
		}
		
		return new ResponseEntity<>(new Order(customer, address, product.getProductName(), city, product.getId(), quantity), HttpStatus.OK);
	}
	
	@PostMapping("/payment")
	public ResponseEntity<?> createPayment(@RequestBody Order order){
		if(!(order.getId()==113355 && order.getProductName().equals("Product1") && order.getStatus().equals("Success")) &&
				!(order.getId()==226710 && order.getProductName().equals("Product2") && order.getStatus().equals("Success")) &&
				!(order.getId()==340065 && order.getProductName().equals("Product3") && order.getStatus().equals("Success"))
				) {
			return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
			
		}
		
		return new ResponseEntity<>(new PaymentVendor(order.getStatus()), HttpStatus.OK);
	}

	@PostMapping("/ship")
	public ResponseEntity<?> createShipment(@RequestBody Order order){
		if(!(order.getId()==113355 && order.getProductName().equals("Product1") && order.getStatus().equals("Success")) &&
				!(order.getId()==226710 && order.getProductName().equals("Product2") && order.getStatus().equals("Success")) &&
				!(order.getId()==340065 && order.getProductName().equals("Product3") && order.getStatus().equals("Success"))
				) {
			return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
			
		}
		
		return new ResponseEntity<>(new ShippingVendor(order.getStatus()), HttpStatus.OK);
	}
}
