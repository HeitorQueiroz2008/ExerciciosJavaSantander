public final class HalfpriceTicket extends Ticket{

    @Override
    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue * 0.5;
    }

}
