class Banking{
	public static void main(String[]args){
int balance=400;
int withdrawAmount=500;
int amount=300;
Boolean receiverAmount=true;
int i=3;
switch(i){
     case 1 :if(balance>=withdrawAmount && withdrawAmount>0){
                System.out.println("Allow");
              }else{
                System.out.println("insufficient funds");
              }break;
     case 2 : if(amount>0){
                System.out.println("Add to balance");
              }break;
     case 3 : if(amount<=balance && receiverAmount==true){
                System.out.println("Transfer");
              }break;
    }
  }
}

