package com.homework.book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        int l = authors.length;
        this.authors = new Author[l];
        for (int i = 0; i < l; i++){
            this.authors[i] = new Author(authors[i].getName(),
                                         authors[i].getEmail(),
                                         authors[i].getGender());
        }
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        int l = authors.length;
        this.authors = new Author[l];
        for (int i = 0; i < l; i++){
            this.authors[i] = new Author(authors[i].getName(),
                    authors[i].getEmail(),
                    authors[i].getGender());
        }
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }//Not safe
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) { this.price = price; }
    public int getQty() { return qty; }
    public void setQty() { this.qty = qty; }

    public String getAuthorNames() {
        String authorNames = "";
        int l = this.authors.length;
        for (int i = 0; i < l; i++) {
            authorNames += authors[i].getName() + " ";
        }
        return authorNames;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}
