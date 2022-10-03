package Task12_15;

import java.util.Comparator;

public class BookCmptr {
    public Comparator<Book> compareByTitle(){
        return new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
    }

    public Comparator<Book> compareByAuthor(){
        return new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };
    }

    public Comparator<Book> compareByPrice(){
        return new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getPrice() > o2.getPrice() ? 1 : o1.getPrice() < o2.getPrice() ? -1 : 0;
            }
        };
    }

    public Comparator<Book> compareByTitleThanAuthor = compareByTitle().thenComparing(compareByTitle());
    public Comparator<Book> compareByAuthorThanTitle = compareByAuthor().thenComparing(compareByTitle());
    public Comparator<Book> compareByAuthorThanTitleThanPrice = compareByAuthor().thenComparing(compareByTitle()).thenComparing(compareByPrice());
}
