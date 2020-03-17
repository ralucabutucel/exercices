import javafx.util.Pair;

import java.util.Arrays;
import java.util.Scanner;

public class problem1 {
    //1. Write a program to calculate the sum and average of the values from an array and to find the min and max values.
public static void main (String[] args)
{
    String  [] c = new String [5];
    c = new String[]{"s", "k", "z", "n", "g"};
    int a []= {1, 2, 3, 4, 5};
    int sum = 0;
    int average = 0;
     int num1 = 5;

    for(int i = 0; a.length - 1 > i; i++ )
    {
    sum = sum + a[i];
    }
average=  sum / 5;

    int min, max;

    for(int i = 0; i < a.length -1; i++)
    {   if(a[i] < a[i+1])
      {
        min = a[i];
        max = a[i + 1];
      }
      else
      {
        min = a[i +1];
        max = a[i];
      }
        System.out.println(min);
        System.out.println(max);
    }

    System.out.println(sum);
    System.out.println(average);


    validation();
    int secondm = second(a, num1);
    readadd();
    rectangle();
    reverse();
    temperature();
    sorting(a, c);
    iterating();
    grid();
    generates();
    days();
    pozitive();
    nterms();
    npalindrome();
    order();
    verification();
    convert();
    decimaltobinary();
}
//2. Write a program to test if an array contains a specific value. Specific value is given as console input.

public static int second(int [] b ,int num){


    b = new int[]{1, 2, 3, 4, 5};
    System.out.println(" please provide that number that you want ot find");
    Scanner in = new Scanner(System.in);
     num = in.nextInt();

    for(int i= 0; i < b.length -1; i++)
    {
        if(b[i] == num)
        {
            System.out.println("the number was found in the list");
        }
         System.out.println("the number is not present in the list");

    }
    return num;
}

//3. Write a program to sort a numeric array and a string array.
public static Pair sorting(int []a, String [] b)
    {   Pair sorted = new  Pair();
        int a []= {1, 2, 3, 4, 5};
        b = new String[5];
        b = new String[]{"s", "k", "z", "n", "g"};
        Arrays.sort(b);
        Arrays.sort(a);


        for(int i = 0;i < a.length - 1; i++)
        {
            System.out.println("the sorted ones:" + a[i]);
        }
        for(int j = 0; j < b.length -1; j++)
        {
            System.out.println("the sorted ones:" + b[j]);
        }
      return true;
    }
// 4. Write a program to copy all the even numbers from an array by iterating the array.
public static void iterating(){

    int a[] = {1, 2, 3, 5, 4, 6 };
    int[] b = new int[3];
    int[] c = new int[3];
    int j = 0;
    int k = 0;
 for (int i = 0; i <a.length - 1; i++ ){
     if(a[i] % 2 == 0)
     {
       b[j] =  a[i];
       j++;
     }
     else
     {
       c[k] = a[i];
       k++;
     }

     for (i = 0; i <b.length - 1; i++ ){
         System.out.println(b[1]); // the even
     }

     for (j = 0; j <c.length - 1; j++ ){
         System.out.println(c[1]); // the odd
     }
 }
}

// 5. Write a program to print the following grid. Each print statement should be 1 char.
public static  void grid(){
    int [][]a = new int[10][54];



}

    //Write a program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
// Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
    public static void pozitive() {

        Scanner in = new Scanner(System.in);
        System.out.print("Please provide the number: ");
        double number = in.nextDouble();

    if (number > 0)
    {
        System.out.print("pozitive number");
        if(number <1)
        {
            System.out.print("pozitive small number");
        }
        if(number > 1000000)
        {
            System.out.print("prozitive large number");
        }

    }
    else if(number < 0)
    {
        System.out.print("negative number");
    }
     else if(number == 0)
    {
        System.out.print("Zero");
    }

    }


