package app_java_important;

public class JoinTwoArray {
public static void main(String[] args) {
		String str="Hello, World";
		String swapped=swappedString(str);
		System.out.println(swapped);
	}

private static String swappedString(String str) {
	char[] charArray = str.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		char ch=charArray[i];
		if(Character.isUpperCase(ch)) {
			charArray[i]=Character.toLowerCase(ch);
		}else if(Character.isLowerCase(ch)) {
			charArray[i]=Character.toUpperCase(ch);
		}
	}
	return new String(charArray);
}
}
