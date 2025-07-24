class Visaeligibility{
public static void main(String[]args){
int age=18;
boolean haspassport=true;
boolean hasnoCriminalRecord=false;
if(age>=18 && haspassport==true && hasnoCriminalRecord==true){
     System.out.println("eligible for visa");
      }
else if(age>=18 && haspassport==true ){
      System.out.println("apply for passport");
      }
else{
  System.out.println("not eligible");
   }
  }
}