package model;

public class Ciudadano {

	private int idCiudadano;
	private String nombre;
	private String apellidos;
	private int edad;
	private String sexo;
	private String delegacion;

	public int getIdCiudadano() {
		return idCiudadano;
	}

	public void setIdCiudadano(int idCiudadano) {
		this.idCiudadano = idCiudadano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	@Override
	public String toString() {
		return "Mi nuevo ciudadano [idCiudadano=" + idCiudadano + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + ", sexo=" + sexo + ", delegacion=" + delegacion + "]";
	}

}
