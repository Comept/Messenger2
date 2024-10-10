package ali.salimov.petProject.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import ali.salimov.petProject.dto.MessageDto;
import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.Message;
import ali.salimov.petProject.model.User;

@Mapper(componentModel = "spring", uses = {UserMapper.class,TypeTranslator.class})
public interface MessageMapper {
	@Mapping(source = "chat", target = "chat", qualifiedByName = {"TypeTranslator", "LongToChat"})
	Message entity(MessageDto dto);
	@Mapping(source = "chat", target = "chat", qualifiedByName = {"TypeTranslator", "ChatToLong"})
	MessageDto dto(Message messenger);
}
