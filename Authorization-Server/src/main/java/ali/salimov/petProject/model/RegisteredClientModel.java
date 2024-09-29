//package ali.salimov.petProject.model;
//
//import java.io.Serializable;
//import java.time.Instant;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//
//import org.springframework.data.annotation.Transient;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
//import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;
//import org.springframework.security.oauth2.server.authorization.settings.TokenSettings;
//
//import ali.salimov.petProject.model.convertor.AuthorizationGrantTypeConverter;
//import ali.salimov.petProject.model.convertor.ClientAuthenticationMethodConverter;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.CollectionTable;
//import jakarta.persistence.Column;
//import jakarta.persistence.Convert;
//import jakarta.persistence.ElementCollection;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Setter
//@Getter
//@EqualsAndHashCode(of = "id")
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@ToString
//public class RegisteredClientModel extends RegisteredClient{
//	@Transient
//	private static final long serialVersionUID = -3576881386623896822L;
//	@Id
//	private String id;
//	@Column(name = "client_id", unique=true, nullable = false)
//	private String clientId;
//	@Column(name = "client_secret", nullable = false)
//	private String clientSecret;
//	@Column(name = "client_name", nullable = false)
//	private String clientName;
//	
//	@Convert(converter = ClientAuthenticationMethodConverter.class)
//	@ElementCollection
//	@CollectionTable(name="client_authentication_methods", joinColumns = @JoinColumn(name = "reg_id"))
//	private Set<ClientAuthenticationMethod> clientAuthenticationMethods 
//		= new HashSet<ClientAuthenticationMethod>();
//	
//	@Convert(converter = AuthorizationGrantTypeConverter.class)
//	@ElementCollection
//	@CollectionTable(name="authorization_grant_types", joinColumns = @JoinColumn(name = "reg_id"))
//	private Set<AuthorizationGrantType> authorizationGrantTypes 
//		= new HashSet<AuthorizationGrantType>();
//	@ElementCollection
//	@CollectionTable(name="redirect_uris", joinColumns = @JoinColumn(name = "reg_id"))
//	private Set<String> redirectUris 
//		= new HashSet<String>();
//	@ElementCollection
//	@CollectionTable(name="post_logout_redirect_uris", joinColumns = @JoinColumn(name = "reg_id"))
//	private Set<String> postLogoutRedirectUris 
//		= new HashSet<String>();
//	@ElementCollection
//	@CollectionTable(name="scopes", joinColumns = @JoinColumn(name = "reg_id"))
//	private Set<String> scopes 
//		= new HashSet<String>();
//	
//	@Transient
//	private Instant clientIdIssuedAt;
//	@Transient
//	private Instant clientSecretExpiresAt;
//	@Transient
//	private ClientSettings clientSettings = ClientSettings.builder()
//	.requireProofKey(true).requireAuthorizationConsent(true).build();
//	@Transient
//	private TokenSettings tokenSettings = TokenSettings.builder().build();
//	
//	public void addRedirectUris(String redirectUris) {
//		this.redirectUris.add(redirectUris);
//	}
//	public void addPostLogoutRedirectUris(String uri) {
//		this.postLogoutRedirectUris.add(uri);
//	}
//	public void addScopes(String scopes) {
//		this.scopes.add(scopes);
//	}
//	
//	
//	
//	@Override
//	public Instant getClientIdIssuedAt() {
//		return this.clientIdIssuedAt;
//	}
//	@Override
//	public Instant getClientSecretExpiresAt() {
//		return this.clientSecretExpiresAt;
//	}
//	@Override
//	public ClientSettings getClientSettings() {
//		return this.clientSettings;
//	}
//	@Override
//	public TokenSettings getTokenSettings() {
//		return this.tokenSettings;
//	}
//
//	
//	
//}
