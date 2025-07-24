class Temperature{
public static void main(String[]args){
int temp=20;
if(temp==50){
  System.out.println("should go out");
  }
else if(temp>=45){
   System.out.println("ram should stay home");
   }
else if(temp>=30 && temp<=45){
    System.out.println("ram should carry water");
   }
else {
      System.out.println("ram can go normally");
   }
  }
}
