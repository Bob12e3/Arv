public class Swedish extends Human {

    // Konstruktor för klassen "Spanish" som tar emot en strängparameter "name"
    public Swedish(String name){
        // Anropar överklassens konstruktor med parametern "name"
        //Om du inte inkluderar "super(name);", kommer överklassens konstruktor inte att kallas och eventuell initialisering som ska göras i överklassen kommer att hoppas över.
        super(name);
    }

    //skriver ut det på språket samt namnet på personen
    public void talk() {
        System.out.println("Hej, jag heter " + name + ".");
    }

}
