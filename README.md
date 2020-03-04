# Double-base-Palindromes-and-Complexity-Analysis
A palindrome is a sequence that reads the same backwards as forwards.
For example: 86668 and 100111001 are examples of a decimal and binary palindrome, respectively.
For this assignment, you are going to write an application which tests if a sequence of numbers is a palindrome or not. Specifically, you are going to write four different methods (with meaningful names) which take a String as a parameter and returns a Boolean which represents whether or not the String is a palindrome:
1. Method One:
a. You should reverse all the characters in the String using a loop and then compare the reversed String to the original to determine if it is a palindrome.
b. Return either true or false depending on the comparison.
2. Method Two:
a. In this method, we are going to compare the characters on an element by element basis using a loop. We will compare the first element to the last, the second element to the second last and so on..
b. If at any point there is no match, we will immediately stop and return false. If we make it through the full sequence and they all match, then we will return true.
3. Method Three:
a. In this method, we are going to use the ArrayStack and ArrayQueue implementations from Blackboard.
b. Add each character (digit) to both a stack and a queue as it is read.
c. After all characters have been put onto both the stack and the queue, start removing characters from both the stack and the queue, and comparing them. If the word is a palindrome, the first character popped will be the same as the first character dequeued, and so on for the second and subsequent characters until the stack and queue are empty.
d. If there is a mismatch at some point, return false. Otherwise return true.
4. Method Four:
a. Firstly, create a separate method (called reverse) that uses recursion to reverse the characters in a provided String and return the answer (as the reversed String).
b. In “Method Four”, compare the original String to the output that was returned from this recursive method to test if it is a palindrome.
c. Return true or false depending on the comparison
You are going to test these methods using both decimal and binary numbers. For this reason, you will need to create a utility method which converts a decimal number into its equivalent binary representation and then returns it.
• This method will have one parameter which will be a String representation of the decimal number.
• It will return the binary representation of the number as a String variable
