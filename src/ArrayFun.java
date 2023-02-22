public class ArrayFun {

    public static void main(String[] args) {
        //declare an empty double array of size 6
        double[] doubleArray = new double[5];
        //declare an array of 10 ints
        int[] intArray = {1,2,3,4,47,6,7,8,9,10};
        //how are these elements organized?

        //getting a value
        int fifthElement = intArray[4];
        System.out.println(fifthElement);
        //replacing a value
        intArray[2] = 69;
        System.out.println(intArray[2]);
        //getting the length of an array
        System.out.println("array length: " + intArray.length);
        System.out.println();
        ///////////////traversing arrays/////////////////

        //printing all the values in an array
        System.out.println("While loop:");
        //while loop
        int myVar = 0;
        while(myVar < intArray.length)
        {
            System.out.println(intArray[myVar]);
            myVar++;
        }

        System.out.println("For loop:");
        //for loop
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }



        //find and print the index of the value of 47
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 47)
            {
                System.out.println("The number 47 can be found at index " + i);
            }
        }

        //find and print the max value in nums
        int maxNum = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if(maxNum < intArray[i])
            {
                maxNum = intArray[i];
            }
        }
        System.out.println(maxNum + " is the largest number in intarray");
    }

}
