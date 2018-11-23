package br.cast.com.ordemServico.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class OrdemServico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numero;

//	@JoinColumn(name = "cpf")
//	private Cliente cliente;

//	@OneToMany(mappedBy = "codigo")
//	private ArrayList<ItemServico> itens;

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}

//	public ArrayList<ItemServico> getItens() {
//		return itens;
//	}
//
//	public void setItens(ArrayList<ItemServico> itens) {
//		this.itens = itens;
//	}

}
