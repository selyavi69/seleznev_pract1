import java.util.Scanner;

public class massiv2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        int i=0;
        do{
            System.out.print("Введите элемент:" + (i+1) + "\n");
            array[i]=scanner.nextInt();
            i++;

        }
        while (i< array.length);
        int sum=0;
        int min= array[0];
        int max= array[0];

        int k=0;
        while (k< array.length) {
            sum = sum + array[k];

            if (array[k] < min) {
                min = array[k];
            }
            if (array[k] > max) {
                max = array[k];
            }
            k++;
        }

        System.out.println("Сумма элементов: "+ sum);
        System.out.println("Минимальный элемент: "+ min);
        System.out.println("Максимальный элемент: "+ max);
    }
}
