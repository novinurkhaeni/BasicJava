package BootcampQA.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        //membuat objek hashmap
        HashMap<Integer, String> days = new HashMap<>();

        //mengisi nilai objek hashmap
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");

        System.out.println(days);

        // mengambil Wednesday
        System.out.println(days.get(3));

        // mengubah hari sunday menjadi hari minggu
        days.put(7, "Minggu");

        // mengubah hari rabu menjadi rabo
        days.replace(3, "Rabu");

        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);

        // menghapus sunday
        days.remove(7);
        System.out.println("Isi objek days: " + days);

        // menghapus semua hari <-- oh tidak kiamat donk!
        days.clear();
        System.out.println("Isi objek days: " + days);

    }
}
