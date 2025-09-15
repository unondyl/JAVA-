package lab8_Animal;

import java.util.ArrayList;

public class dog implements Animal {
    private String name; private boolean alive;
    private ArrayList babies=new ArrayList<dog>();
    private static int population=0;
    public dog(String name){
        this.name=name;
        this.alive=true;
        population++;
    }
    @Override
    public void MakeASound() {
        System.out.println("rau rau rau");
    }

    @Override
    public void introduce() {
        MakeASound();
        System.out.println("name: "+ this.name);
    }
    @Override
    public ArrayList<Animal> giveBirth(int n) {
        for (int i=0;i<n;i++)
        {
            Animal tmp= new dog(this.name+"'s baby");
            this.babies.add(tmp);
        }
        return this.babies;
    }

    @Override
    public String getName() {
        return getName();
    }
    @Override
    public void die(){
        if(this.alive) {
            System.out.println(this.name + " alive: die");
            population--;
            this.alive = false;
        } else System.out.println(this.name+"alive: died");
    }

    public static int getPopulation( ){
        return population;
    }
}
