package Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
  public static void main(String[] args) {

    Calculadora calc = new Calculadora();

    double opcao = 6;
    double num1;
    double num2;

    Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção");
    System.out.println("1: Somar");
    System.out.println("2: Subtrair");
    System.out.println("3: Multiplicar");
    System.out.println("4: Dividir");
    System.out.println("5: Porcentagem");
    System.out.println("0: Sair");
    System.out.println("Operação: ");

    opcao = input.nextInt();

    while (opcao != 0) {
      Scanner input1 = new Scanner(System.in);

      if (opcao >= 6) {
        throw new RuntimeException("Essa opção ainda não foi programada :)");
      }

      System.out.println("Qual o primeiro numero");
      num1 = input1.nextInt();
      System.out.println("Qual o segundo numero");
      num2 = input.nextInt();

      if (opcao == 1) {
        Double operacao = calc.Somar(num1, num2);
        System.out.println("O resultado da operação é " + operacao);
        break;
      }
      if (opcao == 2) {
        Double operacao = calc.Subtrair(num1, num2);
        System.out.println("O resultado da operação é " + operacao);
        break;

      }
      if (opcao == 3) {
        Double operacao = calc.Multiplicar(num1, num2);
        System.out.println("O resultado da operação é " + operacao);
        break;
      }
      if (opcao == 4) {
        Double operacao = calc.Dividir(num1, num2);
        System.out.println("O resultado da operação é " + operacao);
        break;
      }
      if (opcao == 5) {
        Double operacao = calc.Porcentagem(num1, num2);
        System.out.println("O resultado da operação é " + operacao);
        break;
      }

    }
  }

}
