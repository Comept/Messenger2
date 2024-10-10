package ali.salimov.petProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ali.salimov.petProject.repository.ChatParticipantsRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatParticipantsService {

	private final ChatParticipantsRepository chatParticipantsRepository;

	
}
