import java.util.Scanner;

public class Calculadora2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Esta calculadora hará la operación que usted quiera a dos números que digitará acontinuación");
    float numero1;
    float numero2;
    float resultado;

    System.out.println("por favor digite el primer número a operar");
    numero1 = scanner.nextFloat();
    System.out.println("por favor digite el segundo número a operar");
    numero2 = scanner.nextFloat();
    System.out.println(
        "porfavor digite qué operación quiere hacer (+ SUMA, - RESTA ,* MULTIPLICACIÓN, / DIVISIÓN");
    String operacion = scanner.next();
    resultado = calcularResultado(numero1,numero2,operacion);
    System.out.println("El resultados es "+resultado);
  }

  static float calcularResultado(float numero1, float numero2, String operacion) {
    float resultado;
    switch (operacion) {
      case "+":
        resultado = numero1 + numero2;
        break;
      case "-":
        resultado = numero1 - numero2;
        break;
      case "*":
        resultado = numero1 * numero2;
        break;
      case "/":
        resultado = numero1 / numero2;
        break;
      default:
        resultado=-10000;
        break;
    }
    return resultado;
  }

}
