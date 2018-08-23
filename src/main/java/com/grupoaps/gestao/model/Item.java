package com.grupoaps.gestao.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String registro;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String tipoPapel;
	
	@NotEmpty
	private String tipoUtencilios;
			
	@NotNull
	private Integer notaPerfil;
	
	private LocalDate dataAquisicao;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoPapel() {
		return tipoPapel;
	}

	public void setTipoPapel(String tipoPapel) {
		this.tipoPapel = tipoPapel;
	}

	public String getTipoUtencilios() {
		return tipoUtencilios;
	}

	public void setTipoUtencilios(String tipoUtencilios) {
		this.tipoUtencilios = tipoUtencilios;
	}

	public Integer getNotaPerfil() {
		return notaPerfil;
	}

	public void setNotaPerfil(Integer notaPerfil) {
		this.notaPerfil = notaPerfil;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
