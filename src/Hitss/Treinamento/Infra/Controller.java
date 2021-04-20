package Hitss.Treinamento.Infra;

import java.util.Scanner;
import Hitss.Treinamento.Repositorios.*;

import Hitss.Treinamento.Classes.Aluno;
import Hitss.Treinamento.Classes.Bolsista;
import Hitss.Treinamento.Classes.Visitante;

public class Controller {

	public void Play() {
		try {
			
		
		
		System.out.println("------------------------------------------");
		System.out.println("(1) - Fazer Aniversário do(a) Aluno(a)");
		System.out.println("(2) - Fazer Aniversário do(a) Visitante");
		System.out.println("(3) - Fazer Aniversário do(a) Bolsista");
		System.out.println("(4) - Pagar a Mensalidade do(a) Aluno(a)");
		System.out.println("(5) - Pagar a Mensalidade do(a) Bolsista");
		System.out.println("(6) - Renovar Bolsa");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Digite a opção desejada.");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			try {
				
			
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
			}else {
				System.out.println("");
				System.out.println("Nenhum(a) Aluno(a) encontrado");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Nenhum(a) Aluno(a) encontrado");
			}
			break;
			case 2:
			try {
				
			
			int[] matriculaVisita = new int[5];
			matriculaVisita[1] = 1;
			matriculaVisita[2] = 2;
			matriculaVisita[3] = 3;
			matriculaVisita[4] = 4;
			
			String[] nomeVisita = new String[5];
			nomeVisita[1] = "Paulo Ricardo";
			nomeVisita[2] = "Sergio Silva";
			nomeVisita[3] = "Rogeria Martins";
			nomeVisita[4] = "Vania Azevedo";
			
			int[] idadeVisita = new int[5];
			idadeVisita[1] = 22;
			idadeVisita[2] = 24;
			idadeVisita[3] = 23;
			idadeVisita[4] = 22;
			
			String[] sexoVisita = new String[5];
			sexoVisita[1] = "Masculino";
			sexoVisita[2] = "Masculino";
			sexoVisita[3] = "Feminino";
			sexoVisita[4] = "Feminino";
			
			System.out.println("");
			System.out.println("Digite a matrícula da Visita:");
			System.out.println("");
			int MatriculaVisita = teclado.nextInt();
			
			if (MatriculaVisita == matriculaVisita[MatriculaVisita]) {
				Visitante visitante = new Visitante();
				visitante.Matricula = matriculaVisita[MatriculaVisita];
				visitante.setNome(nomeVisita[MatriculaVisita]);
				visitante.setIdade(idadeVisita[MatriculaVisita]);
				visitante.setSexo(sexoVisita[MatriculaVisita]);
				VisitanteRepositorio rep = new VisitanteRepositorio();
				int Niver = rep.fazerAniversario(visitante.getIdade());
				System.out.println("");
				System.out.println("O(A) Visitante(a) " + visitante.getNome() + " fez aniversário, agora ele(a) está com " + Niver + " anos.");
			} else {
				System.out.println("");
				System.out.println("Nenhum(a) Visitante Encontrado.");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Nenhum(a) Visitante Encontrado.");
			}
			break;
			case 3:
				try {
					
				
				int[] matricula = new int[5];
				matricula[1] = 1;
				matricula[2] = 2;
				matricula[3] = 3;
				matricula[4] = 4;
				
				String[] nome = new String[5];
				nome[1] = "Ricardo Nascimento";
				nome[2] = "Daniel Carvalho";
				nome[3] = "Catia Regina";
				nome[4] = "Carla Nunes";
				
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
					Bolsista bolsista = new Bolsista();
					bolsista.setMatricula(matricula[Matricula]);
					bolsista.setNome(nome[Matricula]);
					bolsista.setIdade(idade[Matricula]);
					bolsista.setSexo(sexo[Matricula]);
					bolsista.setCurso(curso[Matricula]);
					BolsistaRepositorio rep = new BolsistaRepositorio();
					int Niver = rep.fazerAniversario(bolsista.getIdade());
					System.out.println("");
					System.out.println("O(A) Bolsista " + bolsista.getNome() + " fez aniversário, agora ele(a) está com " + Niver + " anos.");
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Bolsista encontrado");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Bolsista encontrado");
				}
				break;
			case 4:
				try {
					
				
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
					 rep.PagarMensalidade(aluno.getNome());
					
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) encontrado");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) encontrado");
				}
				break;
			case 5:
				try {
					
				
				int[] matricula = new int[5];
				matricula[1] = 1;
				matricula[2] = 2;
				matricula[3] = 3;
				matricula[4] = 4;
				
				String[] nome = new String[5];
				nome[1] = "Ricardo Nascimento";
				nome[2] = "Daniel Carvalho";
				nome[3] = "Catia Regina";
				nome[4] = "Carla Nunes";
				
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
					Bolsista bolsista = new Bolsista();
					bolsista.setMatricula(matricula[Matricula]);
					bolsista.setNome(nome[Matricula]);
					bolsista.setIdade(idade[Matricula]);
					bolsista.setSexo(sexo[Matricula]);
					bolsista.setCurso(curso[Matricula]);
					BolsistaRepositorio rep = new BolsistaRepositorio();
					rep.PagarMensalidade(bolsista.getNome());
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Bolsista encontrado");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Bolsista encontrado");
				}
				break;
			case 6:
				try {
					
				
				int[] matricula = new int[5];
				matricula[1] = 1;
				matricula[2] = 2;
				matricula[3] = 3;
				matricula[4] = 4;
				
				String[] nome = new String[5];
				nome[1] = "Ricardo Nascimento";
				nome[2] = "Daniel Carvalho";
				nome[3] = "Catia Regina";
				nome[4] = "Carla Nunes";
				
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
					Bolsista bolsista = new Bolsista();
					bolsista.matricula = matricula[Matricula];
					bolsista.nome = nome[Matricula];
					bolsista.setIdade(idade[Matricula]);
					bolsista.setSexo(sexo[Matricula]);
					bolsista.setCurso(curso[Matricula]);
					BolsistaRepositorio rep = new BolsistaRepositorio();
					rep.renovarBolsa(bolsista);
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Bolsista encontrado");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Bolsista encontrado");
				}
				break;
		default:
			System.out.println("");
			System.out.println("Opção Inválida");
			break;
		}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Opção Inválida");
			
		}
		
	}
}
