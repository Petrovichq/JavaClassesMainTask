package com.home.study;

class DataBase {
    private Book[] base ;
    private boolean emptyFlag = true;

    DataBase() {
        this.base = new Book[1];
    }

    DataBase(int countOfBooks) {
        this.base = new Book[countOfBooks];
        emptyFlag = false;
    }

    void print(){
        for (Book b:base) {
            System.out.println(b.toString());
        }
    }

    void add(Book input){
        if(emptyFlag){
            base[0] = input;
            emptyFlag = false;
        }
        else {
            int length = base.length + 1;
            Book[] largerBase = new Book[length];
            for (int i = 0; i < base.length; i++) {
                largerBase[i] = base[i];
            }
            largerBase[length - 1] = input;
            this.base = largerBase;
        }
    }

    void createRandomBase(int numberOfBooks){
        this.base = new Book[numberOfBooks];
        emptyFlag = false;
        for (int i = 0; i < numberOfBooks; i++) {
            Book newRandomBook = new Book();
            newRandomBook.random();
            base[i] = newRandomBook;
        }
    }

    DataBase sortByAuthor(String requestAuthor){
        DataBase dataBaseTemp = new DataBase();
        for (Book b: base) {
            if(b.getAuthor().equals(requestAuthor)){ dataBaseTemp.add(b); }
        }
        return dataBaseTemp;
    }

    DataBase sortByPublishing(String requestPublishing) {
        DataBase dataBaseTemp = new DataBase();
        for (Book b: base) {
            if(b.getPublishing().equals(requestPublishing)){ dataBaseTemp.add(b); }
        }
        return dataBaseTemp;
    }

    DataBase sortByYear(int requestAuthor) {
        DataBase dataBaseTemp = new DataBase();
        for (Book b: base) {
            if(b.getYearOfPublication() > requestAuthor){ dataBaseTemp.add(b); }
        }
        return dataBaseTemp;
    }
}
