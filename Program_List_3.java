import java.lang.reflect.Array;
import java.util.*;

public class Program_List_3 {
    public static void main(String[] args) {
        System.out.println("Program List - 3");

        //Instances of different classes.
        Scanner sc = new Scanner(System.in);

        System.out.print("Program to be displayed: ");
        int programNum = sc.nextInt();

        switch (programNum){
            case 1 -> {
                System.out.println();
                System.out.println("Program-1");
                System.out.println("Even number printer");
                System.out.print("Range: ");
                int n = sc.nextInt();

                for (int i=1; i<=n; i++){
                    if(i%2==0){

                        if(i==n||i==n-1){
                            System.out.print("and "+i+".");
                        } //End of nest if.

                        else {
                            System.out.print(i+", ");
                        }
                    } //End of primary if.
                } //End of primary for loop.
                sc.close();
            } //End of case 1.
            case 2 -> {
                System.out.println();
                System.out.println("Program-2");
                System.out.println("Odd number printer");
                System.out.print("Range: ");
                int n = sc.nextInt();

                for (int i=1; i<=n; i++){
                    if(i%2!=0){

                        if(i==n||i==n-1){
                            System.out.print("and "+i+".");
                        } //End of nest if.

                        else {
                            System.out.print(i+", ");
                        }
                    } //End of primary if.
                } //End of primary for loop.

            } //End of case 2.

            case 3 -> {
                System.out.println();
                System.out.println("Program-3");
                System.out.println("Circle circumference, and area calculator");
                System.out.print("Radius: ");
                double r = sc.nextDouble();

                double cirC = 2*3.14*r;
                double area = 3.14*Math.pow(r, 2);

                System.out.printf("Circumference = %.2f units; Area = %.2f sq.units",cirC,area);

            } //End of case 3.

        case 4 -> {
            System.out.println();
            System.out.println("Program-4");
            System.out.println("Equation roots calculator");
            System.out.println("Enter the values of a, b, and c:-");
            System.out.print("a = ");
            float a = sc.nextFloat();
            System.out.print("b = ");
            float b = sc.nextFloat();
            System.out.print("c = ");
            float c = sc.nextFloat();

            float delta = (float) Math.pow(b,2)-(4*a*c);
            //-b+-sqrt(delta)/2a
            float x1 = (float) ((0-b + Math.sqrt(delta))/(2*a));
            float x2 = (float) ((0-b - Math.sqrt(delta))/(2*a));

            System.out.println("Answers: ");
            System.out.printf("Root-1 = "+ "%.2f\n",x1);
            System.out.printf("Root-2 = "+ "%.2f\n",x2);

            } //End of case 4.

            case 5 -> {
                System.out.println();
                System.out.println("Program-5");
                System.out.println("Circle comparing program");

                System.out.print("Enter x1: ");
                double x1 = sc.nextDouble();

                System.out.print("Enter y1: ");
                double y1 = sc.nextDouble();

                System.out.print("Enter r1: ");
                double r1 = sc.nextDouble();

                System.out.println();

                System.out.print("Enter x2: ");
                double x2 = sc.nextDouble();

                System.out.print("Enter y2: ");
                double y2 = sc.nextDouble();

                System.out.print("Enter r2: ");
                double r2 = sc.nextDouble();

//              Distance between the two centers.
                double c1c2 = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));

                double sumR = r1+r2;
                double d1 = 2*r1;
                double d2 = 2*r2;
                boolean a=false;

                if (c1c2==sumR){
                    System.out.println("Circles are touching each other.");
                }

                if (c1c2>sumR){
                    System.out.println("Circles aren't touching each other.");
                }

                if (c1c2<sumR){
                    System.out.println("Circles are overlapping each other.");

                    if (r1>=d2){
                        System.out.println("Second circle is within first circle.");
                        a=true; /*To prevent the statement from printing two times in-case statements from (c1c2==0)
                        -if statement are also true.*/
                    }

                    if (r2>=d1){
                        System.out.println("First circle is within second circle.");
                        a=true;
                    }

                } //End of (c1c2<sumR)-if statement.

                if (c1c2==0){
                    if (r1>r2 && !a){
                        System.out.println("Second circle is within first circle.");
                    }

                    if (r2>r1 && !a){
                        System.out.println("First circle is within second circle.");
                    }

                    if (r1==r2){
                        System.out.println("Both circles are of same dimensions.");
                    }
                } //End of (c1c2==0)-if statement.

            } //End of case 5.

