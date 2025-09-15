package lab8_Animal;

import java.util.ArrayList;

public class cat implements Animal {
    private String name; private boolean alive;
    private ArrayList babies=new ArrayList<cat>();
    private static int population=0;
    public cat(String name){
        this.name=name;
        this.alive=true;
        population++;
    }
    @Override
    public void MakeASound() {
        System.out.println("Meo meo");
    }
    @Override
    public void introduce(){
        MakeASound();
        System.out.println("name: "+ this.name);
    }
    @Override
    public ArrayList<Animal> giveBirth(int n) {
        for (int i=0;i<n;i++)
        {
            Animal tmp= new cat(this.name+"'s baby");
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
        if(this.alive) {
            System.out.println(name + " alive : die");
            population--;
            this.alive = false;
        } else System.out.println(name + " alive : died ");
    }

    public static int getPopulation() {
        return population;
    }
}
