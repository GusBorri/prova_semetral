
public class Filme {
	private boolean watched;
	private String title;
	private String synopsis;
	private String gender;
	private int rating;
	private String whereWatch;
	
	public boolean isAssistido() {
		return watched;
	}
	public void setAssistido(boolean assistido) {
		this.watched = assistido;
	}
	public String getTitulo() {
		return title;
	}
	public void setTitulo(String titulo) {
		this.title = titulo;
	}
	public String getSinopse() {
		return synopsis;
	}
	public void setSinopse(String sinopse) {
		this.synopsis = sinopse;
	}
	public String getGenero() {
		return gender;
	}
	public void setGenero(String genero) {
		this.gender = genero;
	}
	public int getAvaliacao() {
		return rating;
	}
	public void setAvaliacao(int avaliacao) {
		this.rating = avaliacao;
	}
	public String getOndeAssisstir() {
		return whereWatch;
	}
	public void setOndeAssisstir(String ondeAssisstir) {
		this.whereWatch = ondeAssisstir;
	}
	@Override
	public String toString() {
		return "Filme [assistido=" + watched + ", titulo=" + title + ", sinopse=" + synopsis + ", genero=" + gender
				+ ", avaliacao=" + rating + ", ondeAssisstir=" + whereWatch + "]";
	}
	
	

}
