package ali.salimov.petProject.dto;

import java.util.Date;
import java.util.List;

import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.ChatParticipants;
import ali.salimov.petProject.model.Message;
import ali.salimov.petProject.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class ChatDto {
	  private final long id;
	  private final String chatName;
	  private final boolean isGroup;
	  private final List<ChatParticipantsDto> chatParticipants;
}
