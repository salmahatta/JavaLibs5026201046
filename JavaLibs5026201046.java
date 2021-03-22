import java.util.Scanner;

public class JavaLibs5026201046 {

      public static void main(String[] args) {
            Scanner jarvis = new Scanner( System.in );

System.out.print( "What is your love call for boyfriend/girlfriend?: ");
String lovecall = jarvis.next();

System.out.print( "Enter name one of your favorite teacher: ");
String teacher = jarvis.next();

System.out.print( "Give a number between 9 to 10: ");
Double number = jarvis.nextDouble();

System.out.print( "Name an animal: ");
String animal= jarvis.next();

System.out.print( "Name a plant: ");
String plant= jarvis.next();

System.out.print( "Name one of your favorite actor: ");
String actor= jarvis.next();

System.out.print( "What is your favourite city?: ");
String city= jarvis.next();

System.out.print( "What is your favourite food?: ");
String food= jarvis.next();

System.out.print( "What is the result of 10+1.5?: ");
double result= jarvis.nextDouble();

System.out.print( "What is your birthday year?: ");
int year= jarvis.nextInt();

double math = result + year;

System.out.println( "Once upon a time in casting room." );
System.out.println( "HRD : Why are you so slow, can not you get here quickly?" );
System.out.println( "Aspiring actor : Yes," + lovecall );
System.out.println( "HRD : Okay, so please introduce yourself. ");
System.out.println( "Aspiring actor : My name is " + teacher + " and I am " + number + " years old.");
System.out.print( "I intend to cast for a film " + animal + " vs " + plant );
System.out.println( " and replace the role by " + actor + " who is on vacation to " + city );
System.out.println( "HRD : Do you really sure can replace the best actor in this country?" );
System.out.println( "Aspiring actor : Yes, because I am an impersonator and  really like impersonating " + food );
System.out.println( "HRD : How much salary do you ask for a month?" );
System.out.println( "Aspiring actor : Maybe around " + math + " dollars" );
System.out.println( "HRD : Okay deal." );

           jarvis.close();
      }
}
