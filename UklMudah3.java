public class UklMudah3 {
  public static void main(String[] args) {
   
    for (int i = 200; i >= 100; i--) { 
        if (i == 1) {
            System.out.println(i + ". saya senang");
        }
        else if (i % 3 == 0) {
            System.out.println(i + ". saya anak angkatan 33");
        } else if (i % 3 == 2) {
            System.out.println(i + ". saya anak moklet");
        } else {
            System.out.println(i + ". saya anak wikusama");
        } 
    }
}
}