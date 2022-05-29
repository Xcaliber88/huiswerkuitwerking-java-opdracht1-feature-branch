import java.util.HashMap;
import java.util.Map;

public class Translator {

    HashMap<Integer,String> numericAlpha;

    public Translator (Integer[] numeric,String[] alphabetic){
        for(int i =0; i <numeric.length; i++){
            numericAlpha.put(i, alphabetic[i]);
        }


    }

}
