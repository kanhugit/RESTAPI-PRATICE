package in.ashokit;

import in.ashokit.bindings.Address;

public class Passenger {
	private String name;
	private String form;
	private String to;
	private String gender;
	private Address addr;
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", form=" + form + ", to=" + to + ", gender=" + gender + ", addr=" + addr
				+ "]";
	}
	
	
	
	
}
