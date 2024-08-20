package BootcampQA.HashMap;

public class BooksClass {
    private String title;
    private String author;
    private String publisher;
    private int pages;

    public BooksClass(String title, String author, String publisher, int pages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
