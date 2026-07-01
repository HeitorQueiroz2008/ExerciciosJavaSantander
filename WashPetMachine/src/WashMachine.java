import java.util.Scanner;

public class WashMachine {

    //Variáveis
    Scanner scanner = new Scanner(System.in);

    private boolean isFull;

    private boolean isDirt;

    private int waterLevel;

    private int shampooLevel;

    //Métodos
    public void addPet(){
        if (!isFull && !isDirt){
            isFull = true;
            isDirt = true;
            System.out.println("O pet foi adicionado à máquina!");
        } else if (isFull){
            System.out.println("A máquina já está ocupada!");
        } else {
            System.out.println("A máquina está suja!\nlimpe-a para usar");
        }
    }

    public void takeOffPet(){
        if (isFull){
            isFull = false;
            System.out.println("O pet foi retirado da máquina!");
            if (isDirt){
                System.out.println("Você sujou a máquina!\nLimpe-a para continuar usando...");
            }
        } else {
            System.out.println("A máquina já está vazia!");
        }
    }

    public void cleanMachine(){
        if (isDirt) {
            if (waterLevel >= 3 && shampooLevel >= 1){
                waterLevel -= 3;
                shampooLevel -= 1;
                isDirt = false;
                System.out.printf("A máquina foi limpa!\nNível atual de água: %s L\nNível atual de shampoo: %s L\n", waterLevel, shampooLevel);
            } else {
                System.out.printf("Sem recursos suficiente. Abasteça!\\nNível atual de água: %s L\\nNível atual de shampoo: %s L\n", waterLevel, shampooLevel);
            }
        } else {
            System.out.println("A máquina já está limpa!");
        }
    }

    public void giveWash(){
        if (waterLevel >= 10 && shampooLevel >= 2){
            waterLevel -= 10;
            shampooLevel -= 10;
            isDirt = false;
            System.out.println("Pet limpo com sucesso! Retire-o da máquina");
        } else {
            System.out.println("Recursos insuficientes! Verifique os níveis de água e shampoo para continuar com a limpeza...");
            System.out.printf("Nível de água: %s L \nNível de shampoo: %s L \n", getWaterLevel(), getShampooLevel());
        }
    }

    public void refillWater (){

        if ((waterLevel) < 29) {
            waterLevel += 2;
            System.out.printf("Água abastecida! \nNível atual: %s L\n", waterLevel);
        } else {
            waterLevel = 30;
            System.out.println("Limite máximo de água alcançado!\nNível atual: 30 L");
        }
    }

    public void refillShampoo(){

        if ((shampooLevel) < 9) {
            shampooLevel += 2;
            System.out.printf("Shampoo abastecido! \nNível atual: %s L\n", shampooLevel);
        } else {
            shampooLevel = 10;
            System.out.println("Limite máximo de shampoo alcançado!\nNível atual: 10 L");
        }
    }

    //Getters e Setters


    public int getWaterLevel() {
        return waterLevel;
    }

    public int getShampooLevel() {
        return shampooLevel;
    }

    //Builder
    public WashMachine(){
        isDirt = false;
        isFull = false;
        waterLevel = 15;
        shampooLevel = 5;
    }
}
