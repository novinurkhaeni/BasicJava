package BootcampQA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class BookHashMap {
    public static void main(String[] args) {
        //Membuat objek hashmap
        HashMap<String, BooksClass> books = new HashMap<>();

        //Membuat objek buku
        BooksClass javaBook = new BooksClass("Book 1", "Author 1", "ISBN 1", 2000);
        BooksClass kotlinBook = new BooksClass("Book 2", "Author 2", "ISBN 2", 3000);
        BooksClass androidBook = new BooksClass("Book 3", "Author 3", "ISBN 3", 4000);

        // mengisi objek hashmap dengan objek buku
        books.put("java", javaBook);
        books.put("kotlin", kotlinBook);
        books.put("android", androidBook);

        //cetak
        for(Map.Entry b: books.entrySet()){
            BooksClass book = (BooksClass) b.getValue();
            System.out.println(b.getKey() + ": "+ book.getTitle() + ", " + book.getAuthor() + ", " + book.getPublisher() + ", " + book.getPages());
        }
    }

}