    /**
     */
    // Write a program that takes a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
    public static void generates() {
        Scanner in = new Scanner(System.in);
        System.out.print("add value: ");
        int input = in.nextInt();

        if(input == 1)
        {
            System.out.print("Monday");
        }
        if(input == 2)
        {
            System.out.print("Tuesday");
        }
        if(input == 3)
        {
            System.out.print("Wednesday");
        }
        if(input == 4)
        {
            System.out.print("Thursday");
        }
        if(input == 5)
        {
            System.out.print("Friday");
        }
        if(input == 6)
        {
            System.out.print("Saturday");
        }
        if(input == 7)
        {
            System.out.print("Sunday");
        }
    }

    //Write a program to find the number of days in a month.
    public static void days() {
        Scanner in = new Scanner(System.in);
        System.out.print("add value: ");
        int input = in.nextInt();
        if(input == 1)
        {
            System.out.print("january and it has 31");
        }
        if(input == 2)
        {
            System.out.print("February and it has 29");
        }
        if(input == 3)
        {
            System.out.print("March and it has 31");
        }
        if(input == 4)
        {
            System.out.print("April and it has 30");
        }
        if(input == 5)
        {
            System.out.print("May and it has 31");
        }
        if(input == 6)
        {
            System.out.print("june and it has 30");
        }
        if(input == 7)
        {
            System.out.print("july and it has 31");
        }
        if(input == 8)
        {
            System.out.print("August and it has 30");
        }
        if(input == 9)
        {
            System.out.print("September and it has 31");
        }
        if(input == 10)
        {
            System.out.print("October and it has 30");
        }
        if(input == 11)
        {
            System.out.print("November and it has 31");
        }
        if(input == 12)
        {
            System.out.print("December and it has 31");
        }
    }

