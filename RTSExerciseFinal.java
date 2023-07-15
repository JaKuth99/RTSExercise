import java.util.*;
public class RTSExercise {
  HashMap<String, Integer> aboveBelow(ArrayList unsortNum, int compNum){
    int above = 0;
    int below = 0;
    HashMap<String, Integer> aboveBelow = new HashMap<String, Integer>();
    for (int num : unsortNum){
        if (num > compNum){
            above ++;
        }
        else if(num < compNum){
            below ++;
        }
      }
      aboveBelow.put("above", above);
      aboveBelow.put("below", below);
      return aboveBelow;
    }
    String stringRotation(String origStr, int trans){
      if(trans <= 0){
        System.out.print("Invalid number. Please try again and make sure trans is a positive integer");
        System.exit(0);
      }
      int finTrans = trans % origStr.length();
      String overflow = origStr.substring(origStr.length()-finTrans);
      String base = origStr.substring(0, origStr.length()-finTrans);
      return overflow + base;
    }
}
