import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var washMachine1 = new WashMachine();

        System.out.println("Iniciando máquina...\n");
        while (true) {
            System.out.println("Selecione uma opção para continuar:\n[1] Adicionar pet\n[2] Remover pet\n[3] Dar banho (10L água e 2L shampoo)\n[4] Lavar máquina (3L água e 1L shampoo)\n[5] Abastecer água (+2L)\n[6] Abastecer shampoo (+2L)\n[7] Verificar nível de água\n[8] Verificar nível de shampoo\n[9] Verificar se há pet na máquina\n[0] Encerrar\n");
            var answer = scanner.nextInt();

            if (answer == 1){
                washMachine1.addPet();
            }
            if (answer == 2){
                washMachine1.removePet();
            }
            if (answer == 3){
                washMachine1.giveWash();
            }
            if (answer == 4){
                washMachine1.cleanMachine();
            }
            if (answer == 5){
                washMachine1.refillWater();
            }
            if (answer == 6){
                washMachine1.refillShampoo();
            }
            if (answer == 7){
                System.out.printf("\nNível atual de água: %sL\n\n", washMachine1.getWaterLevel());
            }
            if (answer == 8){
                System.out.printf("\nNível atual de shampoo: %sL\n\n", washMachine1.getShampooLevel());
            }
            if (answer == 9){
                if (washMachine1.isFull()){
                    System.out.println("\nHá um pet na máquina!\n");
                } else {
                    System.out.println("\nA máquina está vazia!\n");
                }
            }
            if (answer == 0){
                System.out.println("\nEncerrando...");
                break;
            }
        }
    }
}