    // Write a program that takes the user to provide a single character from the alphabet.
    // Print Vowel or Consonant, depending on the user input.
// If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
    public static void validate() {
        Scanner in = new Scanner(System.in);
        System.out.print("add value: ");
        int input = in.nextInt();



    }

// Write a program to display n terms of natural numbers and their sum.
public static void nterms() {
    Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    int input = in.nextInt();
    int sum = 0;
    for(int i = 0; i <= input; i++)
    {
      System.out.println("the numbers are: " +i);
      sum = sum + i;
    }
    System.out.println("the sum is:" +sum);

}
//Write a program to check if a string given as input is a palindrome.
public static void npalindrome() {
    Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    int input = in.nextInt();
    int output = 0;
    int n = 0;
    while(input != 0)
    {
        n = input % 10;
        output = output *10 +n;
        n = n / 10;
    }
    if(input == output)
    {
        System.out.println("the number is a palindrom");
    }
    else
    {
        System.out.println("the number is not a palindrom");
    }
}

//Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
// "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
public static void  order() {


        System.out.println("Please provide the first number");
        Scanner in = new Scanner(System.in);
        System.out.print("add value: ");
        int input1 = in.nextInt();

    System.out.println("Please provide the first number");
    Scanner in2 = new Scanner(System.in);
    System.out.print("add value: ");
    int input2 = in2.nextInt();

    System.out.println("Please provide the first number");
    Scanner in1 = new Scanner(System.in);
    System.out.print("add value: ");
    int input3 = in1.nextInt();

    if(input1 < input2 && input2 < input3)
    {
        System.out.println("the numbers are in increasing order");
    }
    else if(input3 < input2 && input2 > input1)
    {
        System.out.println("the numbers are in decreasing order");
    }
    else
        System.out.println("there is no order");
}

//Write a program to convert temperature from Fahrenheit to Celsius degree.
public static void temperature() {
    System.out.println("Please provide temperature in celsius");
        Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    double inputC = in.nextDouble();
    double outputF = (inputC  * (9/5)) + 32;
    System.out.println("From celsius to Fahrenheit is :" +outputF);
    System.out.println("Please provide temperature in Fahrenheit");
    Scanner in1 = new Scanner(System.in);
    System.out.print("add value: ");
    double input1F = in1.nextDouble();
    double output1C = input1F * (5 / 9) - 32 * (5 / 9);
    System.out.println("From Fahrenheit to celsius is :" +output1C);

}
//Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
public static void readadd() {
    System.out.println("Please provide the number that you want to use");
        Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    int input = in.nextInt();
    int sum = 0;
    while(input % 10 != 0)
    {
        sum = input % 10;
        input = input /10;
    }
    System.out.println("the sum is :" + sum);
}

// Write a program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds),
// and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
public static void convert() {
    System.out.println("Please provide the distance");
    Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    int distance = in.nextInt();

    System.out.println("Please provide the hours spent");
    Scanner in1 = new Scanner(System.in);
    System.out.print("add value: ");
    int hours = in1.nextInt();

    System.out.println("Please provide the minutes spent");
    Scanner in2 = new Scanner(System.in);
    System.out.print("add value: ");
    int minutes = in2.nextInt();

    System.out.println("Please provide the seconds spent");
    Scanner in3 = new Scanner(System.in);
    System.out.print("add value: ");
    int seconds = in3.nextInt();
float timesec = (hours*3600) + (minutes*60) + seconds;
float mpsec = distance / timesec;
float kmpsec = (distance / 1000.0f) /(timesec /1000.0f);
float milespsec = (kmpsec / 1.609f);

    System.out.println("meters per second: " +mpsec);
    System.out.println("Km per second:" +kmpsec);
    System.out.println("miles per second:" +milespsec);
}

//16. Write a program that accepts two integers from the user and then prints the sum, the difference, the product, the average,
// the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
public static void verification() {
    System.out.println("Please provide the first number");
    Scanner in1 = new Scanner(System.in);
    System.out.print("add value: ");
    int input1 = in1.nextInt();

    System.out.println("Please provide the second number");
    Scanner in2 = new Scanner(System.in);
    System.out.print("add value: ");
    int input2 = in2.nextInt();
    int sum = 0;
    int produs = 0;
    int average = 0;
    int distance = 0;
    int max = 0;
    int min = 0;
    while(input1 != 0 && input2 != 0)
    {
        sum = input1 + input2;
        produs = input1 * input2;
        average = sum / 2;
        if(input1 > input2)
        {
            distance = input1 - input2;
            max = input1;
            min = input2;
        }
        else {
            distance = input2 - input1;
            max = input2;
            min = input1;
        }
        System.out.println("the sum is:" +sum);
        System.out.println("the produs is:" +produs);
        System.out.println("the average is:" +average);
        System.out.println("the distance is:" +distance);
        System.out.println("the max is:" +max);
        System.out.println("the min is:" +min);

    }
}

//Write a program to get whole and fractional parts from a double value.
public static void validation() {
    System.out.println("Please provide the number that you want to use");
    Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    double input = in.nextDouble();
    int a;
    double f;
    while(input != 0)
    {
        f = input - (int) input;
        a = (int) input;
        System.out.println("the integer part is:" +a);
        System.out.println("the fractional part is:" +f);
    }


}

//Write a program to reverse an integer number.
public static void reverse() {
    Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    int input = in.nextInt();
    int reversen = 0;
    int rest;
    while(input != 0)
    {
      rest = input % 10;
      reversen = reversen * 10 + rest;
      input = input / 10;
    }

    System.out.println("the reverse number is: " +reversen);
}
//19. Write a program to print the area and perimeter of a rectangle given the width and height.
public static void rectangle() {
    System.out.println("please provide the width ");
    Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    int width = in.nextInt();

    System.out.println("please provide the width ");
    Scanner in1 = new Scanner(System.in);
    System.out.print("add value: ");
    int height = in1.nextInt();

int p = height + height + width + width;
   System.out.println("the perimeter is the rectangle is:" +p );
int area = width * height;
   System.out.println("the area of the rectangle is: " +area);
}
//20. Write a program to convert a decimal number to binary number.
public static void decimaltobinary() {
    Scanner in = new Scanner(System.in);
    System.out.print("add value: ");
    int input = in.nextInt();
    int b[] = new int[10];
    int j = 0;
    while (input > 0)
    {
        b[j++] = input%2;
        input = input/2;
    }

    for (int i = j-1; i >= 0; i--)
    {
        System.out.println("the binary number is: " +b[i]);
    }

    }

}
