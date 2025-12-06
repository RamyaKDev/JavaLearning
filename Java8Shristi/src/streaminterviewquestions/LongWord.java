package streaminterviewquestions;

public class LongWord {

	public static void main(String[] args) {
	String s="I love India";
	String[] str=s.split(" ");
	int max=0;
	String maxStr="";
	for(String in:str) {
		if(in.length()>max)
			maxStr=in;
		
	}
	System.out.println(maxStr);

	}

}
