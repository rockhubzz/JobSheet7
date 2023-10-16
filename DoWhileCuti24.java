import java.util.Scanner;

public class DoWhileCuti24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti (hari): ");
        jatahCuti= sc.nextInt();

        do{
            System.out.print("Apakah anda ingin mengambil cuti? (y/t): ");
            konfirmasi= sc.next();

            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah cuti yang ingin diambil (hari): ");
                jumlahHari= sc.nextInt();

                if(jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti anda: " +jatahCuti+ " hari.");
                } else{
                    System.out.println("Sisa jatah cuti anda tidak mencukupi.");
                    break;
                }
            }
        } while(jatahCuti > 0);

    }
}
