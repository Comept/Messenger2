package ali.salimov.petProject.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ali.salimov.petProject.model.User;

@Repository
public interface UserRepository  extends CrudRepository<User,UUID>{
	User findUserByUsername(String username);
}
