public class CountingValleys{
  public static void main(String[] args)
   {
    System.out.println(countingValleys(8, "UDDUUUUD"));
  }
public static int countingValleys(int steps, String path) {
    // Write your code here
    int sea_level = 0;
    int no_of_valley = 0;
    int pre_sea_level = 0;
    for(int i=0; i<steps; i++){
        if(path.substring(i,i+1).equals("U"))
          sea_level++;
        else 
        if(path.substring(i,i+1).equals("D"))
          sea_level--;
        if(sea_level ==0 && pre_sea_level < 0)
           no_of_valley++;
        pre_sea_level = sea_level;
    }
return no_of_valley;
    }

}

