public class SumOdd {

    private static boolean isOdd(int number){
        if(number < 0 ||(number % 2) == 0){
            return false;
        }else{
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int container = 0;
        if (start >= 0 && end >= 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)){
                    System.out.println("Is an odd number: "+ i);
                    container += i;
                }

            }
        }else{
            System.out.println("Invalid input");
            return -1;
        }
        System.out.println("The total of the addition to all odd numbers (in the range) is: " + container);
        return container;
    }

}
