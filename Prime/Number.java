package Prime;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Number {
    private int max,min,value;
    boolean [] prime = new boolean[(int) 10E7];
    public Number(){
        Arrays.fill(prime,true);
        for(int i=2;i<sqrt((int)10e7);i++){
            while(!prime[i]) i++;
            for(int j=2;i*j<(int)10e7;j++) prime[i*j]=false;
        }
    }
    public boolean boolPrime(int n){
        return prime[n];
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean[] getPrime() {
        return prime;
    }

    public void setPrime(boolean[] prime) {
        this.prime = prime;
    }

    public static void main(String[] args) {
        new Number();
    }
}
