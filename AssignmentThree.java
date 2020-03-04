public class AssignmentThree
{   //Declare any global variables required (e.g. operation counts for each method)
    public static int count1 = 0;
    public static int count2 = 0;
    public static int count3 = 0;
    public static int count4 = 0;

    //global variables for storing the number of operations at 100k increments
    public static int val1 = 0;
    public static int val2 = 0;
    public static int val3 = 0;
    public static int val4 = 0;
    public static int val5 = 0;
    public static int val6 = 0;
    public static int val7 = 0;
    public static int val8 = 0;
    public static int val9 = 0;
    public static int val10 = 0;

    //Main Method
    public static void main (String[] args)
    {
        String palindrome;
        //Declare any variables used (e.g. for timing etc.)
        double start     = 0;
        double end       = 0;
        float timeTaken = 0.0F;

        //Testing each method (looping over the binary/decimal numbers for each)
        //testing the first method

        //setting the counters to 0
        int decimalAndBinary = 0;
        int decimalCount = 0;
        int binaryCount = 0;

        boolean decimalResult;
        boolean binaryResult;

        //testing the first method
        start = System.currentTimeMillis();
        for (int i = 0; i <= 1000000 ; i++)
        {
            //checking decimal numbers for palindromes
            palindrome = Integer.toString(i);
            decimalResult = stringReverse(palindrome);

            //converting the counter to a string then converting the decimal string to binary
            palindrome = decimalToBinary(Integer.toString(i));
            //checking binary numbers for palindromes
            binaryResult = stringReverse(palindrome);

            //if both the decimal and binary results are true then the decimal, binary
            //and decimal and binary counters are incremented
            if (decimalResult && binaryResult)
            {
                decimalAndBinary++;
                decimalCount++;
                binaryCount++;
            }
            //if only the decimal result is true then only the decimal counter is incremented
            else if(decimalResult)
            {
                decimalCount++;
            }
            //if only the binary result is true then only the binary counter is incremented
            else if(binaryResult)
            {
                binaryCount++;
            }

            operations(i, count1);
        }
        end = System.currentTimeMillis();
        //printing out the results
        System.out.println("Method 1 String Reverse, Time taken: " + (end-start) + " ms");
        System.out.println("\tDecimal Palindromes: " + decimalCount);
        System.out.println("\tBinary Palindromes: " + binaryCount);
        System.out.println("\tBoth decimal and binary Palindromes: " + decimalAndBinary);
        System.out.println("\tPrimitive Operations: " + count1 + "\n");

        decimalAndBinary = 0;
        decimalCount = 0;
        binaryCount = 0;

        //testing the second method
        start = System.currentTimeMillis();
        for (int i = 0; i <= 1000000 ; i++)
        {
            //checking decimal numbers for palindromes
            palindrome = Integer.toString(i);
            decimalResult = charComparison(palindrome);

            //converting the counter to a string then converting the decimal string to binary
            palindrome = decimalToBinary(Integer.toString(i));
            //checking binary numbers for palindromes
            binaryResult = charComparison(palindrome);

            //if both the decimal and binary results are true then the decimal, binary
            //and decimal and binary counters are incremented
            if (decimalResult && binaryResult)
            {
                decimalAndBinary++;
                decimalCount++;
                binaryCount++;
            }
            //if only the decimal result is true then only the decimal counter is incremented
            else if(decimalResult)
            {
                decimalCount++;
            }
            //if only the binary result is true then only the binary counter is incremented
            else if(binaryResult)
            {
                binaryCount++;
            }

            operations(i, count2);
        }
        end = System.currentTimeMillis();
        //printing out the results
        System.out.println("Method 2 Character Comparison, Time taken: " + (end-start) + " ms");
        System.out.println("\tDecimal Palindromes: " + decimalCount);
        System.out.println("\tBinary Palindromes: " + binaryCount);
        System.out.println("\tBoth decimal and binary Palindromes: " + decimalAndBinary);
        System.out.println("\tPrimitive Operations: " + count2);

        decimalAndBinary = 0;
        decimalCount = 0;
        binaryCount = 0;

        //testing the third method
        start = System.currentTimeMillis();
        for (int i = 0; i <= 1000000 ; i++)
        {
            //checking decimal numbers for palindromes
            palindrome = Integer.toString(i);
            decimalResult = stackQueue(palindrome);

            //converting the counter to a string then converting the decimal string to binary
            palindrome = decimalToBinary(Integer.toString(i));
            //checking binary numbers for palindromes
            binaryResult = stackQueue(palindrome);

            //if both the decimal and binary results are true then the decimal, binary
            //and decimal and binary counters are incremented
            if (decimalResult && binaryResult)
            {
                decimalAndBinary++;
                decimalCount++;
                binaryCount++;
            }
            //if only the decimal result is true then only the decimal counter is incremented
            else if(decimalResult)
            {
                decimalCount++;
            }
            //if only the binary result is true then only the binary counter is incremented
            else if(binaryResult)
            {
                binaryCount++;
            }

            operations(i, count3);
        }
        end = System.currentTimeMillis();
        //printing out the results
        System.out.println("Method 3 Stack Queue, Time taken: " + (end-start) + " ms");
        System.out.println("\tDecimal Palindromes: " + decimalCount);
        System.out.println("\tBinary Palindromes: " + binaryCount);
        System.out.println("\tBoth decimal and binary Palindromes: " + decimalAndBinary);
        System.out.println("\tPrimitive Operations: " + count3);


        decimalAndBinary = 0;
        decimalCount = 0;
        binaryCount = 0;

        //testing the fourth method
        start = System.currentTimeMillis();
        for (int i = 0; i <= 1000000 ; i++)
        {
            //checking decimal numbers for palindromes
            palindrome = Integer.toString(i);
            decimalResult = stringRecursion(palindrome);

            //converting the counter to a string then converting the decimal string to binary
            palindrome = decimalToBinary(Integer.toString(i));
            //checking binary numbers for palindromes
            binaryResult = stringRecursion(palindrome);

            //if both the decimal and binary results are true then the decimal, binary
            //and decimal and binary counters are incremented
            if (decimalResult && binaryResult)
            {
                decimalAndBinary++;
                decimalCount++;
                binaryCount++;
            }
            //if only the decimal result is true then only the decimal counter is incremented
            else if(decimalResult)
            {
                decimalCount++;
            }
            //if only the binary result is true then only the binary counter is incremented
            else if(binaryResult)
            {
                binaryCount++;
            }

            operations(i, count4);
        }
        end = System.currentTimeMillis();
        //printing out the results
        System.out.println("Method 4 String Recursion, Time taken: " + (end-start) + " ms");
        System.out.println("\tDecimal Palindromes: " + decimalCount);
        System.out.println("\tBinary Palindromes: " + binaryCount);
        System.out.println("\tBoth decimal and binary Palindromes: " + decimalAndBinary);
        System.out.println("\tPrimitive Operations: " + count4);
    }
    //Static method for: Palindrome Method 1
    //Takes a String as a parameter and return a Boolean value
    public static boolean stringReverse(String s)
    {
        String sReversed    = "";
        boolean answer      = true;
        count1 += 2;
        //loop that reverses the String
        for(int i = s.length() - 1; i >= 0; i--)
        {
            sReversed += s.charAt(i);
        }
        count1 += 6*(s.length()) - 4;
        int i;
        for(i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != sReversed.charAt(i))
            {
                count1 += 2;
                answer = false;
                break;
            }
        }
        count1 += (2 * (i + 1) + 2 * ((i + 1) - 1));
        count1 += 1;
        return answer;
    }
    //Static method for: Palindrome Method 2
    //Takes a String as a parameter and return a Boolean value
    public static boolean charComparison(String s)
    {
        char front;
        char back;
        boolean answer = true;

        count2 += 3;

        //loop that iterates through half the length of the String
        //since both sides of the string are being compared only half the String length is needed
        //If the String is odd the middle character wont be checked but it doesn't need to be
        //checked as it's in the same position coming from the front or back
        int i;
        for(i = 0; i < s.length()/2; i++)
        {
            front = s.charAt(i);
            back = s.charAt(s.length()-(i+1));

            //if the front and back value aren't equal the boolean is set to false and
            //the loop is broken
            if(front != back)
            {
                count2 += 2;
                answer = false;
                break;
            }
        }
        count2 += 2*(i+1) + 2*(i+1) + 2*(i) +2*(i) + 1;
        return answer;
    }
    //Static method for: Palindrome Method 3
    //Takes a String as a parameter and return a Boolean value
    public static boolean stackQueue(String s)
    {
        ArrayStack stack = new ArrayStack();
        ArrayQueue queue = new ArrayQueue();
        boolean answer = true;
        count3 += 3;

        //pushing and enqueuing characters to the stack and queue
        int i;
        for(i = 0; i < s.length(); i++)
        {
            stack.push(s.charAt(i));
            queue.enqueue(s.charAt(i));
        }
        count3 += 2*(i+1) + 2*(i-1) + 4*(i+1) + 4*(i+1) + 4*(i+1);
        //loop comparing the characters from the stack and queue

        for (i =  0; i < s.length()/2 ; i++)
        {
            //if the character at the top of the stack and the front of the queue aren't
            //equal the result is set to false and the loop is broken
            if(stack.top() != queue.front())
            {
                count3 += 2;
                answer = false;
                break;
            }
            //characters that have been checked for equality are removed from the
            //stack and queue
            stack.pop();
            queue.dequeue();
        }
        count3 += 2*(i+1)+2*(i) + 2*(i) + 4*(i+1)+3 + 7;
        return answer;
    }

    //Static method for: Palindrome Method 4
    //Takes a String as a parameter and return a Boolean value
    public static boolean stringRecursion(String s)
    {
        boolean answer = true;
        count4 += 1;

        int i;
        for (i = 0; i < s.length()/2; i++)
        {
            if(s.charAt(i) != reverseString(s).charAt(i))
            {
                answer = false;
                break;
            }
        }
        count4 += 2*(i+1) + 2*(i) + 2*4*(s.length()+2)+1;
        return answer;
    }
    //Static method for: Recursively reversing a String
    //Takes a String and returns a String value of it reversed
    public static String reverseString(String s)
    {
        if(s.isEmpty())
            return s;

        //recursively calling the function
        return reverseString(s.substring(1)) + s.charAt(0);
    }
    //Static method for: Converting a decimal number into its equivalent binary representation
    //Takes a String representation of a number as a parameter and return a String value
    public static String decimalToBinary(String s)
    {
        int decimal = Integer.parseInt(s);
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    //Static method for: Keeping track of the number of primitive operations at
    //100k intervals
    public static void operations(int i, int count)
    {
        //when ever the value of the integer i (representing how many numbers have been checked)
        //matches one of the case values the number of operations is assigned to a variable
        switch (i)
        {
            case 100000:
                val1 = count;
                break;
            case 200000:
                val2 = count;
                break;
            case 300000:
                val3 = count;
                break;
            case 400000:
                val4 = count;
                break;
            case 500000:
                val5 = count;
                break;
            case 600000:
                val6 = count;
                break;
            case 700000:
                val7 = count;
                break;
            case 800000:
                val8 = count;
                break;
            case 900000:
                val9 = count;
                break;
            case 1000000:
                val10 = count;
                //Printing out the values recorded
                System.out.println("Operations at;");
                System.out.println("\t100000: " + val1);
                System.out.println("\t200000: " + val2);
                System.out.println("\t300000: " + val3);
                System.out.println("\t400000: " + val4);
                System.out.println("\t500000: " + val5);
                System.out.println("\t600000: " + val6);
                System.out.println("\t700000: " + val7);
                System.out.println("\t800000: " + val8);
                System.out.println("\t900000: " + val9);
                System.out.println("\t1000000: " + val10);
                break;
        }
    }
}