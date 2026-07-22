public sealed class Ticket permits HalfpriceTicket, FamilyTicket{

    //Variáveis
    private double baseValue;

    private String movieName;

    private boolean isDubbed;

    private double finalValue;

    private int people;

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

    public void setFinalValue(double finalValue) {
        this.finalValue = finalValue;
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
