package ali.salimov.petProject.service;

import org.springframework.stereotype.Service;

import ali.salimov.petProject.converters.MessageListMapper;
import ali.salimov.petProject.converters.MessageMapper;
import ali.salimov.petProject.dto.MessageDto;
import ali.salimov.petProject.dto.MessagesDto;
import ali.salimov.petProject.model.Chat;
import ali.salimov.petProject.model.Message;
import ali.salimov.petProject.repository.ChatParticipantsRepository;
import ali.salimov.petProject.repository.MessagesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessagesService {
	
	private final MessagesRepository messagesRepo;
	private final MessageMapper messagesMapper;
	private final MessageListMapper messagesListMapper;

	public Iterable<MessagesDto> getChatMessages(Long chatId){
		Iterable<Message> messages = messagesRepo.findAllByChatId(chatId);
		return messagesListMapper.toDto(messages);
	}
	
	public void saveMessage(MessageDto messageDto) {
		Message message = messagesMapper.entity(messageDto);
		messagesRepo.save(message);
	}
}
