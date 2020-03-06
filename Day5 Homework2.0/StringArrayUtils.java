/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
    	if (array.length<1) {
    		return null;
    	} else {
    		return array[0];
    	}
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
    	if (array.length<2) {
    		return null;
    	} else {
    		return array[1];
    	}
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
    	if (array.length<1) {
    		return null;
    	} else {
    		return array[array.length-1];
    	}
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array.length<2) {
        	return null;
        } else {
        	String ans = new String(array[array.length-2]);
        	return ans;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
    	for (int i=0; i<array.length; i++) {
    		if (array[i] == value) {
    			return true;
    		}
    	}
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
    	int length = array.length;
    	String[] reversearray = new String[length];
    	for (int i=0; i<length; i++) {
    		reversearray[i] = array[length-1-i];
    	}
        return reversearray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
    	int right = array.length-1;
    	int left = 0;
    	while (left<right) {
    		if (array[left] != array[right]) {
    		        return false;
    		}
    		left += 1;
    		right -= 1;
    	}
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
    	StringBuilder total = new StringBuilder();
    	for (int i=0; i<array.length; i++) {
    		total.append(array[i]);
    	}
    	String newtotal = total.toString();
    	newtotal = newtotal.toLowerCase();
    	newtotal = newtotal.replace(" ", "");
    	int count = 0;
    	boolean find = false;
    	char[] checklist = new char[26];
    	for (int i=0; i<newtotal.length(); i++) {
    		find = false;
    		for (int k=0; k<26; k++) {
    			if (newtotal.charAt(i)==checklist[k]) {
    				find = true;
    				break;
    			}
    		}
    		
    		if (find) {
    			
    		} else {
    			checklist[count] = newtotal.charAt(i);
    			count += 1;
    		}
    		
    	}
    	if (count == 26) {
    		return true;
    	} else {
    		return false;
    	}
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]==value) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        boolean find = false;
        for (int i=0; i<array.length; i++) {
            if (array[i] == valueToRemove) {
                find = true;
                break;
            }
        }
        int index = 0;
        if (find) {
            String[] ansarray = new String[(array.length-1)];
            for (int i=0; i<array.length; i++) {
                if (array[i] == valueToRemove) {
                    continue;
                } else {
                    ansarray[index] = array[i];
                    index += 1;
                }
            }
            return ansarray;
        } else {
            return array;
        }
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int length = 0;
        for (int i=0; i<array.length; i++) {
            if (i>0 && array[i] == array[i-1]) {
                continue;
            }
            length += 1;
        }
        String[] ansarray = new String[length];
        int index = 0;
        for (int i=0; i<array.length; i++) {
            if (i>0 && array[i] == array[i-1]) {
                continue;
            }
            ansarray[index] = array[i];
            index += 1;
        }
        return ansarray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int length=0;
        for (int i=0; i<array.length; i++) {
            if (i>0 && array[i]==array[i-1]) {
                continue;
            }
            length += 1;
        }
        String[] ansarray = new String[length];
        int index = 0;
        StringBuilder tempstr = new StringBuilder();
        for (int i=0; i<array.length; i++) {
            if (i==0) {
                tempstr.append(array[0]);
                continue;
            }
            if (i>0 && array[i] == array[i-1]) {
                tempstr.append(array[i]);
                continue;
            } else {
                String temp = new String(tempstr);
                ansarray[index] = temp;
                tempstr.setLength(0);
                tempstr.append(array[i]);
                index += 1;
            }
        }
        String temp = new String(tempstr);
        ansarray[index] = temp;
        return ansarray;
    }


}
