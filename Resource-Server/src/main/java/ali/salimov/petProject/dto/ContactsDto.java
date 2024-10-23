package ali.salimov.petProject.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ContactsDto {
	private final UserDto user;
    private Date createdAt;	
}
