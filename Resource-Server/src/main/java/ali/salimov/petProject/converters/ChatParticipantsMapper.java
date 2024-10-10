package ali.salimov.petProject.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import ali.salimov.petProject.dto.ChatParticipantsDto;
import ali.salimov.petProject.model.ChatParticipants;
import ali.salimov.petProject.model.User;

@Mapper(componentModel = "spring", uses = User.class)
public interface ChatParticipantsMapper {
	ChatParticipants entity(ChatParticipantsDto dto);
	ChatParticipantsDto dto(ChatParticipants entity);
	
}
