import java.util.*; 
class AgeCalculator
 {
 int BirthDay = 0; 
 int BirthMonth = 0; 
 int BirthYear = 0;
 int CurrentDay = 0,
 CurrentMonth =0,
 CurrentYear = 0;
 Scanner s=new Scanner(System.in); 
 void getValues() 
 {
 System.out.print("Enter the date of birth: ");
 BirthDay = s.nextInt(); 
 System.out.print("Enter the month of birth: "); 
 BirthMonth = s.nextInt();
 System.out.print("Enter the Year of birth: ");
 BirthYear = s.nextInt(); 
 System.out.print("Enter the Today's date: ");
 CurrentDay = s.nextInt(); 
 System.out.print("Enter the Today's month: ");
 CurrentMonth = s.nextInt();
 System.out.print("Enter the Today's Year: "); 
 CurrentYear = s.nextInt();
 } 
 void display(int CalculatedDay ,int CalculatedMonth,int CalculatedYear)
 { 
 System.out.println("The DOB is "+BirthDay+"/"+BirthMonth+"/"+BirthYear); 
 System.out.println("Today's date is "+CurrentDay+"/"+CurrentMonth+"/"+CurrentYear); 
 System.out.println("The person is "+CalculatedYear +" years "+CalculatedMonth+" months and "+CalculatedDay+" days old"); 
 }
 void calculateAge() 
 {
 int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
 if (BirthDay > CurrentDay)
 {
 CurrentMonth = CurrentMonth - 1; CurrentDay = CurrentDay + month[BirthMonth - 1]; 
 } 
 if (BirthMonth > CurrentMonth) 
 { 
 CurrentYear = CurrentYear - 1;
 CurrentMonth = CurrentMonth + 12;
 }
 int CalculatedDay = CurrentDay - BirthDay;
 int CalculatedMonth = CurrentMonth - BirthMonth; 
 int CalculatedYear = CurrentYear - BirthYear; 
 display(CalculatedDay,CalculatedMonth,CalculatedYear); 
 } 
 public static void main(String[] args)
 { 
 AgeCalculator age = new AgeCalculator (); 
 age.getValues(); 
 age.calculateAge();
 
 } 
 }
 