public class English extends Human {

    // Konstruktor för klassen "Spanish" som tar emot en strängparameter "name"
    public English(String name) {
        // Anropar överklassens konstruktor med parametern "name"
        super(name);
    }

    //skriver ut det på språket samt namnet på personen
    public void talk() {
        System.out.println("Hello, my name is " + name + ".");
    }
}
