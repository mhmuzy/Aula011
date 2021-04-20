package Hitss.Treinamento.Infra;

import java.util.Scanner;
import Hitss.Treinamento.Repositorios.*;

import Hitss.Treinamento.Classes.Aluno;

public class Controller {

	public void Play() {
		
		
		System.out.println("------------------------------------------");
		System.out.println("(1) - Fazer Aniversário do(a) Aluno(a)");
		System.out.println("(2) - Fazer Aniversário do(a) Visitante");
		System.out.println("(3) - Fazer Aniversário do(a) Bolsista");
		System.out.println("(4) - Pagar a Mensalidade do(a) Aluno(a)");
		System.out.println("(5) - Pagar a Mensalidade do(a) Bolsista");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Digite a opção desejada.");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			
			int[] matricula = new int[5];
			matricula[1] = 1;
			matricula[2] = 2;
			matricula[3] = 3;
			matricula[4] = 4;
			
			String[] nome = new String[5];
			nome[1] = "Italo Roberto";
			nome[2] = "Mauro Oliveira";
			nome[3] = "Renata Cristina";
			nome[4] = "Maria Souza";
			
			int[] idade = new int[5];
			idade[1] = 22;
			idade[2] = 24;
			idade[3] = 23;
			idade[4] = 22;
			
			String[] sexo = new String[5];
			sexo[1] = "Masculino";
			sexo[2] = "Masculino";
			sexo[3] = "Feminino";
			sexo[4] = "Feminino";
			
			String[] curso = new String[5];
			curso[1] = "Informática";
			curso[2] = "Direito";
			curso[3] = "Informática";
			curso[4] = "Direito";
			
			System.out.println("");
			System.out.println("Digite a matrícula do(a) Aluno(a):");
			System.out.println("");
			int Matricula = teclado.nextInt();
			
			if (Matricula == matricula[Matricula]) {
				Aluno aluno = new Aluno();
				aluno.setMatricula(matricula[Matricula]);
				aluno.setNome(nome[Matricula]);
				aluno.setIdade(idade[Matricula]);
				aluno.setSexo(sexo[Matricula]);
				aluno.setCurso(curso[Matricula]);
				AlunoRepository rep = new AlunoRepository();
				int Niver = rep.fazerAniversario(aluno.getIdade());
				System.out.println("");
				System.out.println("O(A) Aluno(a) " + aluno.getNome() + " fez aniversário, agora ele(a) está com " + Niver + " anos.");
			}
			
			break;

		default:
			break;
		}
		
	}
}
