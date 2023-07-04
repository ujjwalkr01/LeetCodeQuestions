package leetCodeProblems;

public class ShortestCompletingWord {

	public static void main(String[] args) {

		String lic="1s3PeSt";
		String bag="";
		for(int i=0;i<lic.length();i++) {
			char c=lic.charAt(i);
			if(!Character.isDigit(c)) {
				bag+=c;
			}
		}
		String d=bag.toLowerCase();
		System.out.println(d);
		String word="steps";
		
		if(word.contains(d)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
