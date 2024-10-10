package ali.salimov.petProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DesignMainPageController {

	@GetMapping
	public String getUserChats(Model model) {
		
		return "chat-list";
	}
}
