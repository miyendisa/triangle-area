import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        int firstLength,secondLength,thirdLength;
        double semiPerimeter,area;
        Scanner input=new Scanner(System.in);
        System.out.print("Üçgenin 1. Kenar Uzunuluğu:");
        firstLength=input.nextInt();
        System.out.print("Üçgenin 2. Kenar Uzunuluğu:");
        secondLength=input.nextInt();
        System.out.print("Üçgenin 3. Kenar Uzunuluğu:");
        thirdLength=input.nextInt();
        semiPerimeter= (double) (firstLength+secondLength+thirdLength)/2;
        area= (semiPerimeter*(semiPerimeter-firstLength)*(semiPerimeter-secondLength)*(semiPerimeter-thirdLength));
        System.out.print("Üçgenin Alanı:"+Math.sqrt(area));
    }
}
