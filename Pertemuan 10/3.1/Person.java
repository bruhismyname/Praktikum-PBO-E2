/*  Nama File   : Person.java
 *  Deskripsi   : Person database model
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Mei 2025
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}