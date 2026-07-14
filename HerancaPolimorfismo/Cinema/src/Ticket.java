public sealed class Ticket permits HalfpriceTicket, FamilyTicket {
    protected double baseValue;

    protected String movieName;

    protected boolean isDubbed;

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }

    public void setDubbed(boolean dubbed) {
        isDubbed = dubbed;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public String getMovieName() {
        return movieName;
    }
}
