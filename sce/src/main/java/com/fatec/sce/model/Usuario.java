package com.fatec.sce.model;

public class Usuario {
	private String ra;
	private String nome;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		if (ra == "" | ra == null) {
			throw new RuntimeException("RA invalido");
		}
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == "" | nome == null) {
			throw new RuntimeException("Nome invalido");
		}
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			throw new RuntimeException("Usuario não é objeto");
		if (getClass() != obj.getClass())
			throw new RuntimeException("Objeto não é classe Usuario");
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				throw new RuntimeException("Nome é diferente de null");
		} else if (!nome.equals(other.nome))
			throw new RuntimeException("Nomes são diferentes");
		
		if (ra == null) {
			if (other.ra != null)
				throw new RuntimeException("RA é diferente de null");
		} else if (!ra.equals(other.ra))
			throw new RuntimeException("RAs são diferentes");
		return true;
	}
}
