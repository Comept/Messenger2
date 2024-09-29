package ali.salimov.petProject.controller;


import java.util.Date;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ali.salimov.petProject.model.User;
import ali.salimov.petProject.repository.UserRepository;
import security.RegistrationForm;


@Controller 
@RequestMapping("/register")
public class DesignRegistrationController {
	
	private UserRepository userRepository;
	
	private PasswordEncoder passwordEncoder;
	
	public DesignRegistrationController(
		UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder; 
	}
	
	@GetMapping
	public String regForm() {
		userRepository.save(new User("q", passwordEncoder.encode("q"),"e", new Date()));
		return "registration.html"; 
	}
	
	@PostMapping
	public String processRegistration(RegistrationForm registrationForm) {
		userRepository.save(registrationForm.toUser(passwordEncoder));
		return "redirect:/login"; 
	}
}