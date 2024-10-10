package ali.salimov.petProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ali.salimov.petProject.model.Chat;

@Repository
public interface ChatRepository  extends CrudRepository<Chat,Long>{
	//Iterable<Chat> findAllByUser(Long user);
}
