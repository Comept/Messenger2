//package ali.salimov.petProject.service;
//
//import java.util.Optional;
//
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
////import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
//import org.springframework.stereotype.Service;
//
//import ali.salimov.petProject.model.RegisteredClientModel;
//import ali.salimov.petProject.repository.RegisteredClientRepositoryImp;
//
//@Service
//public class RegisteredClientService {
//	private final RegisteredClientRepositoryImp registeredClientRepository;
//
//    public RegisteredClientService(RegisteredClientRepositoryImp registeredClientRepository) {
//        this.registeredClientRepository = registeredClientRepository;
//    }
//    
//    public void save(RegisteredClientModel regModel) {
//    	registeredClientRepository.save(regModel);
//    }
//    
//    public RegisteredClient findById(String id) {
//    		return registeredClientRepository.findById(id);
//    	}
//    public RegisteredClient findByClientId(String clientId) {
//    	return registeredClientRepository.findByClientId(clientId);
//    }
//}
