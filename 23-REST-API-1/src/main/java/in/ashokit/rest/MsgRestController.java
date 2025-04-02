package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	public MsgRestController() {
		System.out.println("Msg RestController:: Constructor");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg="Wellcome to REST API";
		return new ResponseEntity<>(msg,HttpStatus.OK);	
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg="Good Evening Baby..!!";
		return msg;
	}
}
