package com.fatec.sce;

import com.fatec.sce.model.Usuario;

public class ObtemUsuario {
	public static Usuario comDadosValidos() {
		Usuario aluno = new Usuario();
		aluno.setRa("121212");
		aluno.setNome("Jose Carlos");
		return aluno;
	}

	public static Usuario comDadosInvalidos() {
		// TODO Auto-generated method stub
		return null;
	}
}
