package zoologicoheranca;

import java.util.Scanner;

public class Funcionario extends Gestao {
    private String funcao;
    private String setor;

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{nome='" + this.nome  + "', funcao='" + this.funcao + "', setor='" + this.setor + "'}";
    }

    public void imprimir() { System.out.println(this); }

    public static Funcionario contruir() {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome:");
        funcionario.nome = scanner.nextLine();
        System.out.println("Função:");
        funcionario.funcao = scanner.nextLine();
        System.out.println("Setor:");
        funcionario.setor = scanner.nextLine();
        return funcionario;
    }
}
