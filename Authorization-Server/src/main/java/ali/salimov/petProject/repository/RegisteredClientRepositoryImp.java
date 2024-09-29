//package ali.salimov.petProject.repository;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Optional;
//import java.util.Set;
//import java.util.UUID;
//
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
//
//import ali.salimov.petProject.model.RegisteredClientModel;
//
//public class RegisteredClientRepositoryImp implements RegisteredClientRepository {
//	private final RegisteredClientDAO registeredClientDAO;
//
//    public RegisteredClientRepositoryImp(RegisteredClientDAO registeredClientDAO) {
//        this.registeredClientDAO = registeredClientDAO;
//    }
//
//	@Override
//	public void save(RegisteredClient registeredClient) {
//		registeredClientDAO.save(registeredClient);
//	}
//
//	@Override
//	public RegisteredClient findById(String id) {
//		return registeredClientDAO.findById(id).get();
//	}
//
//	@Override
//	public RegisteredClient findByClientId(String clientId) {
//		return registeredClientDAO.findByClientId(clientId);
//	}
//}
