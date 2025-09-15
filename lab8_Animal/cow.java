package lab8_Animal;

import java.util.ArrayList;

public class  cow implements Animal {
    private String name;
    private boolean alive;
    private ArrayList babies=new ArrayList<cow>();
    private static int population=0;
    public cow (String name){
        this.name=name;
        this.alive=true;
        population++;
    }
    @Override
    public void MakeASound() {
        System.out.println("moo moo");
    }
    @Override
    public void introduce(){
        MakeASound();
        System.out.println("name: "+this.name);
    }

    @Override
    public ArrayList<Animal> giveBirth(int n) {
        for (int i=0;i<n;i++)
        {
            Animal tmp= new cow(this.name+"'s baby");
            this.babies.add(tmp);
        }
        return this.babies;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void die() {
        if(alive) {
            System.out.println(this.name + " alive: die");
            this.alive = false;
            population--;
        } else System.out.println(this.name+"alive: died");
    }


    public static int getPopulation(){
        return population;
    }
}
