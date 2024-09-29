package ali.salimov.petProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
	 Exception {
	 http
	 .authorizeHttpRequests(
			 authorizeRequests -> authorizeRequests.anyRequest().authenticated()
			 )
	 .oauth2Login(
	 oauth2Login ->
	 oauth2Login.loginPage("/oauth2/authorization/messanger-admin-client"))
	 .oauth2Client(Customizer.withDefaults());
	 return http.build();
	}

}