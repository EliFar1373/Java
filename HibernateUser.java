package come.project;
import jakarta.persistence.*;



	

	@Entity
	@Table(name = "users")
	public class HibernateUser {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "username")
	    private String username;

	    // Constructors
	    public HibernateUser() {}
	    public HibernateUser(String username) {
	        this.username = username;
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }
	}



