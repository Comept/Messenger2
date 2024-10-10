package ali.salimov.petProject.service;

import org.springframework.stereotype.Service;

import ali.salimov.petProject.converters.ContactsListMapper;
import ali.salimov.petProject.converters.ContactsMapper;
import ali.salimov.petProject.dto.ContactsDto;
import ali.salimov.petProject.model.Contacts;
import ali.salimov.petProject.repository.ChatParticipantsRepository;
import ali.salimov.petProject.repository.ContactsRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContactsService {

	private final ContactsRepository contactRepo;
	private final ContactsMapper contactsMapper;
	private final ContactsListMapper contactsListMapper;

	
//	public Iterable<ContactsDto> getUserContacts(Long userId){
//		Iterable<Contacts> contacts = contactRepo.findAllByUser1Id(userId);
//		return contactsListMapper.dto(contacts);
//	}
	
	public void saveContact(ContactsDto contacts) {
		Contacts contact = contactsMapper.entity(contacts);
		contactRepo.save(contact);
	}
}
