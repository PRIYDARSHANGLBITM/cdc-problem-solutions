import java.util.*;
public class NumberofBurgerwithnowasteincredient1276{
    public List<Integer> numofBurgers(int tomatoSlices , int cheeseSlices ){
        if(tomatoSlices %2 !=0){
            return new ArrayList<>();
        }
        int Jumbo = (tomatoSlices - 2 * cheeseSlices)/2;
        int Small = cheeseSlices - Jumbo;
        if(Jumbo <0 || Small <0){
            return new ArrayList<>();
        }
        return Arrays.asList(Jumbo,Small);
    }
    public static void main(String[]args){
        NumberofBurgerwithnowasteincredient1276 obj = new NumberofBurgerwithnowasteincredient1276();
        int tomatoSlices = 16;
        int cheeseSlices = 7;
        List<Integer> result = obj.numofBurgers(tomatoSlices, cheeseSlices);
        System.out.println(result);
    }
}