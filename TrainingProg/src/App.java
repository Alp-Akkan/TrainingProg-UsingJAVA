import java.util.Scanner;
public class App {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoşgeldiniz");


        String training = "Hareketler. \n "+"Bench \n"+"Overhead \n"+" Deadlift \n"+"Squat \n ";
        System.out.println(" ");
        
        System.out.println( "Training");

        System.out.println("Program Oluşturun ");

        System.out.println("Bench Sayısı giriniz");
        int Bench = scanner.nextInt();
        System.out.println("Overhead Sayısı giriniz:");
        int overhead = scanner.nextInt();
        System.out.println("Deadlift sayısı giriniz");
        int deadlift = scanner.nextInt();
        System.out.println("Squat sayısı giriniz");
        int squat = scanner.nextInt();


        System.out.println(" ***************  ");

        Training training1 = new Training(Bench, overhead, deadlift, squat); 
        System.out.println("Start Training");

        while (training1.isTrainingOver() ==false)
        {
            System.out.println("Hareketler  ( Bench, overhead, deadlift, squat)");
            String round = scanner.nextLine();

        System.out.println("Hareketten Yapacağınız sayıyı giriniz:");
        int sayi = scanner.nextInt();

        scanner.nextLine();
        training1.hareketYap(round, sayi);



        }


        System.out.println("Great Work  ");


    }
}
