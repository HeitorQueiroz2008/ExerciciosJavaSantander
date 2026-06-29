import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Menu interativo
        var car1 = new Car();
        System.out.println("Bem vindo ao seu carro!");
        System.out.println("Seu carro está desligado!");

        while (true) {
            System.out.println("Selecione alguma opção para continuar: \n[1] Ligar/Desligar carro \n[2] Aumentar marcha \n[3] Diminuir marcha \n[4] Acelerar \n[5] Diminuir velocidade \n[6] Virar pra esquera \n[7] Virar pra direita \n[0] Encerrar programa \n");
            var answer = scanner.nextInt();

            if (answer == 1) {
                car1.turnOnOffCar();
            }

            if (answer == 2) {
                car1.increaceGear();
            }
        }

    }
}