            case 6 -> {
                System.out.println();
                System.out.println("Program-6");
                System.out.println("Temperature unit converter");
                System.out.println("Choose one of the following:");
                System.out.println("a. Fahrenheit to Celsius");
                System.out.println("b. Celsius to Fahrenheit");
                System.out.print("Response: ");
                char s = sc.next().toLowerCase(Locale.ROOT).charAt(0);
                System.out.print("Enter the temperature: ");
                double temp = sc.nextDouble();

                if (s=='a') {
                    double tempC = (temp-32)*5/9;
                    System.out.printf("The temperature in Celsius is %.2f °C.",tempC);
                } //Choice a.

                if (s=='b') {
                    double tempF = (temp*9/5)+32;
                    System.out.printf("The temperature in Fahrenheit is %.2f °F.",tempF);
                } //Choice b.

                else {
                    System.out.println("Enter a valid response please.");
                }
            } //End of case 6.

            case 7 -> {
                System.out.println();
                System.out.println("Program-7");
                System.out.print("Day to be checked: ");
                sc.nextLine(); //Reads the leftover nextLine().
                String mon2 = sc.nextLine();

                switch (mon2.toLowerCase(Locale.ROOT)) {
                    case "monday", "tuesday", "wednesday", "thursday", "friday"-> System.out.println("It's a Weekday.");
                    case "saturday", "sunday" -> System.out.println("It's a Weekend.");
                    default -> System.out.println("Incorrect format of input.");
                } //End of secondary switch case.
            } //End of case 7.

            case 8 -> {
                System.out.println();
                System.out.println("Program-8");
                System.out.println("Math cards");

                boolean a = false;
                double ans = 0;
                String op = null;


                while (!a) {
                    int min = 1; //Minimum value is inclusive.
                    int max = 11; //Maximum value is exclusive.
                    int x = (int) (Math.random() * (max - min + 1) + min); //Generates random number.

                    int min1 = 1; //Minimum value is inclusive.
                    int max1 = 11; //Maximum value is exclusive.
                    int y = (int) (Math.random() * (max1 - min1 + 1) + min1); //Generates random number.

                    int min2 = 0; //Minimum value is inclusive.
                    int max2 = 3; //Maximum value is inclusive.
                    int i = (int) (Math.random() * (max2 - min2 + 1) + min2); //Generates random number.

                    if (i==0) {
                        ans = y + x;
                        op = "+";
                    }

                    if (i == 1) {
                        ans = y - x;
                        op = "-";
                    }

                    if (i == 2) {
                        ans = (double) y/x;
                        op = "/";
                    }

                    if (i == 3) {
                        ans = y * x;
                        op = "x";
                    }

                    System.out.println("Question: " + y + op + x);
                    System.out.print("Answer: ");
                    double ans1 = sc.nextDouble();

                    if (ans1 == ans) {
                        System.out.println("Correct answer!");
                        a = true;
                    }
                    else {
                        System.out.println("Wrong answer!");
                        System.out.println("Try again.");
                        System.out.println();
                    }
                } //End of while-loop.
            } //End of case 8.

            case 9 -> {
                System.out.println();
                System.out.println("Program-9");
                System.out.println("Greatest Common Divisor Calculator");

                System.out.print("Enter number-1: ");
                int num1 = sc.nextInt();
                System.out.print("Enter number-2: ");
                int num2 = sc.nextInt();

                int x = Math.min(num1, num2);
                int ans=0;

                for (int i = 1; i <=x; i++) {
                    if(num1%i==0 && num2%i==0) {
                        ans=i;
                    }
                } //End of i-for loop.
                System.out.println("Greatest Common Divisor: "+ans);

            } //End of case 9.

