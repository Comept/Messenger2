package ali.salimov.petProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	 @Bean
	 SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws
	      Exception {
	  http
	    .authorizeHttpRequests(
	        authorizeRequests -> 
	        authorizeRequests
	        	.anyRequest().authenticated()
	    )
	    .oauth2Login(
	      oauth2Login ->
	      oauth2Login//.loginPage("/oauth2/authorization/messanger-admin-client")
	      .defaultSuccessUrl("/")
  		.failureUrl("/fail"))
	    .oauth2Client(withDefaults());
	  return http.build();
	 }
}
