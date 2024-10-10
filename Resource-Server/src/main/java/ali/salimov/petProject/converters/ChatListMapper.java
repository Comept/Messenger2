package ali.salimov.petProject.converters;

import org.mapstruct.Mapper;

import ali.salimov.petProject.dto.ChatDto;
import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.ChatParticipants;

//@Mapper(componentModel = "spring", uses = Chat.class)
public interface ChatListMapper {
	Iterable<Chat> toEntity(Iterable<ChatDto> dto);
	Iterable<ChatDto> toDto(Iterable<Chat> messages);
}