            case 10 -> {
                System.out.println();
                System.out.println("Program-10");
                System.out.println("1. Binary to Decimal \n2. Decimal to Hexadecimal \n3. Decimal to Octal");
                System.out.print("Enter the number of conversion operation: ");
                int input = sc.nextInt();

                if (input == 1) {
                    while (true) {
                        //Binary to decimal: beginning
                        System.out.println("\nBinary to decimal");
                        System.out.println("Enter '0' to stop the loop");
                        System.out.print("Enter the binary number to be converted: ");
                        String n = sc.next();

                        if(n.equals("0")){
                            break;
                        }

                        char[] nArr = n.toCharArray();
                        int x = n.length() - 1;
                        double y = 0; //Takes the value 2^i.
                        double deci = 0; //Value of sum of all the 2^x.

                        for (int i = 0; i < n.length(); i++) {
                            if (nArr[i] == '1') {
                                y = Math.pow(2, x); //Assigns the value of 2^x to y. Begins from the greatest power of 2.
                            }

                            if (nArr[i] == '0') {
                                y = 0;
                            } //Ensures that the value of y of previous iteration isn't added to the final answer.

                            deci += y;
                            x--; //To make the transition of 2^10 + 2^9 + 2^8....
                        } //End of i-for loop.

                        System.out.println("Decimal number is: " + deci);
                        //Binary to decimal: end
                    } //End of secondary while loop.
                } //End of if-statement-1.

                if(input==2){
                    while(true) {
                        //Decimal to Hexadecimal: Beginning
                        System.out.println("\nDecimal to hexadecimal");
                        System.out.println("Enter '0' to stop the loop.");
                        System.out.print("Enter the decimal number to be converted: ");
                        int n = sc.nextInt();

                        if(n==0){
                            break;
                        }

                        ArrayList<Object> ans = new ArrayList<>();

                        while (n != 0) {
                            ans.add(n % 16); //Adds the remainder integer to the ArrayList<> ans.
                            n /= 16; //Changes the value of n to the quotient.
                        } //End of secondary while loop.

                        for (int i = 0; i<ans.size()-1; i++) {
                            int y = (int) ans.get(i);



                            switch(y){
                                case 10 -> ans.set(i, 'A');
                                case 11 -> ans.set(i, 'B');
                                case 12 -> ans.set(i, 'C');
                                case 13 -> ans.set(i, 'D');
                                case 14 -> ans.set(i, 'E');
                                case 15 -> ans.set(i, 'F');
                            } //End of secondary switch case.

                            //if-statements, and switch statement both can be used for this program.

                            /*
                            if(y==10){
                                ans.set(i, 'A');
                            }
                            if(y==11){
                                ans.set(i, 'B');
                            }
                            if(y==12){
                                ans.set(i, 'C');
                            }
                            if(y==13){
                                ans.set(i, 'D');
                            }
                            if(y==14){
                                ans.set(i, 'E');
                            }
                            if(y==15){
                                ans.set(i, 'F');
                            }

                             */
                        } //End of i-for loop.

                        System.out.print("Hexa-decimal number: ");
                        for (int i = (ans.size() - 1); i >= 0; i--) {
                            System.out.print(ans.get(i));
                        } //End of for loop.

                        System.out.println();
                        //Decimal to octal: End

                    } //End of primary while loop.

                } //End of if-statement-2.

                if (input==3) {
                    while(true) {
                        //Decimal to octal: Beginning
                        System.out.println("\nDecimal to octal");
                        System.out.println("Enter '0' to stop the loop.");
                        System.out.print("Enter the decimal number to be converted: ");
                        int n = sc.nextInt();

                        if(n==0){
                            break;
                        }

                        ArrayList<Integer> ans = new ArrayList<>();

                        while (n != 0) {
                            ans.add(n % 8); //Adds the remainder integer to the ArrayList<> ans.
                            n /= 8; //Changes the value of n to the quotient.
                        } //End of secondary while loop.

                        System.out.print("Octal number: ");
                        for (int i = (ans.size() - 1); i >= 0; i--) {
                            System.out.print(ans.get(i));
                        } //End of for loop.

                        System.out.println();
                        //Decimal to octal: End

                    } //End of primary while loop.

                } //End of if-statement-3.


            } //End of case 10.

