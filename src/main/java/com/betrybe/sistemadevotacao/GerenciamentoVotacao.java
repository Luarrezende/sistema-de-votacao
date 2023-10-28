package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Esta é a classe responsável pelo gerenciamento das operações de votação no sistema.
 * Ela contém métodos para iniciar, encerrar e acompanhar o processo de votação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<String> cpfsComputados;
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;

  /**
   * Construtor da classe GerenciamentoVotacao.
   */
  public GerenciamentoVotacao() {
    this.cpfsComputados = new ArrayList<String>();
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(novaPessoaCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoa : pessoasEleitoras) {
      if (pessoa.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(novaPessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }
    for (PessoaEleitora pessoa : pessoasEleitoras) {
      if (pessoa.getCpf().equals(cpfPessoaEleitora)) {
        cpfsComputados.add(cpfPessoaEleitora);             
      }
      for (PessoaCandidata candidato : pessoasCandidatas) {
        if (candidato.getNumero() == numeroPessoaCandidata) {
          candidato.receberVoto();
          return;
        }       
      }
    }
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    int total = cpfsComputados.size();
    for (PessoaCandidata candidato : pessoasCandidatas) {
      System.out.printf("Nome: %s - %d votos ( %d%% )%n",
          candidato.getNome(),
          candidato.getVotos(),
          Math.round((float) candidato.getVotos() / total * 100)
      );
    }
    System.out.printf("Total de votos: %d%n", total);
  }
}
