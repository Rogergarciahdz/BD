package ch21.tagtalent.TagtalentApplication.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publicacion")
public class Publicacion{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	
	private Long id;
	private char ofrece;
	private String titulo;
	private String descripcion;
	private String img;
	private Date fecha;
	public int num_reacciones;
	
	public Publicacion(char ofrece, String titulo, String descripcion, String img, Date fecha, int num_reacciones) {
		super();
		this.ofrece = ofrece;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.img = img;
		this.fecha = fecha;
		this.num_reacciones = num_reacciones;
	}//constructor
	
	public Publicacion() {}//constructor vacío

	/*-------------------
	 * getters y setters
	 * -----------------*/
	public char getOfrece() {
		return ofrece;
	}

	public void setOfrece(char ofrece) {
		this.ofrece = ofrece;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getNum_reacciones() {
		return num_reacciones;
	}

	public void setNum_reacciones(int num_reacciones) {
		this.num_reacciones = num_reacciones;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Publicacion [ofrece=" + ofrece + ", titulo=" + titulo + ", descripcion=" + descripcion + ", img=" + img
				+ ", fecha=" + fecha + ", num_reacciones=" + num_reacciones + "]";
	}//toString
	
}// class Publicaciones