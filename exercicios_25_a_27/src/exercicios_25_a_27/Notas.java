package exercicios_25_a_27;

class Notas {

	double notaDadisciplina1;
	double notaDadisciplina2;
	double notaDadisciplina3;

	public void validaNota(double nota) {
		if (nota >= 0 && nota <= 0) {
			this.notaDadisciplina1 = nota;
		} else
			System.out.println("Nota inválida");
	}
	
	
	public void notaDadisciplina2(double nota) {
		if (nota >= 0 && nota <= 0) {
			this.notaDadisciplina1 = nota;
		} else
			System.out.println("Nota inválida");
	}

	public void notaDadisciplina3(double nota) {
		if (nota >= 0 && nota <= 0) {
			this.notaDadisciplina1 = nota;
		} else
			System.out.println("Nota inválida");
	}

	public double getnotaDadisciplina1() {
		return this.notaDadisciplina1;
	}

	public void setnotaDadisciplina1(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.notaDadisciplina1 = nota;
		} else {
			System.out.println("Nota inválida");
		this.notaDadisciplina1 = 0;
		}
	}

	public double getnotaDadisciplina2() {
		return this.notaDadisciplina2;
	}

	public void setnotaDadisciplina2(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.notaDadisciplina2 = nota;
		} else {
			System.out.println("Nota inválida");
		this.notaDadisciplina2 = 0;
		}
	}

	public double getnotaDadisciplina3() {
		return this.notaDadisciplina3;
	}

	public void setnotaDadisciplina3(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.notaDadisciplina3 = nota;
		} else {
			System.out.println("Nota inválida");
		this.notaDadisciplina3 = 0;
		}
		}



}
