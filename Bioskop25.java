/**
 * Bioskop25
 */
public class Bioskop25 {
public static void main(String[] args) {
    String [][] Penonton = new String [4][2];
    Penonton [0][0] = "Amin";
    Penonton [0][1] = "Bena";
    Penonton [1][0] = "Candra";
    Penonton [1][1] = "Dela";
    Penonton [2][0] = "Eka";
    Penonton [2][1] = "Farhan";
    Penonton [3][0] = "Gisel";
    Penonton [3][1] = "Hanna";
    
System.out.printf("%s \t %s \n", Penonton [0][0], Penonton [0][1]);
System.out.printf("%s \t %s \n", Penonton [1][0], Penonton [1][1]);
System.out.printf("%s \t %s \n", Penonton [2][0], Penonton [2][1]);
System.out.printf("%s \t %s \n", Penonton [3][0], Penonton [3][1]);
System.out.println(Penonton.length);
System.out.println(Penonton[0].length);
System.out.println(Penonton[1].length);
System.out.println(Penonton[2].length);
System.out.println(Penonton[3].length);

}
    
}