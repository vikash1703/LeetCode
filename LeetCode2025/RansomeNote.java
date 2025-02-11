
// Magazine=aab
//ransomeNote=aa
public class RansomeNote {
 public static boolean canConstruct(String ransomeNote,String magazine) {
	 int count[]=new int[26];
	 for(char c:magazine.toCharArray()) {
		 count[c-'a']++;
	 }
	 for(char x:ransomeNote.toCharArray()) {
		 if(count[x-'a']==0) {
			 return false;
		 }
		 count[x-'a']--;
	 }
	 return true;
 }
	public static void main(String[] args) {
		String ransomeNote="aa";
		String magazine="aab";
		boolean result=canConstruct(ransomeNote,magazine);
		System.out.print(result);
		

	}

}
