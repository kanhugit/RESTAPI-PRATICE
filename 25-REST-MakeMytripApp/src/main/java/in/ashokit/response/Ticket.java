package in.ashokit.response;

import lombok.Data;


@Data
public class Ticket {
	private Integer ticketId;
	private String from;
	private String to;
	private String ticketStatus;
	private String tktCost;
	private String trainNum;
	
	
	public Integer getTicketId() {
		return ticketId;
	}


	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getTicketStatus() {
		return ticketStatus;
	}


	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}


	public String getTktCost() {
		return tktCost;
	}


	public void setTktCost(String tktCost) {
		this.tktCost = tktCost;
	}


	public String getTrainNum() {
		return trainNum;
	}


	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", from=" + from + ", to=" + to + ", ticketStatus=" + ticketStatus
				+ ", tktCost=" + tktCost + ", trainNum=" + trainNum + "]";
	}
	
	
}
