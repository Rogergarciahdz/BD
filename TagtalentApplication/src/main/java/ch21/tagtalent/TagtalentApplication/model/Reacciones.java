package ch21.tagtalent.TagtalentApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reacciones")
public class Reacciones {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Long id;
	private Long id_pub;
	private Long id_usr;
	
	
	
	
	
	
	
	
	
	public Reacciones(Long id, Long id_pub, Long id_usr) {
		super();
		this.id = id;
		this.id_pub = id_pub;
		this.id_usr = id_usr;
	}
	public Long getId() {
		return id;
	}
	public Long getId_pub() {
		return id_pub;
	}
	public Long getId_usr() {
		return id_usr;
	}
	@Override
	public String toString() {
		return "Reacciones [id=" + id + ", id_pub=" + id_pub + ", id_usr=" + id_usr + "]";
	}
	
	
	
	
	
	
	
}// class Reacciones