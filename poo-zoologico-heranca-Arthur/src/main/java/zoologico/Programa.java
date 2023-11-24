package zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
public Programa() {
}

    public static void main(String[] args) {
        System.out.println("Zoologico");
        List<Animal> animais = new ArrayList();
        List<Funcionario> funcionarios = new ArrayList();
        cadastrarNovos(animais, funcionarios);
        imprimirListas(animais, funcionarios);
    }

        private static void cadastrarNovos(List<Animal> animais, List<Funcionario> funcionarios) {
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Escolha um cadastro");
                System.out.println("Animal [a]");
                System.out.println("Funcionário [f]");
                String tipoCadastro = scanner.nextLine();
                if (tipoCadastro.equals("a")) {
                    animais.add(Animal.construir());
                }

                if (tipoCadastro.equals("f")) {
                    funcionarios.add(Funcionario.contruir());
                }

                System.out.println("Continuar [1]");
            }while (scanner.nextLine().equals("1"));
            }

            private static void imprimirListas(List<Animal> animais, List<Funcionario> funcionarios) {
            animais.forEach(Animal::imprimir);
            funcionarios.forEach(Funcionario::imprimir);

        }
    }