            case 11 -> {
                System.out.println("Program-11");
                System.out.println("Prime number check");
                System.out.print("Enter the number to be checked: ");
                long num6 = sc.nextLong();

                long limit6 = (long)Math.sqrt(num6);
                boolean a = true;

                for(long i=2; i<=limit6; i++){

                    if (num6 % i == 0) /*Condition for non-prime no.*/ {
                        a = false;
                        break;
                    }
                } //End of for loop.

                if(!a) {
                    System.out.println("The number is not a prime number.");
                }

                else {
                    System.out.println("The number is a prime number.");
                }

            } //End of case 11.

            case 12 -> {
                System.out.println();
                System.out.println("Program-12");
                sc.nextLine(); //Reads the leftover new line.
                System.out.print("String to be checked: ");
                String str1 = sc.nextLine();
                str1 = str1.toLowerCase(Locale.ROOT).replaceAll("\\s","");

                char[] chArr = str1.toCharArray();
                char[] chArr1 = new char[str1.length()];

                int x=0;
                for(int i=str1.length()-1; i>=0; i--){
                    chArr1[x]=chArr[i];
                    x++;
                } //Assigns the reverse string of chArr to chArr1.

                if(Arrays.equals(chArr, chArr1)){
                    System.out.println("Palindrome");
                }
                else {
                    System.out.println("Not palindrome");
                }

            } //End of case 12.

            case 13 -> {
                System.out.println();
                System.out.println("Program-13");
                System.out.println("Divisibility checker");
                System.out.println("This program will check whether 'X' is divisible by 'Y' or not.");
                System.out.print("Enter X: ");
                int x = sc.nextInt();

                System.out.print("Enter Y: ");
                int y = sc.nextInt();

                if (x%y==0){
                    System.out.printf("%d is divisible by %d.", x, y);
                }

                else{
                    System.out.printf("%d is not divisible by %d.", x, y);
                }
            } //End of case 13.

            case 14 -> {
                System.out.println();
                System.out.println("Program-14");
                System.out.println("Factor printer");
                System.out.print("Enter number: ");
                int n = sc.nextInt();

                System.out.printf("Factors of %d: ",n);

                for (int i = 1; i <=n; i++) {
                    if(n%i==0){
                        if(i==n) {
                            System.out.print("and "+i+".");
                        }
                        else{
                            System.out.print(i+", ");
                        }
                    }
                } //End of i-for loop.

            } //End of case 14.

            case 15 -> {
                System.out.println();
                System.out.println("Program-15");
                System.out.println("Prime factor printer");
                System.out.print("Enter number: ");
                int n = sc.nextInt();

                System.out.printf("Prime factors of %d: ",n);

                ArrayList<Object> ans = new ArrayList<>();

                for (int i = 2; i<=n; i++) {
                    if(n%i==0){ //Condition for factors to enter the loop ahead.

                        //Prime number checker: beginning
                        long limit6 = (long)Math.sqrt(i);
                        boolean a = true;

                        for(long j=2; j<=limit6; j++){

                            if (i % j == 0) /*Condition for non-prime number.*/ {
                                a = false;
                                break;
                            }
                        } //End of for loop.

                        //Prime number checker: end

                        if(a) {
                                ans.add(i);
                        } //End of a-if-statement.
                    } //End of factors-if-statement.
                } //End of i-for loop.

                if(ans.size()==1){
                    System.out.print("1, ");
                } //If-statement to print '1' in case of prime numbers.

                for (int i = 0; i < ans.size(); i++) {
                    if (i==ans.size()-1){
                        System.out.print("and "+ans.get(i)+".");
                    } //If-statement for printing the term 'and' before the last term.
                    else{
                        System.out.print(ans.get(i)+", ");
                    }
                } //End of ArrayList printer.

            } //End of case 15.

            case 16 -> {
                System.out.println();
                System.out.println("Program-16");
                System.out.println("Prime number checker program has been made for program number 11. Please run the " +
                        "same.");

            } //End of case 16.

