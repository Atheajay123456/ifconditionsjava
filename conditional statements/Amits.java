class Amits{
 public static void main(String[]args){
 int usage=1100;
 String plan="standard";
 
 if(usage>500 && plan=="basic" ){
    System.out.println("premium");
    }
else if(usage>1000 && plan=="standard"){
    System.out.println("Ultra");
   }
else{
    System.out.println("continue same plan");
   }
  }
}

