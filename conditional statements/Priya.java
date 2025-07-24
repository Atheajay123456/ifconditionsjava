class Priya{
public static void main(String[]args){
int amount=2000;
boolean hasmember=true;
boolean hasnomember=true;

if(amount>=10000){
  if(hasmember){
  System.out.println("she gets 30% discount");
   }
  else{
  System.out.println("she  doesnt gets discount");
  }
 }
else if(amount>=5000){
  System.out.println("she gets 20% discount");
 }
else if(hasnomember){
  System.out.println("she gets 5% discount on any amount");
 }
else{
 System.out.println("she gets busy");
 }
}
}
