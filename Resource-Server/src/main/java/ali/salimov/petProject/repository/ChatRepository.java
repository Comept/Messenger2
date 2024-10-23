package ali.salimov.petProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ali.salimov.petProject.dto.ChatListDto;
import ali.salimov.petProject.model.Chat;

@Repository
public interface ChatRepository  extends CrudRepository<Chat,Long>{
//    @Query( "SELECT c.id, c.chat_name, c.is_group, m.message_text"+
//    		"FROM (SELECT * FROM Chat_participants WHERE c.user_id = :userId) as user_chats" +
//            "LEFT JOIN chat as c " +
//            "ON user_chats.chat_id = c.id" +
//            "LEFT JOIN message as m" +
//            "ON user_chats.chat_id = m.chat_id" +
//            "WHERE m.sentedAt = MAX(m.sentedAt)")
//    List<ChatListDto> findeUserChatsListById(Long userId);
    
}
