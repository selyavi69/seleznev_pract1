public class Massiv {
    public static void main(String[] args){
        int [] array={ 17, 34, 7, 9, 19};
        int sum=0;

        for (int i=0;i<array.length;i++){
            sum= sum+ array[i];
        }
        double srednee_znachenie=(double) sum/ array.length;

        System.out.println("Сумма элементов маccива:" + sum);
        System.out.println("Среднее арифметическое элементов: " + srednee_znachenie);
    }

}
