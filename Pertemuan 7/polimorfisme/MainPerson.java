/*  Nama File   : MainPerson.java
 *  Deskripsi   : Polimorfisme di Java ditunjukkan dengan kelas Person yang memiliki metode isAsleep(hr) dan status(hr), sementara kelas Student melakukan override pada metode isAsleep(hr).
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class MainPerson {
  public static void main(String[] args) {
    Person p;
    p = new Student("Sally");
    p.status(1);
  }
}

class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public boolean isAsleep(int hr) {
    return 22 < hr || 7 > hr;
  }

  @Override
  public String toString() {
    return name;
  }

  public void status(int hr) {
    if (this.isAsleep(hr)) {
      System.out.println("Now offline: " + this);
    } else {
      System.out.println("Now online: " + this);
    }
  }
}

class Student extends Person {
  public Student(String name) {
    super(name);
  }

  @Override
  public boolean isAsleep(int hr) {
    return 2 < hr && 8 > hr;
  }
}

/*
 * Pertanyaan:
 * Jika main method seperti di atas dieksekusi, apa output yang dihasilkan?
 * Jelaskan bagaimana hasil tersebut diperoleh (hint: apakah “this” pada
 * kelas Person dalam method status dieksekusi saat compile time atau runtime).
 *
 * Jawaban:
 * 1. Output: "Now online: Sally"
 * 2. Penjelasan:
 * - Variabel `p` bertipe `Person`, tetapi mengacu pada objek `Student`
 *   (polimorfisme).
 * - Ketika `p.status(1)` dipanggil, method `status` milik `Person` yang dipanggil.
 * - Di dalam method `status`, `this.isAsleep(1)` dipanggil. `this` merujuk pada
 *   objek `Student` saat runtime.
 * - Karena `Student` meng-override method `isAsleep`, maka `Student.isAsleep(1)`
 *   yang dieksekusi (dynamic dispatch).
 * - Method `Student.isAsleep(1)` mengembalikan `false` (karena 1 tidak berada di
 *   antara 2 dan 8).
 * - Akibatnya, blok `else` dalam method `status` dijalankan, mencetak "Now online: "
 *   diikuti dengan `this`.
 * - `this` (objek `Student`) memanggil method `toString()`. Karena method `toString()`
 *   tidak di-override di `Student`, maka method `toString()` milik `Person` digunakan,
 *   yang menghasilkan "Sally".
 * - Oleh karena itu, penentuan method `isAsleep` yang dipanggil oleh `this` terjadi
 *   saat *runtime*.
 */