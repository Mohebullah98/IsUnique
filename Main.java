import java.util.*;
class Main {
  public static boolean isUnique(String s){
    HashSet<Integer> h = new HashSet<Integer>();//map char values to hashset
    for(int i=0;i<s.length();i++){
      int val = Character.getNumericValue(s.charAt(i));
      if(h.contains(val)) return false; //if value is in hashset, then string is not unique
      h.add(val);
    }
    return true;
  }
  public static void main(String[] args) {
    String s = "abcdefg38&"; 
    String s2 = "not unique";
    System.out.println(isUnique(s)); //should return true
    System.out.print(isUnique(s2)); // should rturn false
  }
}