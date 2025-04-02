package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.CustomerNotFoundException;

@RestController
public class CustomerRestController {
	@GetMapping("/customer/{customerId}")
	public String getCustomerName(@PathVariable Integer customerId) throws Exception{
		if(customerId >=100) {
			return "john";
		}else {
			throw new CustomerNotFoundException("Invalid Customer Id");
		}
		
		
	}
}
