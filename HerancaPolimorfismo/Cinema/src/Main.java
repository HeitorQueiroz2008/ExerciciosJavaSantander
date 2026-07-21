import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var ticket = new FamilyTicket();
        System.out.println("Digite o valor do ticket: ");
        ticket.baseValue = scanner.nextInt();
        System.out.println("Digite a quantidade de pessoas: ");
        ticket.setPeople(scanner.nextInt());
        ticket.calculateFinalValue();
        System.out.println(ticket.finalValue);
    }
}
