package com.betrybe.sistemadevotacao;

/**
 * Esta é a classe que representa uma pessoa eleitora no sistema de votação.
 * Ela contém informações e métodos relacionados a eleitores.
 */
public class PessoaEleitora extends Pessoa {

  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
