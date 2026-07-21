public final class FamilyTicket extends Ticket{
    private int people;

    public void setPeople(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    @Override
    public void calculeFinalValue() {

        if (this.people > 3) {
            this.finalValue = baseValue * 0.95;
        } else if (this.people > 0){
            this.finalValue = baseValue;
        } else {
            System.out.println("Insira um valor válido!!!");
        }
    }
}
