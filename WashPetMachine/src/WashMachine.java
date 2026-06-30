public class WashMachine {

    //Variáveis
    private boolean isFull;

    private boolean isDirt;

    private int waterLevel;

    private int shampooLevel;

    //Builder
    public WashMachine(){
        isDirt = false;
        isFull = false;
        waterLevel = 15;
        shampooLevel = 5;
    }
}
