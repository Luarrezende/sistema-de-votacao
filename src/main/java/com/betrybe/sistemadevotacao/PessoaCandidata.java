package com.betrybe.sistemadevotacao;

/**
 * Esta é a classe que representa uma pessoa candidata no sistema de votação.
 * Ela contém informações e métodos relacionados a candidatos.
 */
public class PessoaCandidata extends Pessoa {
  public int numero;
  public int votos;

  /**
   * Esta é a classe que representa uma pessoa candidata no sistema de votação.
   * Ela contém informações e métodos relacionados a candidatos.
   */
  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
