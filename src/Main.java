public class Main {
    public static void main(String[] args) {
        System.out.println("массивы часть 2!");
        System.out.println(" задание 1");
        int[] outlay = new int[30];
        for (int index = 0; index < outlay.length; index++) {
            outlay[index] = index * 3_564 + 100_000;
            System.out.println(outlay[index] + " ");
        }
        int sum = 0;
        for (int element: outlay) {
            sum += element;
        }
        System.out.println();
        System.out.println(" Сумма трат за месяц составила " + sum + " рублей.");
    }

}
