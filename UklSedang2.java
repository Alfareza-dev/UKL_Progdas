public class UklSedang2 {
    static double hitungvolume(double r, double t){ 
    double n = 3.14;

    double volume = n * r * r * t; 
    return volume; 
}

public static void main(String[] args) {
double hasilvolume = hitungvolume(18, 10); 
System.out.println("Volume tabung: " + hasilvolume);
}
}
