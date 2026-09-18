package day11.t08;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private int price;
    private String author;
    public Book(){

    }
    public Book(String name,int price,String author){
        this.name=name;
        this.price=price;
        this.author=author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

}
