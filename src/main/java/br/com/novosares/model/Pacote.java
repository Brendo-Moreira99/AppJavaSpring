package br.com.novosares.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table
public class Pacote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private int qtd_pessoas;
	
	@Column(nullable = false)
	private String tipo;
	
	@Column(nullable = false)
	private double valor;
	
	@Column(nullable = false)
	private String destino;
	
	@Column(name = "pacote_id", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private Date pacote_ida;
	
	@Column(name = "pacote_volte", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private Date pacote_volta;
	
	@Column(nullable = false)
	private String transfer;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
	private DiariasHotelaria hotelaria;
	
	public Pacote() {
		
	}

	public Pacote(int id, int qtd_pessoas, String tipo, double valor, String destino, Date pacote_ida, Date pacote_volta,
			String transfer, DiariasHotelaria hotelaria) {
		super();
		this.id = id;
		this.qtd_pessoas = qtd_pessoas;
		this.tipo = tipo;
		this.valor = valor;
		this.destino = destino;
		this.pacote_ida = pacote_ida;
		this.pacote_volta = pacote_volta;
		this.transfer = transfer;
		this.hotelaria = hotelaria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtd_pessoas() {
		return qtd_pessoas;
	}

	public void setQtd_pessoas(int qtd_pessoas) {
		this.qtd_pessoas = qtd_pessoas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getPacote_ida() {
		return pacote_ida;
	}

	public void setPacote_ida(Date pacote_ida) {
		this.pacote_ida = pacote_ida;
	}

	public Date getPacote_volta() {
		return pacote_volta;
	}

	public void setPacote_volta(Date pacote_volta) {
		this.pacote_volta = pacote_volta;
	}

	public String getTransfer() {
		return transfer;
	}

	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}

	public DiariasHotelaria getHotelaria() {
		return hotelaria;
	}

	public void setHotelaria(DiariasHotelaria hotelaria) {
		this.hotelaria = hotelaria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(destino, hotelaria, id, pacote_ida, pacote_volta, qtd_pessoas, tipo, transfer, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacote other = (Pacote) obj;
		return Objects.equals(destino, other.destino) && Objects.equals(hotelaria, other.hotelaria) && id == other.id
				&& Objects.equals(pacote_ida, other.pacote_ida) && Objects.equals(pacote_volta, other.pacote_volta)
				&& qtd_pessoas == other.qtd_pessoas && Objects.equals(tipo, other.tipo)
				&& Objects.equals(transfer, other.transfer)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	public String toString() {
		return "Pacote [id=" + id + ", qtd_pessoas=" + qtd_pessoas + ", tipo=" + tipo + ", valor=" + valor
				+ ", destino=" + destino + ", pacote_ida=" + pacote_ida + ", pacote_volta=" + pacote_volta + ", transfer="
				+ transfer + ", hotelaria=" + hotelaria + "]";
	}
	
	
}
