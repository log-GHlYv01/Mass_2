public class Main {
    public static void main(String[] args) {
                    int arr [] = generateRandomArray();
            //1 задание
            int sum=0;
            for (int i = 0; i< arr.length;i++){
                sum= sum+arr[i];
            }
            System.out.println("Сумма трат за месяц составит " + sum + " рублей");

            // 2 задание
            int max = 99_999;
            int min = 200_001;
            for (int i = 0;i<arr.length; i++){
                if (arr[i] < min){
                    min =arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.printf("Минемальная сумма трат за день будет %d рублей. Максимальная сумма трат за день будет %d рублей. ", min, max);



        }
        private static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int [] arr = new int[30];
            for (int i=0; i<arr.length;i++){
                arr[i]=random.nextInt( 100_000)+100_000;
            }
            return arr;
    }
}