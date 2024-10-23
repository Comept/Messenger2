package ali.salimov.petProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ChatListDto {
	  private long id;
	  private String chatName;
	  private boolean isGroup;
	  private String lastMessage;
}
