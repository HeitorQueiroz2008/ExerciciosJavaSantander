public final class HalfpriceTicket extends Ticket{
    @Override
    public void calculateFinalValue() {
        setFinalValue(getBaseValue() * 0.5);
    }
}
