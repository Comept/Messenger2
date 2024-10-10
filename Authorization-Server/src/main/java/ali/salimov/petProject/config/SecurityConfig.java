package ali.salimov.petProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.
EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.security.web.SecurityFilterChain;

import ali.salimov.petProject.model.User;
import ali.salimov.petProject.repository.UserRepository;

@EnableWebSecurity
public class SecurityConfig {
	  @Bean
	  SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
	          throws Exception {
	    return http
	      .authorizeHttpRequests(authorizeRequests ->
	        authorizeRequests.anyRequest().authenticated()
	      )
	      .formLogin()
	      .and()
	      .build();
	  }
	@Bean
	public PasswordEncoder passwordEncoder() {
		
	return new BCryptPasswordEncoder(); }

	 @Bean
	 public UserDetailsService userDetailsService(UserRepository userRepo) {
	  return email -> {
	    User user = userRepo.findByUsername(email);
	    if (user != null) return user;
	    throw new UsernameNotFoundException("User ‘" + email + "’ not found");
	  };
	 }

}