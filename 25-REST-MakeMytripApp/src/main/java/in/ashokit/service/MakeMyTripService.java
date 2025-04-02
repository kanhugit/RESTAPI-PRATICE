package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class MakeMyTripService {
	private static final String IRCTC_ENDPOINT_1="http://3.110.190.17:8080/ticket";
	
	private static final String IRCTC_ENDPOINT_2="http://3.110.190.17:8080/ticket/{ticketId}";
	
	public Ticket getTicketInfo(String ticketId) {
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> responseEntity = rt.getForEntity(IRCTC_ENDPOINT_2, Ticket.class,ticketId);
		int status = responseEntity.getStatusCodeValue();
		if(status==200) {
			Ticket ticket = responseEntity.getBody();
			return ticket;
		}
		return null;
		
	}

	public Ticket processTicketBooking(Passenger passenger) {
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> responseEntity = rt.postForEntity(IRCTC_ENDPOINT_1, passenger, Ticket.class);
		int statusCode = responseEntity.getStatusCodeValue();
		if(statusCode==200) {
			Ticket ticket = responseEntity.getBody();
			return ticket;
		}
		return null;
	}
}
