public final class FamilyTicket extends Ticket{

    @Override
    public void calculateFinalValue() {

        if (getPeople() > 3) {
            setFinalValue(getBaseValue() * 0.95 * getPeople());
        } else if (getPeople() > 0){
            setFinalValue(getBaseValue() * getPeople());
        } else {
            System.out.println("Insira um valor válido!!!");
        }
    }
}
