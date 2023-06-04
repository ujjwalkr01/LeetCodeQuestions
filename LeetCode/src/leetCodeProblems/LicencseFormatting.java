package leetCodeProblems;

public class LicencseFormatting {

	public static void main(String[] args) {

		String s = "2-5g-3-J";
		int k = 2;

		formatString(s, k);
	}

	private static void formatString(String s, int k) {

	
		String res = "", bag = "";
		s=s.toUpperCase();
		int count=0;
		
	    for(int i=s.length()-1;i>=0;i--) {
	    	if(s.charAt(i)!='-') {
	    		if(count==k) {	    		
		    		bag+='-';
		    		count=0;
		    	}
		    	bag+=s.charAt(i);
		    	count++;
	    	}
	    }
	    System.out.println(bag);
	    
	    for(int i=bag.length()-1;i>=0;i--) {
	       res+=bag.charAt(i);
	    }
	    
	    System.out.println(res);
	    
	}

}