            case 17 -> {
                System.out.println();
                System.out.println("Program-16");
                System.out.println("Prime number range printer");
                System.out.print("Enter starting range: ");
                int a= sc.nextInt();
                System.out.print("Enter ending range: ");
                int b= sc.nextInt();

                ArrayList<Object> ans = new ArrayList<>();

                for (int i = a; i<=b; i++) {
                    //Prime number checker: beginning
                    long limit6 = (long)Math.sqrt(i);
                    boolean z=true;

                    for(long j=2; j<=limit6; j++){

                        if (i % j == 0) /*Condition for non-prime number.*/ {
                            z=false;
                            break;
                        }
                    } //End of secondary for loop.
                    //Prime number checker: end

                    if(z){
                        ans.add(i);
                    }

                } //End of primary for-loop.

                for (int x = 0; x < ans.size(); x++) {
                    if (x==ans.size()-1){
                        System.out.print("and "+ans.get(x)+".");
                    } //If-statement for printing the term 'and' before the last term.
                    else{
                        System.out.print(ans.get(x)+", ");
                    }
                } //End of ArrayList printer.

            } //End of case 17.

            case 18 -> {
                System.out.println();
                System.out.println("Program-18");
                System.out.println("Series printer");
                System.out.print("Series-1: ");
                for (int i = 1; i <=97; i+=2) {
                    if(i==97){
                        System.out.println(i+"/"+(i+2));
                    }
                    else {
                        System.out.print(i + "/" + (i + 2) + " + ");
                    }
                }

                System.out.println();

                System.out.print("Enter the number of terms to be printed in series-2: ");
                int n = sc.nextInt();
                
                System.out.print("Series-2: ");
                System.out.print("1 + ");
                int fac=0;

                for (int i=1; i<=n; i++) {
                    for (int j = 1; j <= i; j++) {
                        fac *= j;
                    } //End of for-loop of factorial loop.
                    if (i==n){
                        System.out.println(1+"/"+fac);
                    }
                    else {
                        System.out.print(1 + "/" + fac + " + ");
                    }
                    fac=1;
                } //End of primary for-loop for series-2.

                System.out.println();
                System.out.print("Series-3: ");

                for (int i = 1; i <=624; i++) {
                    System.out.print(1+"/"+(Math.sqrt(i)+Math.sqrt(i+1))+" + ");

                } //End of primary for-loop for series-3.

            } //End of case 18.

            case 19 -> {
                System.out.println();
                System.out.println("Program-19");
                System.out.println("Perfect number tester");
                System.out.print("Enter the number to be tested: ");
                int n = sc.nextInt();

                int sum=0;

                for (int i = 1; i <n; i++) {
                    if(n%i==0){
                        sum+=i;
                    }
                } //For-loop for adding all factors.

                if (sum==n){
                    System.out.printf("%d is a perfect number.", n);
                }

                else{
                    System.out.printf("%d is not a perfect number.", n);
                }

            } //End of case 19.

            case 20 -> {
                System.out.println();
                System.out.println("Program-20");
                System.out.println("Odd position character printer");
                System.out.print("Enter the string: ");
                String n = sc.next();

                for (int i = 0; i < n.length(); i+=2) {
                    System.out.print(n.charAt(i)+" ");

                }

            } //End of case 20.

