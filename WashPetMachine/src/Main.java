import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var washMachine1 = new WashMachine();

        System.out.println("Iniciando máquina...\n");
        while (true) {
            System.out.println("Selecione uma opção para continuar:\n[1] Adicionar pet\n[2] Remover pet\n[3] Dar banho (10L água e 2L shampoo)\n[4] Lavar máquina (3L água e 1L shampoo)\n[5] Abastecer água (+2L)\n[6] Abastecer shampoo (+2L)\n[7] Verificar nível de água\n[8] Verificar nível de shampoo\n[9] Verificar se há pet na máquina\n");
            break;
        }
    }
}
