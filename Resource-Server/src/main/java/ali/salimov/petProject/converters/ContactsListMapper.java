package ali.salimov.petProject.converters;

import java.util.List;

import org.mapstruct.Mapper;

import ali.salimov.petProject.dto.ContactsDto;
import ali.salimov.petProject.model.Contacts;
import ali.salimov.petProject.model.Message;

@Mapper(componentModel = "spring", uses = Contacts.class)
public interface ContactsListMapper {
	Iterable<Contacts> entity(Iterable<ContactsDto> dto);
	Iterable<ContactsDto> dto(Iterable<Contacts> contacts);
}
