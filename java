This is the code foe the given question 
class Solution {
    static String armstrongNumber(int n){
        int originalNumber = n;
        int numberOfDigits = String.valueOf(n).length();
        int sum = 0;
      
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }

        if (sum == originalNumber) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
The function armstrongNumber(int n) takes an integer n as input and returns a string "Yes" if it is an Armstrong number, otherwise "No".
  
Inside the function:

originalNumber is assigned the value of n, which stores the original number for later comparison.
numberOfDigits calculates the number of digits in the given number n.
sum is initialized to 0 to store the sum of the cubes of the digits.
The while loop continues until n becomes 0.
  
Inside the loop:

digit extracts the last digit of n using the modulo operator %.
Math.pow(digit, numberOfDigits) calculates the cube of the digit.
This cube is added to sum.
n is then divided by 10 to remove the last digit.
  
After the while loop, if sum is equal to the originalNumber, it means that the sum of the cubes of the digits is equal to the original number.
In this case, the function returns "Yes" indicating that the number is an Armstrong number.

If sum is not equal to originalNumber, it means the number is not an Armstrong number, so the function returns "No".
  
Given number: 153

originalNumber is assigned the value of n, so originalNumber becomes 153.
numberOfDigits calculates the number of digits in the given number n, which is 3.
sum is initialized to 0.
  
Now, we enter the while loop:

Iteration 1:
digit is 153 % 10 = 3.
Math.pow(digit, numberOfDigits) calculates 3^3 = 27.
sum becomes 0 + 27 = 27.
n becomes 153 / 10 = 15.
  
Iteration 2:
digit is 15 % 10 = 5.
Math.pow(digit, numberOfDigits) calculates 5^3 = 125.
sum becomes 27 + 125 = 152.
n becomes 15 / 10 = 1.
  
Iteration 3:
digit is 1 % 10 = 1.
Math.pow(digit, numberOfDigits) calculates 1^3 = 1.
sum becomes 152 + 1 = 153.
n becomes 1 / 10 = 0.
The while loop ends because n becomes 0.
  
Since sum (153) is equal to originalNumber (153), the function returns "Yes", indicating that 153 is an Armstrong number.
So, for the given number 153, the function will return "Yes" as the output.
