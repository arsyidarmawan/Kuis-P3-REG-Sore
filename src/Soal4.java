import java.io.FileInputStream;
import java.io.DataInputStream;

class Soal4 {
    public static void main ( String args[] ) {
        String data, namapegawai, idpegawai;
        int golongan, gajipokok = 0;
        double tunjangan = 0, totalgaji = 0.0;
        try {
            FileInputStream fs = new FileInputStream ("src/pegawai.txt");
            DataInputStream di = new DataInputStream (fs);

            System.out.println ("ID Pegawai\tNama Pegawai\tGol\t\tGaji Pokok\tTunjangan\tTotal Gaji");
            System.out.println ("-----------------------------------------------------------------------------");

            while (di.available ( ) != 0) {

                data = di.readLine ( );
                idpegawai = data.substring (0, 8);
                namapegawai = data.substring (11, 23);
                golongan = Integer.parseInt (data.substring (9, 10));

                if (golongan == 1) {
                    gajipokok = 3000000;
                    tunjangan = gajipokok * 0.05;
                    totalgaji = gajipokok + tunjangan;
                } else if (golongan == 2) {
                    gajipokok = 4500000;
                    tunjangan = gajipokok * 0.1;
                    totalgaji = gajipokok + tunjangan;
                } else if (golongan == 3) {
                    gajipokok = 6000000;
                    tunjangan = gajipokok * 0.15;
                    totalgaji = gajipokok + tunjangan;
                } else if (golongan == 4) {
                    gajipokok = 8000000;
                    tunjangan = gajipokok * 0.2;
                    totalgaji = gajipokok + tunjangan;
                }
                System.out.println (idpegawai + "\t" + namapegawai + "\t" + golongan + "\t\t" + gajipokok + "\t\t" + tunjangan + "\t" + totalgaji);
            }
            di.close ( );
        } catch (Exception e) {
            System.err.println ("Ada kesalahan : " + e.getMessage ( ));
        }
    }
}