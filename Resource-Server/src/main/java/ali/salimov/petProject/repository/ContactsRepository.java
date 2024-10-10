package ali.salimov.petProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ali.salimov.petProject.model.Contacts;
import ali.salimov.petProject.model.User;

@Repository
public interface ContactsRepository  extends CrudRepository<Contacts,Long>{
	public Contacts findAllByUser1Id(User user1);
}
