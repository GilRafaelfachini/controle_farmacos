package br.com.farmacos.restspringbootcontrolefamacos.usuario;

public record DadosListagemUsuarios(String nome, String email) {

	public DadosListagemUsuarios(Usuario usuario) {
		this(usuario.getNome(),usuario.getEmail());
	}
}
