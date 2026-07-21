public sealed class Ticket permits HalfpriceTicket, FamilyTicket{

    //Variáveis
    protected double baseValue;

    protected String movieName;

    protected boolean isDubbed;

    protected double finalValue;

    protected int people;

    //Getters e Setters
    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }

    public void setDubbed(boolean dubbed) { isDubbed = dubbed; }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public void calculateFinalValue() { this.finalValue = baseValue; }

    public double getBaseValue() {
        return baseValue;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getPeople() {
        return people;
    }

    public double getFinalValue() { return finalValue; }
}
