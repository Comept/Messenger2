package ali.salimov.petProject.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ChatParticipants implements Serializable{
	private static final long serialVersionUID = 5422110446816052268L;
	@Id
	private long id;
	
	@ManyToOne
	private Chat chat;
	
	@ManyToOne
    private User user;
	
    private String role;
    private Date joinedAt;

    public ChatParticipants(long id) {
		super();
		this.id = id;
	}
    
    
}