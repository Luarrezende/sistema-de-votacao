package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Esta é a classe principal do sistema de votação.
 * Ela é responsável por iniciar e coordenar o sistema de votação.
 */
public class Principal {

  /**
 * Esta é a classe principal do sistema de votação.
 * Ela é responsável por iniciar e coordenar o sistema de votação.
 */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    Scanner sc = new Scanner(System.in);

    boolean cadastrarCandidatas = true;
    boolean cadastrarEleitoras = true;

    while (cadastrarCandidatas) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.print("Entre com o número correspondente à opção desejada: ");
      int opcaoCandidata = Integer.parseInt(sc.nextLine());
    }

    
    sc.close();
  }
}
