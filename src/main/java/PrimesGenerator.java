import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;


public class PrimesGenerator {
    public List<Integer> list = new ArrayList<Integer>();
    public PrimesGenerator(Integer n){

        int i = 2;
        while(list.size() <= n) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime){
                list.add(i);
            }
            i++;
            }

        }


    }
