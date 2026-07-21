public final class FamilyTicket extends Ticket{
    private int people;

    public void setPeople(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    @Override
    public void calculateFinalValue() {

        if (people > 3) {
            finalValue = baseValue * 0.95 * people;
        } else if (people > 0){
            finalValue = baseValue * people;
        } else {
            System.out.println("Insira um valor válido!!!");
        }
    }
}
