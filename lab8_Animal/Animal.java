package lab8_Animal;

import java.util.ArrayList;

public interface Animal {
    public void MakeASound();
    public void introduce();
    public ArrayList<Animal> giveBirth(int n);
    public String getName();
    public void die();
}