package ali.salimov.petProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ali.salimov.petProject.model.ChatParticipants;

@Repository
public interface ChatParticipantsRepository extends CrudRepository<ChatParticipants,Long>{
}
