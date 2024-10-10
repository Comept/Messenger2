package ali.salimov.petProject.converters;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import ali.salimov.petProject.dto.ChatDto;
import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.ChatParticipants;
import ali.salimov.petProject.model.Message;

@Mapper(componentModel = "spring", uses = ChatParticipants.class)
public interface ChatMapper {
	ChatDto dto (Chat chat);
	Chat entity(ChatDto dto);
}
