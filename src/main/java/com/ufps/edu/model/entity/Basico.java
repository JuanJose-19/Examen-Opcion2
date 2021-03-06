package com.ufps.edu.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basico")
public class Basico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String documento;
	
	private String nombre;
	
	private String telefono;
	
	@Column(name = "fechanacimiento")
	private Date fechaNacimiento;
	
	private String genero;
	
	private Long eps;
	
	private Long modalidad;
	
	private Long tipo;
	
	private Boolean embarazo;
	
	@Column(name = "contactonombre")
	private String contactoNombre;
	
	@Column(name = "contactotelefono")
	private String contactoTelefono;
	
	private Boolean mas60;
	
	private Boolean menos15;
	
	private Boolean salud;
	
	private Date fechareg;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public Long getEps() {
		return eps;
	}

	public Long getModalidad() {
		return modalidad;
	}

	public Long getTipo() {
		return tipo;
	}

	public Boolean getEmbarazo() {
		return embarazo;
	}

	public String getContactoNombre() {
		return contactoNombre;
	}

	public String getContactoTelefono() {
		return contactoTelefono;
	}

	public Boolean getMas60() {
		return mas60;
	}

	public Boolean getMenos15() {
		return menos15;
	}

	public Boolean getSalud() {
		return salud;
	}

	public Date getFechareg() {
		return fechareg;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setEps(Long eps) {
		this.eps = eps;
	}

	public void setModalidad(Long modalidad) {
		this.modalidad = modalidad;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	public void setEmbarazo(Boolean embarazo) {
		this.embarazo = embarazo;
	}

	public void setContactoNombre(String contactoNombre) {
		this.contactoNombre = contactoNombre;
	}

	public void setContactoTelefono(String contactoTelefono) {
		this.contactoTelefono = contactoTelefono;
	}

	public void setMas60(Boolean mas60) {
		this.mas60 = mas60;
	}

	public void setMenos15(Boolean menos15) {
		this.menos15 = menos15;
	}

	public void setSalud(Boolean salud) {
		this.salud = salud;
	}

	public void setFechareg(Date fechareg) {
		this.fechareg = fechareg;
	}
	
	
	
}
