public class StringManipulator {
	public String trimAndConcat(String str1, String str2) {
        String trim1 = str1.trim();
		String trim2 = str2.trim();
		String str = trim1;
		str = str.concat(trim2);
		return str;
    }
    public String concatSubstring(String str1, int num1, int num2,  String str2) {
        str1 = str1.substring(num1, num2);
        //System.out.println(str1);
		String str = str1.concat(str2);
		return str;
    }
	public Integer getIndexOrNull(String word1, String word2) {
        int index = word1.indexOf(word2);
		if (index == -1)
		{
		    return null;
		}
		else 
		{
		    return index;
		}
    }
	public Integer getIndexOrNull(String word, char letter) {
		int index = word.indexOf(letter);
		if (index == -1)
		{
		    return null;
		}
		else 
		{
		    return index;
		}
    }
	public static void main(String []args){
        StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		System.out.println(str); // HelloWorld 
		StringManipulator manipulator1 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator1.getIndexOrNull("Coding", letter);
        Integer b = manipulator1.getIndexOrNull("Hello World", letter);
        Integer c = manipulator1.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        StringManipulator manipulator2 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator2.getIndexOrNull(word, subString);
        Integer e = manipulator2.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null
        StringManipulator manipulator3 = new StringManipulator();
        String word2 = manipulator3.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld
		
     }
}
