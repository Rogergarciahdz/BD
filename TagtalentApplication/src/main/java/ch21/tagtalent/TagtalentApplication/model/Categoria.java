package ch21.tagtalent.TagtalentApplication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {//entidad
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	@Column (nullable=false)
	
	
	private Long id;
	private String nombre;
	
	
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}//constructor
	
	public Categoria() { }//constructor vacío
	
	/*-------------------
	 * getters y setters
	 * -----------------*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + "]";
	}//toString
	
}//class Categoria
