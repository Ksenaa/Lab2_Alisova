import java.util.InputMismatchException;
import java.util.Scanner;

public class Zav1_induvidal {
    public static void main(String[] args) {
        System.out.println("________________________________________________________________________");
        System.out.println("Якщо хочете закінчити роботу програми, натисніть будь ласка 0");
        System.out.println("________________________________________________________________________");
        while (true) {
            int kil;
            Scanner sc = new Scanner(System.in, "cp1251");
            System.out.println("\nВведіть розмірність масиву елементів типу byte: ");
            kil = sc.nextInt();
            int[] arr = new int[kil];
            int[] mas = new int [arr.length];
            int sum = 0;
            System.out.println("Введіть послідовно " + kil + " елементу");
//___________________________________________________________________________________________________________
// Перший приклад - програма обробляє виняток та виводить повідомлення на екран.
// Але при цьому не звершує роботу.
            try{
                for (int i = 0; i < arr.length; i++){
                    arr[i] = sc.nextInt();
                }
            }catch (InputMismatchException e){
                System.err.println("Введено не число");
            }
//___________________________________________________________________________________________________________
// Другий приклад - програма також обробляє виняток та виводить повідомлення на екран.
// Але на цьому моменті життя роботи програми завершується .
            try {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]>127 || arr[i]<-128){
                        throw new InputMismatchException("Вибачте, але на цьому життя програми завершується");
                    }
                }
            }catch (InputMismatchException e){
                System.err.println("Число(а) не входить(ять) у діапазон байту.");
            }
            if (kil==0) break;
//___________________________________________________________________________________________________________
// Сума елементів
            System.out.println("Сума ваших елементів: ");
            for(int i=0; i<arr.length;i++) {
                sum=sum+arr[i];
            }
            if (sum>127 || sum<-128) {
                throw new IllegalArgumentException("Вибачте, але сума елементів не входить у діапазон байту");
            }
            System.out.println(sum);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        }
    }
}
