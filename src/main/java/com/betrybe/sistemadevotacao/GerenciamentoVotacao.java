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
        PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
        pessoasCandidatas.add(novaPessoaCandidata);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoa : pessoasEleitoras) {
        if (pessoa.getCpf().equals(cpf)) {
            System.out.println("Pessoa eleitora já cadastrada!");
            return;
        }
        PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
        pessoasEleitoras.add(novaPessoaEleitora);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
  }

  @Override
  public void mostrarResultado() {
  }
}
