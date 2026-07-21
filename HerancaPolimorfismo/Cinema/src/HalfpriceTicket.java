public final class HalfpriceTicket extends Ticket{
    @Override
    public void calculateFinalValue() {
        finalValue = baseValue * 0.5;
    }
}
