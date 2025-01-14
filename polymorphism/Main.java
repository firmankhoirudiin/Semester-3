package polymorphism;


 // Kelas Abstrak orang
abstract class Orang {
    public abstract void suara();
}

// Kelas pahlawan
class Pahlawan extends Orang {
    @Override
    public void suara() {
        System.out.println("pahlawan: gak papa cerita aja");
    }
}

// Kelas  buaya
class Buaya extends Orang {
    @Override
    public void suara() {
        System.out.println("buaya: udah makan belum");
    }
}

// Kelas  badut
class Badut extends Orang {
    @Override
    public void suara() {
        System.out.println("badut: ang ang ang ang");
    }
}

// Kelas  untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat array orang
        Orang[] orang = new Orang[3];
        
        // Mengisi array dengan objek 
        orang[0] = new Pahlawan();
        orang[1] = new Buaya();
        orang[2] = new Badut();
        
        // Memanggil metode suara() untuk setiap orang
        for (Orang h : orang) {
            h.suara();  // Polimorfisme: memanggil metode yang sesuai dengan objek konkret
        }
    }
}