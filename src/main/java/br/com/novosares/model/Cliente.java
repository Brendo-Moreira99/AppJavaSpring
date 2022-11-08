package br.com.novosares.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table
public class Cliente {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	   
	   @Column (nullable = false)
		private String rua;
	   
	   @Column  (nullable = false)
		private String bairro;
	   
	   	@Column(name = "data_cli", nullable = false)
	    @DateTimeFormat(pattern = "dd/MM/yyyy")
		private Date data_cli;
	   
	   @Column  (nullable = false)
		private String municipio;
	   
	   @Column  (nullable = false)
		private int numero;
	   
	   @Column(nullable = false, length = 2)
	    @Enumerated(EnumType.STRING)
		private UF estado;
	   
	   @Column  (nullable = false)
		private String telefone;
	   
	   @Column  (nullable = false)
		private String cep;
	   
	   @Column  (nullable = false)
		private String cpf;
	   
	   @Column  (nullable = false)
		private String nome;
	   
	   
		public Cliente() {
			
		}

	public Cliente(int id, String rua, String bairro, Date data_cli, String municipio, int numero,
			UF estado, String telefone, String cep, String cpf, String nome) {
		
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.data_cli = data_cli;
		this.municipio = municipio;
		this.numero = numero;
		this.estado = estado;
		this.telefone = telefone;
		this.cep = cep;
		this.cpf = cpf;
		this.nome = nome;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Date getData_cli() {
		return data_cli;
	}

	public void setData_cli(Date data_cli) {		
		this.data_cli = data_cli;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public UF getEstado() {
		return estado;
	}

	public void setEstado(UF estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cpf, cep, data_cli, estado, id, municipio, nome, numero, rua, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cpf, other.cpf) && Objects.equals(cep, other.cep)
				&& Objects.equals(data_cli, other.data_cli) && Objects.equals(estado, other.estado)
				&& id == other.id && Objects.equals(municipio, other.municipio)
				&& Objects.equals(nome, other.nome) && numero == other.numero && Objects.equals(rua, other.rua)
				&& Objects.equals(telefone, other.telefone);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", rua=" + rua + ", bairro=" + bairro + ", data_cli=" + data_cli
				+ ", municipio=" + municipio + ", numero=" + numero + ", estado=" + estado + ", telefone=" + telefone
				+ ", cep=" + cep + ", cpf=" + cpf + ", nome=" + nome + "]";
	}
}
