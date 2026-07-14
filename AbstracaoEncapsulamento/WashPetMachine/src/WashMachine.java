public class WashMachine {

    //Variáveis

    private boolean isFull;

    private boolean isDirt;

    private boolean petDirt;

    private int waterLevel;

    private int shampooLevel;

    //Métodos
    public void addPet() {
        if (!isFull && !isDirt) {
            isFull = true;
            isDirt = true;
            petDirt = true;
            System.out.println("\nO pet foi adicionado à máquina!\n");
        } else if (isFull) {
            System.out.println("\nA máquina já está ocupada!\n");
        } else {
            System.out.println("\nA máquina está suja!\nlimpe-a para usar\n");
        }
    }

    public void removePet() {
        if (isFull) {
            isFull = false;
            System.out.println("\nO pet foi retirado da máquina!\n");
            if (isDirt) {
                System.out.println("\nVocê sujou a máquina!\nLimpe-a para continuar usando...\n");
            }
        } else {
            System.out.println("\nA máquina já está vazia!\n");
        }
    }

    public void cleanMachine() {
        if (isDirt) {
            if (waterLevel >= 3 && shampooLevel >= 1) {
                waterLevel -= 3;
                shampooLevel -= 1;
                isDirt = false;
                System.out.printf("\nA máquina foi limpa!\nNível atual de água: %s L\nNível atual de shampoo: %s L\n\n", waterLevel, shampooLevel);
            } else {
                System.out.printf("\nSem recursos suficiente. Abasteça!\\nNível atual de água: %s L\\nNível atual de shampoo: %s L\n", waterLevel, shampooLevel);
            }
        } else {
            System.out.println("\nA máquina já está limpa!\n");
        }
    }

    public void giveWash() {
        if (isFull && petDirt) {
            if (waterLevel >= 10 && shampooLevel >= 2) {
                waterLevel -= 10;
                shampooLevel -= 2;
                isDirt = false;
                petDirt = false;
                System.out.println("\nPet limpo com sucesso! Retire-o da máquina\n");
            }
        }
        if (!petDirt) {
            System.out.println("\nO pet já foi lavado! Retire-o da máquina para prosseguir!\n");
        } else if (!isFull) {
            System.out.println("\nA máquina está vazia! Insira um pet para lavá-lo\n");
        } else {
            System.out.println("\nRecursos insuficientes! Verifique os níveis de água e shampoo para continuar com a limpeza...");
            System.out.printf("\nNível de água: %s L \nNível de shampoo: %s L \n\n", getWaterLevel(), getShampooLevel());
        }

    }

    public void refillWater() {

        if ((waterLevel) < 28) {
            waterLevel += 2;
            System.out.printf("\nÁgua abastecida! \nNível atual: %s L\n", waterLevel);
        } else {
            waterLevel = 30;
            System.out.println("\nLimite máximo de água alcançado!\nNível atual: 30 L\n");
        }
    }

    public void refillShampoo() {

        if ((shampooLevel) < 8) {
            shampooLevel += 2;
            System.out.printf("\nShampoo abastecido! \nNível atual: %s L\n", shampooLevel);
        } else {
            shampooLevel = 10;
            System.out.println("\nLimite máximo de shampoo alcançado!\nNível atual: 10 L\n");
        }
    }

    //Getters e Setters


    public int getWaterLevel() {
        return waterLevel;
    }

    public int getShampooLevel() {
        return shampooLevel;
    }

    public boolean isFull() {
        return isFull;
    }

    //Builder
    public WashMachine() {
        isDirt = false;
        isFull = false;
        waterLevel = 15;
        shampooLevel = 5;
    }
}
