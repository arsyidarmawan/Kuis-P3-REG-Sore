import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {

        String fileName = "src/pegawai.txt" ;

        try {
            // membaca file
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);

            // cetak isi file
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }

    }
}