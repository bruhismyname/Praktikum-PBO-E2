/*  Nama File   : MainDAO.java
 *  Deskripsi   : Main program untuk menguji DAO
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Mei 2025
 */

public class MainDAO {
    public static void main(String args[]) {
        // Person person = new Person("Indra");
        Person person = new Person("Rajwaa");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}