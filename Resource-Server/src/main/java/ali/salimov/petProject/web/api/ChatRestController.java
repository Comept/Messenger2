package ali.salimov.petProject.web.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController 
@RequestMapping(path="/api/chats",produces="application/json") 
@CrossOrigin(origins="http://authServer:9090")
public class ChatRestController {
	@PostMapping(consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public void CreateChat() {
		
	}
	
}
