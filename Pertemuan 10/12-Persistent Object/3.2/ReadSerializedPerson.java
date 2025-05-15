/*  Nama File   : ReadSerializePerson.java
 *  Deskripsi   : Program untuk serialisasi objek Person
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Mei 2025
 */

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Serialized Person Name = "+person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}