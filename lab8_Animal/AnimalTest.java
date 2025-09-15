package lab8_Animal;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Animal> animalList = new ArrayList<>();
        while(true){
            System.out.println("1.Add\n2.Die\n3.Get Population\n4.Return");
            int tmpChoice_1=sc.nextInt();sc.nextLine();
            if(tmpChoice_1==1) {
                Animal tmpAnimal;
                String tmpName = null;
                System.out.println("__Add__\n1.Cat\n2.Dog\n3.Cow");
                int tmpchoice_2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name Animal: ");
                tmpName = sc.nextLine();
                if (tmpchoice_2 == 1) tmpAnimal = new cat(tmpName);
                else if (tmpchoice_2 == 2) tmpAnimal = new dog(tmpName);
                else tmpAnimal = new cow(tmpName);
                animalList.add(tmpAnimal);
                System.out.print("How many pets do you have: ");
                int tmpBaby = sc.nextInt();
                for (int inter = 0; inter < tmpBaby; inter++) {
                    System.out.print("Enter name Animal: ");
                    animalList.addAll(tmpAnimal.giveBirth(tmpBaby));
                }
            }
            else if(tmpChoice_1==2)
            {
                System.out.print("Enter name Animal die: "); String nameSearch=sc.nextLine();
                for (Animal tmpOjb:animalList) {
                    if (tmpOjb.getName().equals(nameSearch)) {
                        tmpOjb.die();
                        animalList.remove(tmpOjb);
                    }
                }
            }
            else if(tmpChoice_1==3){
                System.out.println("Population Cat: "+cat.getPopulation()+"\nPopulation Dog: "+dog.getPopulation()+"\nPopulation Cow: "+cow.getPopulation());
                System.out.println("Total Population: "+(cat.getPopulation()+dog.getPopulation()+cow.getPopulation()));
            }
            else {
                System.out.println("Return Program");
                return;
            }
        }
    }
}
