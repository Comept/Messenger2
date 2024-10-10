package ali.salimov.petProject.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
public class MessagesDto {
    private long id;
	private long senderId;
    private String messageText;
    private Date sentedAt = new Date();	
}
