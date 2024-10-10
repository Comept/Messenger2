package ali.salimov.petProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ali.salimov.petProject.dto.UserDto;
import ali.salimov.petProject.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping(path="/user/") 
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping
	public UserDto getUserProfil() {
		return userService.getUserById(null);
	}
}
