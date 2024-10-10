package ali.salimov.petProject.dto;

import java.util.Date;

import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.Message;
import ali.salimov.petProject.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class ChatParticipantsDto {
    private final UserDto user;
    private final String role;
    private Date joinedAt;
}
