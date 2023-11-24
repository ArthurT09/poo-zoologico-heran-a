package zoologico;

import java.util.Scanner;

public class Animal {
    private String nome;
    private String especie;
    private String alimentacao;

    public Animal(){
    }

    public String toString() {
        return "Animal{nome='" + this.nome + "', especie='" + this.especie + "',alimentacao='" + this.alimentacao + "'}";
    }

    public void imprimir() { System.out.println(this); }

    public static Animal construir() {
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome:");
        animal.nome = scanner.nextLine();
        System.out.println("Espécie:");
        animal.especie = scanner.nextLine();
        System.out.println("Alimentação:");
        animal.alimentacao = scanner.nextLine();
        return animal;
    }
}
