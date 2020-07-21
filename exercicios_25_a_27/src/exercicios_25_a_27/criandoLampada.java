package exercicios_25_a_27;



public class criandoLampada {
	
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		System.out.println(lampada.getEstado());
		
		lampada.setEstadoLigada();
		System.out.println(lampada.getEstado());
		
		
	}
	
	

}
