package ali.salimov.petProject.web.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ali.salimov.petProject.dto.UserDto;
import ali.salimov.petProject.model.User;
import ali.salimov.petProject.service.UserService;
import lombok.Data;
@Data
@RestController 
@RequestMapping(path="/api/user")
public class UserRestController {
	private final UserService userService;
	@GetMapping
	public User get() {
		return userService.a();
	}
	@GetMapping("/findUserById")
	public User getUserById(@PathVariable("id") String id) {
		return userService.getUserById(UUID.fromString(id));
	}
	
	@GetMapping("/findUserByUsername")
	public UserDto getUserByUsername(@PathVariable("username") String username) {
		return userService.getUserByUsername(username);
	}
}
