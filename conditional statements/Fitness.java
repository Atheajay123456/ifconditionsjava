class Fitness{
	public static void main(String[]args){
		int age=39;
		int bmi=24;
		boolean hasHeartCondition=false;
		if(age<40 && bmi<=24 && hasHeartCondition!=true){
			System.out.println("High-intensity program");
		}
		else if(age<40 && bmi<=24 && hasHeartCondition==true){
			System.out.println("Moderate program");
		}
		else{
			System.out.println("consult doctor first");
		}
	}
}