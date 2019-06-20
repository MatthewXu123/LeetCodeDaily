package com.matthewxu.meduim;

/**
 * @description 无重复字符的最长子串
 * @author MatthewXu
 *
 */
public class NoRepeatLongestStr {

	public int lengthOfLongestSubstring(String s) {
        int max = 1;
        if(s.length() == 0 || s == null)
        	return 0;
        for(int i = 0; i < s.length(); i++) {
        	char c1 = s.charAt(i);
        	for(int j = i + 1; j < s.length(); j++) {
        		char c2 = s.charAt(j);
        		String str = s.substring(i, j+1);
            	if(NoDuplicativeChar(str,c1) && NoDuplicativeChar(str,c2)) {
            		if(str.length() > max)
            			max = str.length();
            	}else 
					break;
        	}
        }
        return max;
    }
	
	public boolean NoDuplicativeChar(String s,char c) {
			if(s.indexOf(c) == s.lastIndexOf(c))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		String s = "abcac";
		NoRepeatLongestStr noRepeatLongestStr = new NoRepeatLongestStr();
		int i = noRepeatLongestStr.lengthOfLongestSubstring(s);
		System.out.println(i);
	}
}
