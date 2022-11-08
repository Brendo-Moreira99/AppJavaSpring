package br.com.novosares.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DiariasHotelaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private int qtd_dias;
	
	@Column(nullable = false)
	private String rua;
	
	@Column(nullable = false)
	private int numero;
	
	@Column(nullable = false)
	private String cep;
	
	@Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
	private UF estado;
	
	@Column(nullable = false)
	private String municipio;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int qtd_Quartos;
	
	public DiariasHotelaria() {
		
	}
	public DiariasHotelaria(int id, int qtd_dias, String rua, int numero, String cep, UF estado, String municipio,
			String nome, int qtd_Quartos) {
		
		this.id = id;
		this.qtd_dias = qtd_dias;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.estado = estado;
		this.municipio = municipio;
		this.nome = nome;
		this.qtd_Quartos = qtd_Quartos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtd_dias() {
		return qtd_dias;
	}
	public void setQtd_dias(int qtd_dias) {
		this.qtd_dias = qtd_dias;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public UF getEstado() {
		return estado;
	}
	public void setEstado(UF estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getNome_Hotel() {
		return nome;
	}
	public void setNome_Hotel(String nome) {
		this.nome = nome;
	}
	public int getQtd_Quartos() {
		return qtd_Quartos;
	}
	public void setQtd_Quartos(int qtd_Quartos) {
		this.qtd_Quartos = qtd_Quartos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cep, estado, id, municipio, nome, numero, qtd_Quartos, qtd_dias, rua);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiariasHotelaria other = (DiariasHotelaria) obj;
		return Objects.equals(cep, other.cep) && estado == other.estado && id == other.id && Objects.equals
				(municipio, other.municipio) && Objects.equals(nome, other.nome)
				&& numero == other.numero && qtd_Quartos == other.qtd_Quartos && qtd_dias == other.qtd_dias
				&& Objects.equals(rua, other.rua);
	}
	@Override
	public String toString() {
		return "DiariasHotelaria [id=" + id + ", qtd_dias=" + qtd_dias + ", rua=" + rua + ", numero="
				+ numero + ", cep=" + cep + ", estado=" + estado + ", municipio=" + municipio + ", nome="
				+ nome + ", qtd_Quartos=" + qtd_Quartos + "]";
	}
	
	
}
