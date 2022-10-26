import java.io.FileWriter;
import java.io.IOException;

public class Soal3 {

    public static void main(String[] args) {

        String fileName = "src/pegawai.txt";
        String fileContent = "P2618317|2|Bagus Saputra\n" +
                "P5372883|1|Radika Utama\n" +
                "P2663284|4|Diva Mutiara\n" +
                "P8423089|3|Nazwa Fauzia\n" +
                "P9012715|1|Batara Wirya\n" +
                "P8324920|4|Aruna Zahira";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();

            System.out.println("File sudah ditulis ulang!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
}