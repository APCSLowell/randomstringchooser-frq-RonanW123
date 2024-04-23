import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> a;
  public RandomStringChooser(String[] x){
    a = new ArrayList<String>();
    for(int i = 0; i < x.length; i++)
      a.add(x[i]);
  }
  public String getNext(){
    String w;
    if(a.size() == 0)
      return "NONE";
    else{
      int r = (int)(Math.random()*a.length);
      String w = a.get(r);
      a.remove(r);
      return w;
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
