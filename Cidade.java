package Modificadores;

public class Cidade {

	private String nome;
	private Estado estado;

	public void enderecoestado (String nome,String sigla) {
		estado = new Estado();
		estado.setNome(nome);
		estado.setSigla(sigla);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome ;
	}
	public Estado getestado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado ;
	}
}
