package ali.salimov.petProject.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ChatDto {
	  private final long id;
	  private final String chatName;
	  private final boolean isGroup;
	  private final List<ChatParticipantsDto> chatParticipants;
}