            case 21 -> {
                System.out.println();
                System.out.println("Program-21");
                System.out.println("Consonant and vowel number calculator");
                System.out.print("Enter a string: ");
                sc.nextLine();  // Reads the leftover new line

                String str1 = sc.nextLine();
                str1 = str1.replaceAll("\\s", "").toUpperCase(Locale.ROOT);


                int vSum=0;
                int cSum=0;

                for (int i=0; i<str1.length(); i++) {
                    char c = str1.charAt(i);

                    if ((c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
                        vSum+=1;
                    }

                    else {
                        cSum+=1;
                    }
                } //End of i-for loop.

                System.out.println("Number of consonants: "+cSum+"; Number of vowels: "+vSum);

            } //End of case 21.

            case 22 -> {
                System.out.println();
                System.out.println("Program-22");
                System.out.println("Uppercase letter counter");
                System.out.print("Enter string: ");
                sc.nextLine(); //Reads the leftover next-line.
                String n = sc.nextLine();

                int counter=0;

                for (int i = 0; i < n.length(); i++) {
                    if(Character.isUpperCase(n.charAt(i))){
                        counter+=1;
                    } //If-statement to check whether a character is uppercase or not.
                } //End of primary for-loop.

                System.out.println("Number of uppercase letter(s) in the string: "+counter);

            } //End of case 22.

            case 23 -> {

//              Encryption explained
                /* An array of string-length number of rows, and 27 columns is created.

                The value of variable 'placeholder' is set such that: it is '1' for lowercase letters and spaces, '2'
                for uppercase letters, and '3' for numbers.

                Let 'i' represent the position of letter in alphabets, or the number in-case the letter in the
                string is a number.

                For e.g. i=1 for letter 'a', i=3 for letter 'c', i=4 for the number '4', and so on. And i=0, for
                spaces.
                In each row, the value of the i-th element is set as the placeholder. */

                System.out.println();
                System.out.println("Program-23");
                System.out.println("Encryption program");
                System.out.print("Enter the string: ");
                sc.nextLine(); //Reads the leftover next-line.
                String n = sc.nextLine();

                //Declarations: beginning
                int ph=0; //placeholder
                //Lowercase letters/space: ph=1; uppercase letters: ph=2; numbers: ph=3;

                char c; //Character at.

                int numChar=0; //Ascii value place holder.

                //Declarations: end

                int[][] arr = new int[n.length()][27];

                for (int i = 0; i < n.length(); i++) {

                    c = n.charAt(i);

                    if (Character.isLowerCase(c)){
                        ph=1;
                        numChar = c;
                        numChar-=96;
                    }

                    if (Character.isUpperCase(c)){
                        ph=2;
                        numChar = c;
                        numChar-=64;
                    }
                    if (Character.isDigit(c)){
                        ph=3;
                        numChar = c;
                        numChar-=48;
                    }

                    if (Character.isSpaceChar(c)){
                        ph=1;
                        numChar=0;
                    }

                    for (int j = 0; j < 27; j++) {
                        if (j==numChar){
                            arr[i][j]=ph;
                        }
                        else {
                            arr[i][j]=0;
                        }
                    } //End of j-for-loop.
                } //End of i-for-loop.

                for (int i = 0; i < n.length(); i++) {
                    for (int j = 0; j < 27; j++) {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }

            } //End of case 23.

            case 24 -> {
                System.out.println();
                System.out.println("Program-24");
                System.out.println("String sorter");
                System.out.print("Enter the string: ");
                sc.nextLine(); //Reads the leftover nextLine.
                String n = sc.nextLine();
                n=n.toLowerCase(Locale.ROOT);

                char[] nArr = n.toCharArray(); //Converts the string to an array of characters.

                Arrays.sort(nArr);

                for (char element:nArr) {
                    System.out.print(element);
                }

            } //End of case 24.

            case 25 -> {
                System.out.println();
                System.out.println("Program-25");
                System.out.println("Case inverter");
                System.out.print("Enter string: ");
                sc.nextLine();
                String n = sc.nextLine();

                System.out.print("Inverted string: ");

                for (int i = 0; i < n.length(); i++) {
                    char c = n.charAt(i);

                    if(Character.isUpperCase(c)){
                        System.out.print(Character.toLowerCase(c));
                    }
                    if (Character.isLowerCase(c)){
                        System.out.print(Character.toUpperCase(c));
                    }
                    if (Character.isSpaceChar(c)){
                        System.out.print(' ');
                    }
                }

            } //End of case 25.

            case 26 -> {
                System.out.println();
                System.out.println("Program-26");
                System.out.println("Email address verifier");
                System.out.print("Enter email id: ");
                sc.nextLine(); //Reads the leftover nextLine.
                String n = sc.nextLine();

                String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

//                How the program works
//                First a regex expression is added. Regex class is used for the same. The regex class enables one to
//                have a certain formatting for a string. Then the matcher class is used to check whether the
//                inputted string matches the regex or not.

                if (n.matches(regex)){
                    System.out.println("The email address is valid.");
                }

                else {
                    System.out.println("The email address is not valid.");
                }

            } //End of case 26.

        } //End of primary switch case.

    } //End of main.
}
