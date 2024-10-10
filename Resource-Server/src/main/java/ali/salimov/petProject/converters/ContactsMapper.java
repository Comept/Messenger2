package ali.salimov.petProject.converters;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ali.salimov.petProject.dto.ContactsDto;
import ali.salimov.petProject.model.Contacts;
import ali.salimov.petProject.model.User;

@Mapper(componentModel = "spring", uses = User.class)
public interface ContactsMapper {
	@Mapping(source = "user", target = "user2Id")
	Contacts entity(ContactsDto dto);
	@Mapping(source = "user2Id", target = "user")
	ContactsDto dto(Contacts entity);
	
	
}
