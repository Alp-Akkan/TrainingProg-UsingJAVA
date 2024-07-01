public class Training {
    private int bench_sayisi;
    private int overhead_sayisi;
    private int deadlift_sayisi;
    private int squat_sayisi;
    public Training(int bench_sayisi, int overhead_sayisi, int deadlift_sayisi, int squat_sayisi) {
        this.bench_sayisi = bench_sayisi;
        this.overhead_sayisi = overhead_sayisi;
        this.deadlift_sayisi = deadlift_sayisi;
        this.squat_sayisi = squat_sayisi;
    }
    public int getBench_sayisi() {
        return bench_sayisi;
    }
    public void setBench_sayisi(int bench_sayisi) {
        this.bench_sayisi = bench_sayisi;
    }
    public int getOverhead_sayisi() {
        return overhead_sayisi;
    }
    public void setOverhead_sayisi(int overhead_sayisi) {
        this.overhead_sayisi = overhead_sayisi;
    }
    public int getDeadlift_sayisi() {
        return deadlift_sayisi;
    }
    public void setDeadlift_sayisi(int deadlift_sayisi) {
        this.deadlift_sayisi = deadlift_sayisi;
    }
    public int getSquat_sayisi() {
        return squat_sayisi;
    }
    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }


    public void hareketYap(String hareketTuru , int sayi )
    {
        if(hareketTuru.equals("Bench"))
        {
            benchYap(sayi);
        }
        else if(hareketTuru.equals("Overhead"))
        {
            overheadYap(sayi);
        }

        else if (hareketTuru.equals("Deadlift"))
        {
            deadliftYap(sayi);
        }
        else if(hareketTuru.equals("Squat"))
        {
            squatYap(sayi);
        }

        else{
            System.out.println("Geçersiz Hareket");
        }





    }


    public void benchYap (int sayi )
    {
        if(bench_sayisi==0)
        {
            System.out.println("Bench Sayısı bitti");

        }
        if(bench_sayisi - sayi <0)
        {
            System.out.println("Hedefini Aştın Tebrik Ederim");

            bench_sayisi = 0 ;
            System.out.println("Kalan Bench Sayısı " + bench_sayisi);
        }

        else
        {
            bench_sayisi-=sayi;
            System.out.println("Kalan bench Sayisi " + bench_sayisi);
        }


    }


    public void overheadYap(int sayi)
    {
        if(overhead_sayisi == 0 )
        {
            System.out.println("Overhead Hareket Sayısı Bitti");
        }
        if (overhead_sayisi - sayi <0)
        {
            System.out.println("Hedifini Geçtin TEbrik ederim");
            overhead_sayisi = 0 ;
            System.out.println("Kalan overhead Sayısı " + overhead_sayisi);

        }
        else
        {
            overhead_sayisi -=sayi ;
            System.out.println("Kalan overhead Sayisi " + overhead_sayisi);
        }
    }

    public void deadliftYap(int sayi)
    {
        if(deadlift_sayisi ==0)
        {
            System.out.println("DeadLift antreman sayınız Kalmamıştır.");

        }
        if(deadlift_sayisi- sayi < 0)
        {
            System.out.println("Tebrikler deadlift hedef sayıyı aştınız ");
            deadlift_sayisi = 0 ;
            System.out.println("Kalan deadlift sayısı " + deadlift_sayisi);
        }

        else
        {
            deadlift_sayisi -=sayi ;

            System.out.println("Kalan deadlift antreman sayısı" + deadlift_sayisi);
        }


    }
    public void squatYap(int sayi)
    {
        if(squat_sayisi ==0)
        {
            System.out.println("squat antreman sayınız Kalmamıştır.");

        }
        if(squat_sayisi- sayi < 0)
        {
            System.out.println("Tebrikler squat hedef sayıyı aştınız ");
            squat_sayisi = 0 ;
            System.out.println("Kalan deadlift sayısı " + squat_sayisi);
        }

        else
        {
            squat_sayisi -=sayi ;

            System.out.println("Kalan squat antreman sayısı" + squat_sayisi);
        }


    }

    public boolean  isTrainingOver ()
    {
        return (bench_sayisi== 0 ) && (overhead_sayisi==0) && (deadlift_sayisi==0)&& (squat_sayisi==0);
    }






}
