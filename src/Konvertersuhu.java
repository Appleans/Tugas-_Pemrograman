//MENGGUNAKAN RETURN
import java.util.Scanner; 

public class Konvertersuhu{
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Konverter Suhu Sederhana");
        System.out.println("==========================================");

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("Hasil konversi: " + fahrenheit + " Fahrenheit");

        scanner.close();
    }
}
