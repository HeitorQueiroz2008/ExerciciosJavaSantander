public final class HalfpriceTicket extends Ticket{
    @Override
    public void calculeFinalValue() {
        this.finalValue = baseValue * 0.5;
    }
}
