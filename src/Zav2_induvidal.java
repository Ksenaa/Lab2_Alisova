import java.util.InputMismatchException;
import java.util.Scanner;

public class Zav2_induvidal {

    public static int Mass(String kil){
        Scanner sc = new Scanner(System.in, "cp1251");
        int byte_arr = 0;
        if (!kil.matches("-?\\d+")){
            throw new IllegalArgumentException("Вибачте, але ви ввели не число");
        }else byte_arr = Integer.parseInt(kil);
        if (byte_arr>127 || byte_arr<-128) {
            throw new IllegalArgumentException("Число(а) не входить(ять) у діапазон байту.");
        }
        return byte_arr;
    }

    public static int Sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length;i++) {
            sum=sum+arr[i];
        }
        if (sum>127 || sum<-128) {
            throw new IllegalArgumentException("Вибачте, але сума елементів не входить у діапазон байту");
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("________________________________________________________________________");
        System.out.println("Якщо хочете закінчити роботу програми, натисніть будь ласка 0");
        System.out.println("________________________________________________________________________");
            Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введіть послідовно 2 елементу");
        int kil = 0;
        while (true) {
            int[] arr = new int[kil];
            String[] mass = new String[2];
            int suma = 0;

            for (int i = 0; i < arr.length; i++) {
                mass[i] = sc.nextLine();
                arr[i] = Mass(mass[i]);
            }
            if (kil==0) break;
            suma = Sum(arr);
            System.out.println("Сума ваших елементів:");
            System.out.println(suma);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        }

    }
}
