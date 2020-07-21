package exercicios_25_a_27;

import java.util.Scanner;

public class AlunoAulas {

	public static void main(String[] args) {
		
		Aluno paulo = new Aluno();
		Scanner informacoes = new Scanner(System.in);
		
		System.out.println("Me informe a 1 matéria: ");
		String materia1 = informacoes.next();
		paulo.disciplinas.setDisciplina1(materia1);
		
		System.out.println();
		
		System.out.println("Me informe a 2 matéria: ");
		String materia2 = informacoes.next();
		paulo.disciplinas.setDisciplina2(materia2);

		System.out.println();
		
		System.out.println("Me informe a matéria 3: ");
		String materia3 = informacoes.next();
		paulo.disciplinas.setDisciplina3(materia3);
		
		System.out.println("Me informe a nota para a matéria " + materia1 + " :");
		double notaDaMateria1 = informacoes.nextDouble();
		paulo.notas.setnotaDadisciplina1(notaDaMateria1);
		
		System.out.println();
		
		System.out.println("Me informe a nota para a matéria " + materia2 + " :");
		double notaDaMateria2 = informacoes.nextDouble();
		paulo.notas.setnotaDadisciplina2(notaDaMateria2);
		
		System.out.println();
		
		System.out.println("Me informe a nota para a matéria " + materia3 + " :");
		double notaDaMateria3 = informacoes.nextDouble();
		paulo.notas.setnotaDadisciplina3(notaDaMateria3);
		

		System.out.println(paulo.disciplinas.getDisciplina1());
		

		System.out.println(paulo.disciplinas.getDisciplina2());
		

		System.out.println(paulo.disciplinas.getDisciplina3());
		
		//paulo.notas.setnotaDadisciplina1(10);
		System.out.println(paulo.notas.getnotaDadisciplina1());

	//	paulo.notas.setnotaDadisciplina2(8);
		System.out.println(paulo.notas.getnotaDadisciplina2());

	//	paulo.notas.setnotaDadisciplina3(3);
		System.out.println(paulo.notas.getnotaDadisciplina3());

		
		
		
	}
	
}
