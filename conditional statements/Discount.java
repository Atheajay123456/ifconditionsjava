class Discount{
	public static void main(String[]args){
		int cartAmount=6000;
		boolean isMember=true;
		boolean hasCoupon=true;
		if(cartAmount>5000 && isMember==true ){
			System.out.println("25% discount");
		}
		else if(cartAmount>3000 && (isMember==true && hasCoupon==true) ){
			System.out.println("20% discount");
		}
        else if(cartAmount>3000 &&(isMember==true || hasCoupon==true)){
			System.out.println("10% discount");
		}
		else{
			System.out.println("no discount");
		}
	}
}