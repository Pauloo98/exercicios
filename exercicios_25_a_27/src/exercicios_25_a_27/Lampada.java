package exercicios_25_a_27;

public class Lampada {
	String estado;
	


	public Lampada() {
		this.estado = "desligada";
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstadoLigada() {
		this.estado = "Ligada";
	}
	
	public void setEstadoDesligada() {
		this.estado = "Desligada";
	}
	
	
}