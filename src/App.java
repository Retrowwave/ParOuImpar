import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Importando classe Scanner pra entrada(in) do usuário
        Scanner scanner = new Scanner(System.in);
        // Printando "Digite um número"
        System.out.println("Digite um número:");
        // O que for digitado na entrada, será guardado na variável (numero)
        int numero = scanner.nextInt();

        // Para um número ser considerado PAR, não deve sobrar resto de sua divisão por 2.

        // Se o resto da divisão de (numero) por 2 for igual a 0:
        // Então: é um número par.
        // Se o resto da divisão de (numero) por 2 for igual a 1:
        // Então: é um número ímpar.
        if(numero % 2 == 0) {
            System.out.println(numero + " é um número é par.");
        }
        else {
            System.out.println(numero + " é um número é impar.");
        }
    }
}
