package Hitss.Treinamento.Repositorios;

import Hitss.Treinamento.Classes.*;

public class BolsistaRepositorio extends PessoaRepositorio {
	public void renovarBolsa(Bolsista bolsista) {
		System.out.println("");
		System.out.println("Bolsa do(a) bolsista " + bolsista.getPessoa().getNome() + " Paga com Sucesso.");
	}
	
	public void PagarMensalidade(String nome) {
		System.out.println("");
		System.out.println("Mensalidade do(a) Bolsista " + nome + " Paga com sucesso.");
	}
}
