/*  Nama File   : SerializePerson.java
 *  Deskripsi   : Program untuk serialisasi objek Person
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Mei 2025
 */

import java.io.*;

// Class Person
class Person implements Serializable {
    private String name;
    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

// Class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objeck person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}