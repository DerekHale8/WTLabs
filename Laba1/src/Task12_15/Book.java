package Task12_15;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;

    private String isbn;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title)
                && author.equals(book.author)
                && price == book.price;
    }

    @Override
    public int hashCode(){
        int result = 0;
        result += 3 * (title.hashCode() + author.hashCode());
        return result;
    }

    @Override
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nEdition: " + edition + "\n";
    }

    @Override
    public Book clone() throws CloneNotSupportedException{
        return (Book) super.clone();
    }

    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
