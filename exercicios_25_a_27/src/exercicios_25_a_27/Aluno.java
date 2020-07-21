package exercicios_25_a_27;

import java.util.Scanner;

class Aluno {

	String nome;
	int matricula;
	String curso;
	Disciplinas disciplinas = new Disciplinas();
	Notas notas = new Notas();

	public Aluno() {
		
	Scanner informacoes = new Scanner(System.in);
		
		System.out.println("Me informe a 1 matéria: ");
		String materia1 = informacoes.next();
		this.disciplinas.setDisciplina1(materia1);

		
		System.out.println();
		
		System.out.println("Me informe a 2 matéria: ");
		String materia2 = informacoes.next();
		this.disciplinas.setDisciplina2(materia2);

		System.out.println();
		
		System.out.println("Me informe a matéria 3: ");
		String materia3 = informacoes.next();
		this.disciplinas.setDisciplina3(materia3);
		
		System.out.println("Me informe a nota para a matéria " + materia1 + " :");
		double notaDaMateria1 = informacoes.nextDouble();
		this.notas.setnotaDadisciplina1(notaDaMateria1);
		
		System.out.println();
		
		System.out.println("Me informe a nota para a matéria " + materia2 + " :");
		double notaDaMateria2 = informacoes.nextDouble();
		this.notas.setnotaDadisciplina2(notaDaMateria2);
		
		System.out.println();
		
		System.out.println("Me informe a nota para a matéria " + materia3 + " :");
		double notaDaMateria3 = informacoes.nextDouble();
		this.notas.setnotaDadisciplina3(notaDaMateria3);
		

		System.out.println(this.disciplinas.getDisciplina1());
		

		System.out.println(this.disciplinas.getDisciplina2());
		
		System.out.println(this.disciplinas.getDisciplina3());
		
		//this.notas.setnotaDadisciplina1(10);
		System.out.println(this.notas.getnotaDadisciplina1());

	//	this.notas.setnotaDadisciplina2(8);
		System.out.println(this.notas.getnotaDadisciplina2());

	//	this.notas.setnotaDadisciplina3(3);
		System.out.println(this.notas.getnotaDadisciplina3());

				

	}
	}

