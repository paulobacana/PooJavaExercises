package exercise.biblioteca;

public class Livro {
	
	private int id = 0;
	private static int proximoId;
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private int quantidade;
	private String status;
	
	public Livro(String titulo, String autor, int anoPublicacao, int qtd){
		this.id = proximoId++;
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.anoPublicacao = anoPublicacao;
		this.quantidade = qtd;
		this.setStatus("Disponível");
	}
	
	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setAnoPublicacao(int ano) {
		this.anoPublicacao = ano;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int qtd) {
		this.quantidade = qtd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
