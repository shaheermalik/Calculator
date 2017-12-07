public class Calculator {

    private double total;

    private double product;

    private double average;

    private double nums;

    private double num1;

    private double num2;

    private int i;

    private int h;



    public static double findSum(double num1,double num2){

        return num1+num2;

    }

    public static double findSum(double [] nums) {

        double total = 0;

        for (int i=0; i<nums.length; i++) {

            total +=nums[i];

        }

        return total;

    }

    public static double findSum(String [] nums){

        double [] doubleNums = new double [nums.length];

        for (int i=0; i<nums.length; i++) {

            doubleNums[i] = Double.parseDouble(nums[i]);

        }
        return findSum(doubleNums);

    }

    public static double findAverage(double [] nums) {

        int i =0;

        double average, sum= 0;

        while (i<nums.length) {

            sum = sum + nums[i];

            i++;

        }
        average = sum/nums.length;

        return average;

    }

    public static double findAverage(String []nums) {

        double [] doubleNums = new double [nums.length];

        for (int i=0; i<nums.length; i++) {

            doubleNums[i] = Double.parseDouble(nums[i]);

        }
        return findAverage(doubleNums);

    }

    public static double findProduct(double num1, double num2) {

        return num1*num2;

    }

    public static double findProduct(double []nums){

        double product = 1;

        for (int i=0; i<nums.length; i++){

            product =product*nums[i];

        }

        return product;
    }

    public static double findProduct(String [] nums ){

        double [] doubleNums = new double[nums.length];

        for(int i=0; i<nums.length; i++){

            doubleNums[i] = Double.parseDouble(nums[i]);

        }

        return findProduct(doubleNums);

    }

    public double findFactorial(double num1) {

        double factorial = 1;

        for (int h = 1; h < num1; h++) {

            factorial = factorial * h;

        }

        return factorial;



    }

    public double findFactorial(double [] nums) {

        double factorial =1;

        for (int i=0; i<nums.length; i++){

            for (int h=2; h<=nums[i]; h++) {

                factorial = factorial * h;
            }

        }

        return factorial;

    }

    public double findFactorial(String [] nums ) {

        double [] doubleNums = new double [nums.length];

        for (int i=0; i<nums.length; i++){

            doubleNums[i] = Double.parseDouble(nums[i]);
        }
        return findFactorial(doubleNums);

    }
}