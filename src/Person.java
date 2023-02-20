public class Person {
    protected    String name;
    protected String surname;
    protected int amountOfTickets;
    public Person(String name, String surname, int amountOfTickets){
        this.name = name;
        this.surname = surname;
        this.amountOfTickets = amountOfTickets;
    }
    public void setAmountOfTickets(int amountOfTickets){
        this.amountOfTickets = amountOfTickets;
    }

}
