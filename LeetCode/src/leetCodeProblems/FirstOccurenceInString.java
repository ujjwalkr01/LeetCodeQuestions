package leetCodeProblems;

public class FirstOccurenceInString {

	public static void main(String[] args) {
       
		String haystack="sadbutsad";
		String needle="sad";
		
		System.out.println(findFirstOccurence(haystack,needle));
	}

	private static int findFirstOccurence(String haystack, String needle) {

		  if(haystack.contains(needle)){
	           // System.out.print(haystack.indexOf(needle));
	           return (haystack.indexOf(needle));
	        }
	        return -1;
	}

}
