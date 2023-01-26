package ch21.tagtalent.TagtalentApplication.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name= "usuario")
public class Usuario {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Long id;
	private String nombre;
	private String apellido;
	private String correo;
	private Long telefono;
	private String password;
	private Date fecha_nacimiento;
	private char sexo;
	private String foto;
	private String descripcion;
	private String ciudad;
	
	
	public Usuario(String nombre, String apellido, String correo, Long telefono, String password, Date fecha_nacimiento,
			char sexo, String foto, String descripcion, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.password = password;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.foto = foto;
		this.descripcion = descripcion;
		this.ciudad = ciudad;
	}// constructor
	
	public Usuario() { }// contructor vacío

	/*-------------------
	 * getters y setters
	 * -----------------*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono
				+ ", password=" + password + ", fecha_nacimiento=" + fecha_nacimiento + ", sexo=" + sexo + ", foto="
				+ foto + ", descripcion=" + descripcion + ", ciudad=" + ciudad + "]";
	}//toString

}//class Usuario
