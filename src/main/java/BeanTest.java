import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album albumOne = new Album();
        Album albumTwo = new Album(3, "Whitney Houston", "The bodygaurd", 1992, 28.7, "R&B");
        Album albumThree = new Album(31, "Nirvana", "Nevermind", 1991, 17.0, "Acoustic Rock");



        Author mitchAlbom = new Author(1, "Mitch", "Albom");
        Author angieThomas = new Author(2, "Angie", "Thomas");
        Author pauloCoelho = new Author(3, "Paulo", "Coelho");

        Quote quoteOne = new Quote(1, "Don't cling to things because everything is impermanent.", mitchAlbom);
        Quote quoteTwo = new Quote(2, "What's the point of having a voice if you're gonna be silent in those moments you shouldn't be?", angieThomas);
        Quote quoteThree = new Quote(3, "It's the possibility of having a dream come true that makes life interesting.", pauloCoelho);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quoteOne);
        quotes.add(quoteTwo);
        quotes.add(quoteThree);

        System.out.println("ITERATING THROUGH QUOTES");
        for(Quote quote : quotes) {
            System.out.println("Author: " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName() + " | Quote: " + quote.getContent());
        }
    }
}
