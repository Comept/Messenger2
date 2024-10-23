package ali.salimov.petProject.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class UserDto {
	private final String username;
	private final UUID id;
}
