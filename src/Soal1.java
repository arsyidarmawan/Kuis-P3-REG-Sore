import java.text.DecimalFormat;
import java.util.Scanner;
public class Soal1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        String[] idpasien;
        double pangkat = 2;
        int n;
        Scanner tanggal = new Scanner(System.in);
        Scanner dokter = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Tanggal       : ");
        String tgl = tanggal.next();
        System.out.print("Nama Dokter   : ");
        String dok = dokter.next();
        System.out.println();
        System.out.print("Jumlah Data : ");
        n = input.nextInt();
        input.nextLine();
        System.out.println("===========================================================================================");
        idpasien = new String[n];
        double bmi;
        String status="";
        int[][] nil = new int[n][2];
        for( int i = 0; i < n; i++ ){
            System.out.print("ID Pasien             : ");
            idpasien[i] = input.nextLine();
            System.out.print("Berat Badan (kg)      : ");
            nil[i][0] = input.nextInt();
            System.out.print("Tinggi Badan (cm)     : ");
            nil[i][1] = input.nextInt();
            input.nextLine();
            System.out.println();
        }
        System.out.println("===========================================================================================");
        System.out.println("                              KLINIK GIZI                              ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Dokter  : "+dok);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tTanggal : "+tgl);
        System.out.println("===========================================================================================");
        System.out.println("No \t\t ID Pasien \t\t Berat Badan \t Tinggi Badan \t\t BMI \t\t Status");
        System.out.println("===========================================================================================");
        for(int i=0;i<idpasien.length;i++){
            System.out.print((i+1)+"\t\t\t"+idpasien[i]+"\t\t\t\t");
            for(int j=0;j<2; j++){
                System.out.print(nil[i][j]+"\t\t\t\t");
            }
            double hasilpangkat = Math.pow(nil[i][1],pangkat);
            bmi=(nil[i][0]/hasilpangkat)*10000;
            DecimalFormat df = new DecimalFormat("#.##");
            String hh = df.format(bmi);
            if(bmi>=30) status="Obesitas" ;
            else if(bmi>=25) status="Kelebihan BB" ;
            else if(bmi>=18.5) status="Ideal" ;
            else if(bmi<18.4) status="Kekurangan BB" ;

            System.out.println(hh+"\t\t"+status);
        }
    }
}