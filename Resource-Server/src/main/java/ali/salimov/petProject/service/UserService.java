package ali.salimov.petProject.service;

import java.util.UUID;

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
	
	public User getUserById(UUID id) {
		return userRepo.findById(id).get();
	}
	public UserDto getUserByUsername(String username) {
		return userMap.dto(userRepo.findUserByUsername(username));
	}
	public void saveUser(User user) {
		userRepo.save(user);
	}
	public User a() {
		User user = new User().builder().id(UUID.randomUUID()).email(UUID.randomUUID().toString()).username(UUID.randomUUID().toString()).build();
		userRepo.save(user);
		return user;
	}
}
