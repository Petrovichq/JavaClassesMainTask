package com.home.study;

class Book {
    private static int counter = 1;
    private int id = counter ;
    private String title;
    private String author;
    private String publishing;
    private int yearOfPublication;
    private int numberOfPages;
    private int cost;
    private BindingType bindingTip;

    Book() {
        counter++;
    }

    public Book(String title, String author, String publishing, int yearOfPublication, int numberOfPages, int cost, BindingType bindingTip) {
        counter++;
        this.id = counter;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
        this.bindingTip = bindingTip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public BindingType getBindingTip() {
        return bindingTip;
    }

    public void setBindingTip(BindingType bindingTip) {
        this.bindingTip = bindingTip;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfPages=" + numberOfPages +
                ", cost=" + cost +
                ", bindingTip=" + bindingTip +
                '}';
    }
    void random(){
        RandomBook randomBook = new RandomBook();
        this.title = randomBook.getTitle();
        this.author = randomBook.getAuthor();
        this.publishing = randomBook.getPublishing();
        this.yearOfPublication = randomBook.getYearOfPublication();
        this.numberOfPages = randomBook.getNumberOfPages();
        this.cost = randomBook.getCost();
        this.bindingTip = randomBook.getBindingTip();
    }

    Book getRandomBook(){
        counter--;
        Book book = new Book();
        book.random();
        return book;
    }

}
