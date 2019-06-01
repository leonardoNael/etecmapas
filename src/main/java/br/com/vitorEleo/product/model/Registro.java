package br.com.vitorEleo.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="etec")
public class Registro {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="codigo")
	private Integer codigo;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="cep")
	private String cep;
	
	@Column(name="latitude")
	private Double latitude;
	
	@Column(name="longitude")
	private Double longitude;
	
}
