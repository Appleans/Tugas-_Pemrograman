//TANPA RETURN
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Formatwaktu {
     public static void main(String[] args) {

        // tanpa RETURN
        // Mendapatkan waktu lokal saat ini
        LocalDateTime waktusekarang = LocalDateTime.now();
        
        // Membuat formatter untuk format tanggal dan waktu
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Memformat waktu sesuai dengan formatter yang telah dibuat
        String formatwaktu = waktusekarang.format(format);
        
        // Mencetak waktu yang diformat
        System.out.println("Waktu saat ini: " + formatwaktu);
    }
}
