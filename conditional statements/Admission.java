class Admission{
	public static void main(String[]args){
		int percentage=92;
		boolean sportsCertificate=false;
		boolean volunteerExperince=true;
		int familyIncom=200000;
		if(percentage>=90 && sportsCertificate==true && familyIncom<=200000){
			System.out.println("full scholarship");
		}
		else if(percentage>=85 && sportsCertificate==true || volunteerExperince==true){
			System.out.println("partial scholarship");
		}
		else{
			System.out.println("no scholarship");
		}
	}
}