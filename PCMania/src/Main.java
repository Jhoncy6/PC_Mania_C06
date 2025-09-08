import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println(" Olá, sejá bem vindo(a) a nossa loja PC MANIA :");
        System.out.println("-----------------------");
        System.out.println("Para começar as compras, primeiro pedimos que voce se registre");
        System.out.println("Qual é o seu nome?");
        String c1Nome = leitor.nextLine();
        System.out.println("Qual é o seu CPF?");
        String c1Cpf = leitor.nextLine();
        Cliente cliente1 = new Cliente(c1Nome, c1Cpf);
        System.out.println("Olá" + c1Nome + "Abaixo está a nossa seleção de computadores na promoção!");
        System.out.println("Para escolher as prmoções, basta digitar o número de cada uma. Se quiser digite 0 ");

        System.out.println("================== Promoção 01 ===============");
        Computador c1 = new Computador("Apple", 475);
        
        c1.getHardwares()[0].setNome("Pentium Core i3");
        c1.getHardwares()[0].setCapacidade(3200);
        c1.getHardwares()[1].setNome("Memoria RAM");
        c1.getHardwares()[1].setCapacidade(8);
        c1.getHardwares()[2].setNome("HD");
        c1.getHardwares()[2].setCapacidade(500);
        c1.getSistemaOperacional().setNome("macOs Sequoia");
        c1.getSistemaOperacional().setTipo(64);
        c1.mostrarPcConfigs();

        System.out.println("================== Promoção 02 ===============");
        Computador c2 = new Computador("Samsung", 1709);
        c2.getHardwares()[0].setNome("Pentium Core i5");
        c2.getHardwares()[0].setCapacidade(3370);
        c2.getHardwares()[1].setNome("Memoria Ram");
        c2.getHardwares()[1].setCapacidade(16);
        c2.getHardwares()[2].setNome("HD");
        c2.getHardwares()[2].setCapacidade(1);
        c2.getSistemaOperacional().setNome("Windows 8");
        c2.getSistemaOperacional().setTipo(64);
        c2.mostrarPcConfigs();

        System.out.println("================== Promoção 03 ===============");
        Computador c3 = new Computador("Dell", 6153);
        c3.getHardwares()[0].setNome("Pentium Core i7");
        c3.getHardwares()[0].setCapacidade(4500);
        c3.getHardwares()[1].setNome("Memoria RAM");
        c3.getHardwares()[1].setCapacidade(32);
        c3.getHardwares()[2].setNome("HD");
        c3.getHardwares()[2].setCapacidade(2);
        c3.getSistemaOperacional().setNome("Windows 10");
        c3.getSistemaOperacional().setTipo(64);
        c3.mostrarPcConfigs();




    }
}