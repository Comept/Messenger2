package ali.salimov.petProject.security;
 
import java.util.Date;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import ali.salimov.petProject.model.User;


@Component
public class RegistrationForm {
	private String username;
	private String email;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User toUser(PasswordEncoder passwordEncoder) {
		
		return new User(username, passwordEncoder.encode(password), email, new Date());
	}
	
	
}
