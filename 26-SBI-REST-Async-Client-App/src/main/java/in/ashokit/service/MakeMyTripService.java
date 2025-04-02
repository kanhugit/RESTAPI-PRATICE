package in.ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MakeMyTripService {
	@org.springframework.beans.factory.annotation.Value("{irctc.endpoint.book.ticket}")
	private String TRCTC_BOOK_TICKET_URL;

	@org.springframework.beans.factory.annotation.Value("${irctc.endpoint.get.ticket}")
	private String IRCTC_GET_TICKET_URL;

	public void getTicketInfoSyn(Integer ticketId) {
		System.out.println("syn-Method excution start..");

		WebClient client = WebClient.create();
		String response = client.get().uri(IRCTC_GET_TICKET_URL, ticketId).accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToMono(String.class).block();
		System.out.println(response);
		System.out.println("Syn-Method excution End..");

	}

	public void getTicketInfoASyn(Integer ticketId) {
		System.out.println("Asyn-Method excution start..");

		WebClient client = WebClient.create();
		client.get()
		.uri(IRCTC_GET_TICKET_URL, ticketId)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(response -> handleResponse(response));

		System.out.println("ASyn-Method excution End..");
	}

	public void handleResponse(String response) {
		System.out.println(response);
	}

}
