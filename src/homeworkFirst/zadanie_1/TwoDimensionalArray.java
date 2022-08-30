package homeworkFirst.zadanie_1;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int max=-1;
        int min=11;
        int num=0;
        int summ=0;
        double mid;
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*10) ;
                num++;
                summ = summ + arr[i][j];

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {


                if (min > arr[i][j]) {
                    min = arr[i][j];
                }

                if (max < arr[i][j]) {
                    max = arr[i][j];
                }

            }
        }
        mid=((double)summ/(double)num);


        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        System.out.println("Общее количество переменных "+num);
        System.out.println("Сумма переменных "+summ);
        System.out.println("Среднее значение "+mid);
        System.out.println("Минимальное значение "+min);
        System.out.println("Максимальное значение "+max);
    }
}