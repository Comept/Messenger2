package ali.salimov.petProject.model;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Chat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String chatName;
  private boolean isGroup;
  
  public Chat(long id) {
	super();
	this.id = id;
}

@Builder.Default
  @OneToMany(mappedBy = "chat")
  private List<ChatParticipants> chatParticipants = new ArrayList();
  
  @Builder.Default
  @OneToMany(mappedBy = "chat")
  private List<Message> messages = new ArrayList();
}