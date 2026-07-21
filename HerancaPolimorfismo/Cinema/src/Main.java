import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("---INGRESSOS DE CINEMA---\n");

        while (true) {
            Ticket ticket = null;
            System.out.println("Escolha o tipo de ingresso: \n[1]Comum\n[2]Meia-entrada\n[3]Família\n[4]Encerrar");
            var choice = scanner.nextInt();

            if (choice == 1){
                ticket = new Ticket();
            } else if (choice == 2){
                ticket = new HalfpriceTicket();
            } else if (choice == 3){
                ticket = new FamilyTicket();
            } else if (choice == 4){
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Digite uma opção válida!!!");
                continue;
            }


        }
    }
}
