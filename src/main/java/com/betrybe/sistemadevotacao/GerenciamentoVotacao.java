package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Esta é a classe responsável pelo gerenciamento das operações de votação no sistema.
 * Ela contém métodos para iniciar, encerrar e acompanhar o processo de votação.
 */
public abstract class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> cpfsComputados;
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;

  /**
   * Construtor da classe GerenciamentoVotacao.
   */
  public GerenciamentoVotacao() {
    this.cpfsComputados = new ArrayList<PessoaCandidata>();
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
  }
}
