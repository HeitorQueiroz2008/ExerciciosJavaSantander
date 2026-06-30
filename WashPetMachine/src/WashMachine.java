public class WashMachine {

    //Variáveis
    private boolean isFull;

    private boolean isDirt;

    private int waterLevel;

    private int shampooLevel;

    //Métodos
    public void addPet(){
        if (!isFull){
            isFull = true;
            System.out.println("O pet foi adicionado à máquina!");
        } else {
            System.out.println("A máquina já está ocupada!");
        }
    }

    public void giveWash(){
        if (waterLevel >= 10 && shampooLevel >= 2){
            waterLevel -= 10;
            shampooLevel -= 10;
            System.out.println("Pet limpo com sucesso! Retire-o da máquina");
        } else {
            System.out.println("Recursos insuficientes! Verifique os níveis de água e shampoo para continuar com a limpeza...");
            System.out.printf("Nível de água: %s L \nNível de shampoo: %s L \n", getWaterLevel(), getShampooLevel());
        }
    }

    //Getters e Setters


    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getShampooLevel() {
        return shampooLevel;
    }

    public void setShampooLevel(int shampooLevel) {
        this.shampooLevel = shampooLevel;
    }

    //Builder
    public WashMachine(){
        isDirt = false;
        isFull = false;
        waterLevel = 15;
        shampooLevel = 5;
    }
}
