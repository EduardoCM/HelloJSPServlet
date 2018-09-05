package model;
import java.time.LocalDate;

public class Inquilino {
	
	private int idInquilino;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private int edad;
	private String sexo;
	private String inmueble;
	private String direccion;
	private LocalDate fechaIngreso;
	

	public int getIdInquilino() {
		return idInquilino;
	}
	public void setIdInquilino(int idInquilino) {
		this.idInquilino = idInquilino;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
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
	public String getInmueble() {
		return inmueble;
	}
	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "Inquilino [idInquilino= " + idInquilino + ", nombre= " + nombre + ", apPaterno= " + apPaterno
				+ ", apMaterno= " + apMaterno + ", edad= " + edad + ", sexo= " + sexo + ", inmueble= " + inmueble
				+ ", direccion= " + direccion + ", fechaIngreso= " + fechaIngreso + "]";
	}
	
	

}
