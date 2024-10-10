package ali.salimov.petProject.converters;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.User;
@Component
@Named("TypeTranslator")
public class TypeTranslator {
	@Named("UserToLong")
	public Long mapUserToLong(User user) {
		return user.getId();
	}
	@Named("LongToUser")
	public User mapLongToUser(Long id) {
		return new User(id);
	}
	
	@Named("ChatToLong")
	public Long mapChatToLong(Chat chat) {
		return chat.getId();
	}
	
	@Named("LongToChat")
	public Chat mapLongToChat(Long id) {
		return new Chat(id);
	}
}
