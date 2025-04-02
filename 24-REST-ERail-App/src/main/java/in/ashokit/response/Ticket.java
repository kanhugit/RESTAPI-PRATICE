package in.ashokit.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private Integer ticketId;
    private String from;
    private String to;
    private String trainNum;
    private String tktCost;
    private String ticketStatus;
}
