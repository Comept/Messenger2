package ali.salimov.petProject.converters;

import org.mapstruct.Mapper;

import ali.salimov.petProject.dto.MessagesDto;
import ali.salimov.petProject.model.Message;

@Mapper(componentModel = "spring", uses = Message.class)
public interface MessageListMapper {

	Iterable<MessagesDto> toDto(Iterable<Message> messages);
	
}
