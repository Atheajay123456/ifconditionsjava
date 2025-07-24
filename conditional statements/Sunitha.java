class Sunitha{
 public static void main(String[]args){
   int age=47;
   boolean medicalCertificate=true;
   if(age>=18 && age<=45 && medicalCertificate==true){
    System.out.println("she can participate");
   }
   else if(age<=18 || age>=45 ){
    System.out.println(" participate not allowed");
   }
   else{
    System.out.println(" participate denied");
   }
  }
}
   
 
