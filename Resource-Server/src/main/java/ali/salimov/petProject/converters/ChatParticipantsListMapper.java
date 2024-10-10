package ali.salimov.petProject.converters;

import java.util.List;

import org.mapstruct.Mapper;

import ali.salimov.petProject.dto.ChatParticipantsDto;
import ali.salimov.petProject.model.ChatParticipants;

@Mapper(componentModel = "spring", uses = ChatParticipants.class)
public interface ChatParticipantsListMapper {
	List<ChatParticipants> entityList(List<ChatParticipantsDto> dto);
	List<ChatParticipantsDto> dtoList(List<ChatParticipants> entityList);
}
