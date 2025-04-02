package in.ashokit.util;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import in.ashokit.Passenger;
import in.ashokit.bindings.Address;

public class JavaToJson {
	
	public static void main(String[] args) throws Exception {
		
		Address addr=new Address();
		addr.setCity("Hyd");
		addr.setState("Odisha");
		addr.setCountry("India");
		
		Passenger passenger=new Passenger();
		passenger.setName("Raju");
		passenger.setForm("Hyd");
		passenger.setTo("Odisha");
		passenger.setGender("Male");
		passenger.setAddr(addr);
		
//		ObjectMapper mapper=new ObjectMapper();
//		mapper.writeValue(new  File("passenger.json"), passenger);
		
		Gson gson=new Gson();
		String json=gson.toJson(passenger);
		System.out.println(json);
		
		
		
		
		
		
		System.out.println("Done...");
	}
}
