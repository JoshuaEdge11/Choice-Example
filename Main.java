import java.util.Scanner;
public class Main {
public static void main(String[] args){
    
Scanner c= new Scanner(System.in);
System.out.println("Enter a Letter to find Animal: ");
char choice=c.next().charAt(0);

switch(choice) {
case 'a':
System.out.println("Alligator");
break;
case 'b':
System.out.println("Bison");
break;
case 'c':
System.out.println("Cat");
break;
case 'd':
System.out.println("Dog");
break;
case 'e':
System.out.println("Elephant");
break;
case 'f':
System.out.println("Flamingo");
break;
case 'g':
System.out.println("Giraffe");
break;
case 'h':
System.out.println("Hippopotamus");
break;
case 'i':
System.out.println("Iguana");
break;
case 'j':
System.out.println("Jaguar");
break;
case 'k':
System.out.println("Koala");
break;
case 'l':
System.out.println("Lion");
break;
case 'm':
System.out.println("Monkey");
break;
case 'n':
System.out.println("Newt");
break;
case 'o':
System.out.println("Octopus");
break;
case 'p':
System.out.println("Lion");
break;
case 'q':
System.out.println("Quail");
break;
case 'r':
System.out.println("Rabbit");
break;
case 's':
System.out.println("Scorpion");
break;
case 't':
System.out.println("Tiger");
break;
case 'u':
System.out.println("Urchin");
break;
case 'v':
System.out.println("Vulture");
break;
case 'w':
System.out.println("Walrus");
break;
case 'x':
System.out.println("Xerus");
break;
case 'y':
System.out.println("Yak");
break;
case 'z':
System.out.println("Zebra");
break;
default: System.out.println("CHOICE INVALID");
}
}
}