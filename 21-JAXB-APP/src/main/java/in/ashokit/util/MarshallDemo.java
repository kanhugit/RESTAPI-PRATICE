package in.ashokit.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ashokit.binding.Address;
import in.ashokit.binding.Person;

public class MarshallDemo {
	public static void main(String[] args) throws JAXBException {
		
		Address addr=new Address();
		addr.setCity("Hyd");
		addr.setState("Telengana");
		addr.setCountry("India");
		
		Person p=new Person();
		p.setId(101);
		p.setName("kanha");
		p.setGender("male");
		p.setEmail("beherakanha029@gmail.com");
		p.setAddr(addr);
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(p, new File("Person.xml"));
		
		System.out.println("Done...");
	}
}
