package com.home.study;

import java.util.Random;

class RandomBook {
    private String[] exampleOfTitles = {"Hope","First Book","Victory","Strong spirit", "Yes I can", "How to become happy"};
    private String[] examplesOfName = {"J.Smith","Second author","Third author","Forth author"};
    private String[] exampleOfPublishing = {"Great Wall","White coast","Black stone"};

    private String title;
    private String author;
    private String publishing;
    private int yearOfPublication;
    private int numberOfPages;
    private int cost;
    private BindingType bindingTip;

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getPublishing() {
        return publishing;
    }

    int getYearOfPublication() {
        return yearOfPublication;
    }

    int getNumberOfPages() {
        return numberOfPages;
    }

    int getCost() {
        return cost;
    }

    BindingType getBindingTip() {
        return bindingTip;
    }

    RandomBook() {
        this.title = exampleOfTitles[new Random().nextInt(exampleOfTitles.length)];
        this.author = examplesOfName[new Random().nextInt(examplesOfName.length)];
        this.publishing = exampleOfPublishing[new Random().nextInt(exampleOfPublishing.length)];
        this.yearOfPublication = 1950 + new Random().nextInt(65);
        this.numberOfPages = 150 + new Random().nextInt(250);
        this.cost = 20 + new Random().nextInt(40);
        this.bindingTip = BindingType.values()[new Random().nextInt(BindingType.values().length)];
    }


}
