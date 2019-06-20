package com.matthewxu.meduim;

/**
 * @description 无重复字符的最长子串
 * @author MatthewXu
 *
 */
public class NoRepeatLongestStr {
	//My idea
	public int lengthOfLongestSubstring(String s) {
		int targetLength = s.length();
		// 如果传入的字符串为空字符串或者null,直接返回0.
		if (targetLength == 0 || s == null)
			return 0;
		int maxLength = 1;
		String tempStr = "";
		for (int i = 0; i < targetLength; i++) {
			char c1 = s.charAt(i);
			// 如果从截取起点到目标字符串末尾的字串长度小于maxlength，则直接返回maxLength.
			if (targetLength - i > maxLength) {
				for (int j = i + 1; j < targetLength; j++) {
					char c2 = s.charAt(j);
					String subStr = s.substring(i, j + 1);
					int subStrLength = subStr.length();
					// 如果截取的子串长度大于maxLength，进一步判断。
					// if (subStr.length() > maxLength) {
					// if (tempStr.length() != 0 && subStr.indexOf(tempStr) >= 0)
					// break;
					if (NoDuplicativeChar(subStr, c1) && NoDuplicativeChar(subStr, c2)) {
						if (subStrLength > maxLength)
							maxLength = subStrLength;
					} else {
						// tempStr = subStr;
						break;
					}
					// }
				}
			} else
				return maxLength;
		}
		return maxLength;
	}

	public boolean NoDuplicativeChar(String s, char c) {
		if (s.indexOf(c) == s.lastIndexOf(c))
			return true;
		return false;
	}

	//其他解法
	//方法一：暴力法
	
	public static void main(String[] args) {
		String s = "nfpdmpi";
		NoRepeatLongestStr noRepeatLongestStr = new NoRepeatLongestStr();
		int i = noRepeatLongestStr.lengthOfLongestSubstring(s);
		System.out.println(i);
	}
}
