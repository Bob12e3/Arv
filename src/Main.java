public class Main {
    public static void main(String[] args) {
        // Skapar ett nytt Forum-objekt
        Forum forum = new Forum();
        //Skapar en nya instanser av oliak språken och tilldelar det till den person exempel swePerson
        Human swePerson = new Swedish("Bob");
        Human spaPerson = new Spanish("Pique");
        Human engPerson = new English("Miles");
        Human latPerson = new Latin("Oliver");
        // Anropar makePeopleTalk-metoden i forum och så den skriver ut personen till samtliga språk
        forum.makePeopleTalk(swePerson);
        forum.makePeopleTalk(spaPerson);
        forum.makePeopleTalk(engPerson);
        forum.makePeopleTalk(latPerson);

    }
}