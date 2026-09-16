package day9.t03;

public class Book {
    private String name;
    private int price;
    private String author;
    public Book(){

    }
    public Book(String name, int price, String author){
        this.name=name;
        this.price=price;
        this.author=author;
    }

    public String toString(){
        return "Book{"+
                "name='"+name+'\''+
                ",author='"+author+'\''+
                '}';
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
