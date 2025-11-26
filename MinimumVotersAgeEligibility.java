package coreJva;
class Voters{
	void  checkAge(int age) throws Exception {
		if(age < 18) {
			String msg = "Not Eligible";
			throw new Exception(msg);
		}else {
			System.out.println("Eligible for voting."); 
			
		}
	}
}

public class MinimumVotersAgeEligibility {
	public static void main(String[] args) {
		Voters v = new Voters();
		try {
		v.checkAge(19);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
