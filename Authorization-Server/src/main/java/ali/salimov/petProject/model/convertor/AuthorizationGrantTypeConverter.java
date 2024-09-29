package ali.salimov.petProject.model.convertor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AuthorizationGrantTypeConverter implements 
	AttributeConverter<Set<AuthorizationGrantType>, Set<String>>{

	@Override
	public Set<String> convertToDatabaseColumn(Set<AuthorizationGrantType> attribute) {
		return	attribute.stream()
				.map(method -> method.getValue())
				.collect(Collectors.toCollection(HashSet::new));
	}

	@Override
	public Set<AuthorizationGrantType> convertToEntityAttribute(Set<String> dbData) {
		return dbData.stream()
				.map(method -> 
					switch(method) {
					case "authorization_code"->
						AuthorizationGrantType.AUTHORIZATION_CODE;
					case "refresh_token"->
						AuthorizationGrantType.REFRESH_TOKEN;
					case "client_credentials"->
						AuthorizationGrantType.CLIENT_CREDENTIALS;
					case "password"->
						AuthorizationGrantType.PASSWORD;
					case "urn:ietf:params:oauth:grant-type:jwt-bearer"->
						AuthorizationGrantType.JWT_BEARER;
					case "urn:ietf:params:oauth:grant-type:device_code" ->
						AuthorizationGrantType.DEVICE_CODE;
					case "urn:ietf:params:oauth:grant-type:token-exchange" ->
						AuthorizationGrantType.TOKEN_EXCHANGE;
					default -> null;
				}).collect(Collectors.toCollection(HashSet::new));
	}

}
