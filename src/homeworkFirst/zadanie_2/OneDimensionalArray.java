package homeworkFirst.zadanie_2;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] mass = new int[]{5,6,3,2,5,1,4,9};
        boolean sort = false;
        int temp;
        for (int i = 0; i < 8; i++) {
            System.out.print(mass[i]);
        }
        System.out.println(" ");
        while (!sort) {
            sort = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    sort = false;
                }
            }

        }
        for (int i = 0; i < 8; i++) {
            System.out.print(mass[i]);
        }
    }
}
