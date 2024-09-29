//package ali.salimov.petProject.controller;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import ali.salimov.petProject.service.RegisteredClientService;
//import ali.salimov.petProject.model.RegisteredClientModel;
//@Controller
//@RequestMapping("/m")
//public class Test {
//	public final RegisteredClientService registeredClientService;
//
//    Test(RegisteredClientService registeredClientService) {
//        this.registeredClientService = registeredClientService;
//    }
//    
//	@GetMapping
//	public String get() {
//		RegisteredClientModel reg = new RegisteredClientModel();
//		reg.setId(UUID.randomUUID().toString());
//		reg.setClientId("SAd");
//		reg.setClientName("SDf");
//		reg.setClientSecret("dcs");
//		reg.addScopes("ASdasd");
//		registeredClientService.save(reg);
//		return "g.html";
//	}
//}
