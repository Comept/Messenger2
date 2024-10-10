package ali.salimov.petProject.service;

import org.springframework.stereotype.Service;

import ali.salimov.petProject.converters.UserMapper;
import ali.salimov.petProject.dto.UserDto;
import ali.salimov.petProject.model.User;
import ali.salimov.petProject.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepo;
	private final UserMapper userMap;
	
	public UserDto getUserById(Long id) {
		return userMap.dto(userRepo.findById(id).get());
	}
	public void saveUser(User user) {
		userRepo.save(user);
	}
}
