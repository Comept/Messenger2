package ali.salimov.petProject.dto;

import java.util.Date;

import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class MessageDto {
    private long id;
    private final Long chat;
	private final UserDto user;
    private final String messageText;
    @Builder.Default
    private Date sentedAt = new Date();
    
	public MessageDto(Long chat, UserDto sender, String messageText) {
		super();
		this.chat = chat;
		this.user = sender;
		this.messageText = messageText;
	}
}
