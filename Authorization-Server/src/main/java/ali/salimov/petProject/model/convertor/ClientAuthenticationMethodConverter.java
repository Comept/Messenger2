package ali.salimov.petProject.model.convertor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClientAuthenticationMethodConverter implements 
	AttributeConverter<Set<ClientAuthenticationMethod>, Set<String>>{

	@Override
	public Set<String> convertToDatabaseColumn(Set<ClientAuthenticationMethod> attribute) {
		return	attribute.stream()
				.map(method -> method.getValue())
				.collect(Collectors.toCollection(HashSet::new));
	}

	@Override
	public Set<ClientAuthenticationMethod> convertToEntityAttribute(Set<String> dbData) {
		return dbData.stream()
				.map(method -> 
					switch(method) {
					case "client_secret_basic"->
							ClientAuthenticationMethod.CLIENT_SECRET_BASIC;
					case "client_secret_post" -> 
							ClientAuthenticationMethod.CLIENT_SECRET_POST;
					case "client_secret_jwt" ->
							ClientAuthenticationMethod.CLIENT_SECRET_JWT;
					case "private_key_jwt" -> 
							ClientAuthenticationMethod.PRIVATE_KEY_JWT;
					case "none" ->
							ClientAuthenticationMethod.NONE;
					case "tls_client_auth" ->
							ClientAuthenticationMethod.TLS_CLIENT_AUTH;
					case "self_signed_tls_client_auth" -> 
							ClientAuthenticationMethod.SELF_SIGNED_TLS_CLIENT_AUTH;
					default -> null;
				}).collect(Collectors.toCollection(HashSet::new));
	}

}
