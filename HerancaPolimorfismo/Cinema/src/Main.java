import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var ticket = new HalfpriceTicket();
        System.out.println("Digite o valor do ticket: ");
        ticket.baseValue = scanner.nextInt();
        ticket.calculeFinalValue();
        System.out.println(ticket.finalValue);
    }
}
