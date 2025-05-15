package exercicio5;


//APENAS O MAIN FOI GERADO POR IA

public class Main {
    public static void main(String[] args) {
        // 1) Cria os personagens
        Warrior warrior = new Warrior("Conan");
        Archer archer   = new Archer("Legolas");
        Wizard wizard   = new Wizard("Gandalf");

        // 2) Mostra o HP inicial de cada um
        System.out.println("=== HP Inicial ===");
        printHp(warrior);
        printHp(archer);
        printHp(wizard);
        System.out.println();

        // 3) Turno de combate
        // Warrior ataca Archer
        System.out.println(warrior.getName() + " attacks " + archer.getName());
        warrior.attack(archer);

        // Archer ataca Wizard
        System.out.println(archer.getName() + " attacks " + wizard.getName());
        archer.attack(wizard);

        // Wizard ataca Warrior
        System.out.println(wizard.getName() + " attacks " + warrior.getName());
        wizard.attack(warrior);

        System.out.println();

        // 4) Mostra o HP após o turno
        System.out.println("=== HP Após 1 Turno ===");
        printHp(warrior);
        printHp(archer);
        printHp(wizard);
    }

    // Método auxiliar para imprimir nome + HP
    private static void printHp(Character c) {
        System.out.printf("%s: %d HP%n", c.getName(), c.getHp());
    }
}
