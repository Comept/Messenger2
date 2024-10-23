package ali.salimov.petProject.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ChatParticipantsDto {
    private final UserDto user;
    private final String role;
    private Date joinedAt;
}
