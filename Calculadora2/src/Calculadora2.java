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
    calcularResultado(numero1,numero2,operacion);
  }

  static void calcularResultado(float numero1, float numero2, String operacion) {
    float resultado;
    switch (operacion) {
      case "+":
        resultado = numero1 + numero2;
        System.out.print("El resultado de la suma es =" + resultado);
        break;
      case "-":
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es =" + resultado);
        break;
      case "*":
        resultado = numero1 * numero2;
        System.out.println("Elresultado de la multiplicadción es=" + resultado);
        break;
      case "/":
        resultado = numero1 / numero2;
        System.out.println("El resultado de la división es=" + resultado);
        break;

    }
  }

}
