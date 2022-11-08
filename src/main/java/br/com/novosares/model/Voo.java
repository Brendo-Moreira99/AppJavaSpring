package br.com.novosares.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table
public class Voo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String partida;
	
	@Column(nullable = false)
	private int qtd_pessoas;

	@Column(nullable = false)
	private String destino;
	
	@Column(name = "data_ida", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)	
	private Date data_ida;
	
	@Column(name = "data_volta", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private Date data_volta;
	
	@Column(nullable = false)
	private double valor;
	
	@Column(nullable = false)
	private String transfer;

	public Voo() {
		
	}
	
	public Voo(int id, String partida, int qtd_pessoas, String destino, Date data_ida, Date data_volta,
			double valor, String transfer) {
		
		this.id = id;
		this.partida = partida;
		this.qtd_pessoas = qtd_pessoas;
		this.destino = destino;
		this.data_ida = data_ida;
		this.data_volta = data_volta;
		this.valor = valor;
		this.transfer = transfer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public int getQtd_pessoas() {
		return qtd_pessoas;
	}

	public void setQtd_pessoas(int qtd_pessoas) {
		this.qtd_pessoas = qtd_pessoas;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getData_ida() {
		return data_ida;
	}

	public void setData_ida(Date data_ida) {
		this.data_ida = data_ida;
	}

	public Date getData_volta() {
		return data_volta;
	}

	public void setData_volta(Date data_volta) {
		this.data_volta = data_volta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTransfer() {
		return transfer;
	}

	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data_ida, data_volta, destino, id, partida, qtd_pessoas, transfer,
				valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voo other = (Voo) obj;
		return Objects.equals(data_ida, other.data_ida) && Objects.equals(data_volta, other.data_volta)
				&& Objects.equals(destino, other.destino) && id == other.id
				&& Objects.equals(partida, other.partida) && qtd_pessoas == other.qtd_pessoas
				&& Objects.equals(transfer, other.transfer)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	public String toString() {
		return "Voo [id=" + id + ", partida=" + partida + ", qtd_pessoas="
				+ qtd_pessoas + ", destino=" + destino + ", data_ida=" + data_ida + ", data_volta=" + data_volta
				+ ", valor=" + valor + ", transfer=" + transfer + "]";
	}
	
		
}
