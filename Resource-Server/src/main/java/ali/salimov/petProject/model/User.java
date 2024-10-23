package ali.salimov.petProject.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor()
@Builder
@Entity
@Table(name="users")
public class User implements Serializable{

	private static final long serialVersionUID = -6462501874197322250L;
	@Id
    @Basic(optional = false)
    @Column(unique=true, nullable = false)
    private UUID id;
	@Column(unique=true, nullable = false)
    private String username;
    @Column(unique=true, nullable = false)
    private String email;
	@Builder.Default
	private List<String> grantedAuthority = new ArrayList<String>(List.of("USER_ROLE"));
    @Builder.Default
    private Date createdAt = new Date();
    
    @Builder.Default
    @OneToMany(mappedBy="user")
    private List<ChatParticipants> userChats = new ArrayList<ChatParticipants>();

    @Builder.Default
    @OneToMany(mappedBy="user1Id")
    private List<Contacts> contacts = new ArrayList<Contacts>();
    
    public User(UUID id) {
		super();
		this.id = id;
	}
    
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return grantedAuthority.stream().map(gA -> new SimpleGrantedAuthority(gA)).toList();
	}

	public void addGrantedAuthority(String grantedAuthority) {
		if(!this.grantedAuthority.contains(grantedAuthority))
			this.grantedAuthority.add(grantedAuthority);
	}
	public void deleteGrantedAuthority(String grantedAuthority) {
		this.grantedAuthority.remove(grantedAuthority);
	}
	public User(UUID id, String username, String email, Date createdAt) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.createdAt = createdAt;
	}
}