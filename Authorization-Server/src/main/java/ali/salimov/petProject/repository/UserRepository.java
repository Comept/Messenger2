package ali.salimov.petProject.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ali.salimov.petProject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	public User findByUsername(String username);
	public User findByEmail(String email);
	public List <User> findByIdIsIn(Collection<Long> usersId);
	public List <User> findByUsernameLike(String username);
}
