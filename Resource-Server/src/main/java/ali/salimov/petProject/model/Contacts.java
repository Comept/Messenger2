package ali.salimov.petProject.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
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
public class Contacts implements Serializable{
	private static final long serialVersionUID = -1662860013574355705L;
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(unique=true, nullable = false)
	private long id;
	@ManyToOne
    @JoinColumn(name = "user1_id", insertable = false, updatable = false)
	private User user1Id;
	@ManyToOne
    @JoinColumn(name = "user2_id", insertable = false, updatable = false)
	private User user2Id;
    private Date createdAt;
    
    
}