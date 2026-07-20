public final class HalfpriceTicket extends Ticket{
    @Override
    public void setFinalValue(double finalValue) {
        finalValue = baseValue * 0.5;
    }
}
