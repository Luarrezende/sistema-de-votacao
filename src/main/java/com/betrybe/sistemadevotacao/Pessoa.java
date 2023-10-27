package com.betrybe.sistemadevotacao;

/**
 * Esta é uma classe abstrata que representa uma pessoa com um nome.
 */
public abstract class Pessoa {
  protected String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
