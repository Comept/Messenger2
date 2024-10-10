package ali.salimov.petProject.dto;

import java.util.Date;

import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.Message;
import ali.salimov.petProject.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class ContactsDto {
	private final UserDto user;
    private Date createdAt;	
}
