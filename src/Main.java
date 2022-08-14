public class Main {
    public static void main(String[] args) {
        //Задание1 +Задание 2
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i <= numbers.length - 2; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println(numbers[numbers.length - 1]);

        System.out.println(" ");
        float[] numbers1 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i <= numbers1.length - 2; i++) {
            System.out.print(numbers1[i] + ",");
        }
        System.out.println(numbers1[numbers.length - 1]);

        double[] numbers2 = {134.57, 7, 3.9886};
        for (int i = 0; i <= numbers2.length - 2; i++) {
            System.out.print(numbers2[i] + ",");
        }
        System.out.println(numbers2[numbers.length - 1]);
        //Задание3

        for (int i = 2; i >= 1; i--) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println(numbers[0]);

        for (int i = 2; i >= 1; i--) {
            System.out.print(numbers1[i] + ",");
        }
        System.out.println(numbers1[0]);

        for (int i = 2; i >= 1; i--) {
            System.out.print(numbers2[i] + ",");
        }
        System.out.println(numbers2[0]);

        int[] numbers5 = new int[3];
        numbers5[0] = 1;
        numbers5[1] = 2;
        numbers5[2] = 3;
        int a = 0;
        for (int i = 0; i <= numbers5.length - 1; i++) {
            a=numbers5[i];
            if (a % 2 != 0) {
                numbers5[i] = a + 1;
            }
            if(i==2){
            System.out.println(numbers5[i]);
            break;}
            System.out.print(numbers5[i] + ",");

            }
        }
    }