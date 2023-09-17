import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>DESAFIO CONTROLE FLUXO</h1>
 * O sistema irá efetuar um laço for ao obter a subtração de dois números
 * informados pelo usuário via terminal.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos
 * recursos oferecidos pelo autor
 * 
 * @author Erinaldo Silva
 * @version 1.0
 * @since 17/09/2023
 */

public class Contador {
    /**
     * Este método é utilizado para executar um laço for após obter dois parâmetros
     * 
     * @param parametroUm   - o primeiro parâmetro do método
     * @param parametroDois - o segundo parâmetro do método
     * @
     * @throws   ParametrosInvalidosException - lançada se o segundo parâmetro for
     *           maior que o primeiro
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = lerNumero(scanner);
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = lerNumero(scanner);

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("ERRO: O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            scanner.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            System.out.println("\nQuantidade de iterações For: " + contagem);

            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }

    static int lerNumero(Scanner numero) {
        while (true) {
            try {
                return numero.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Para continuar, digite um número inteiro válido!!");
                numero.next();
            }
        }
    }
}
