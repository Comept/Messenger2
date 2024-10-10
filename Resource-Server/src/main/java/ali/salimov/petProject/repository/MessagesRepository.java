package ali.salimov.petProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ali.salimov.petProject.model.Message;

@Repository
public interface MessagesRepository  extends CrudRepository<Message, Long>{
	public Iterable<Message> findAllByChatId(Long chat);
}
