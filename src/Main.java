<<<<<<< HEAD
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
=======
import com.xworkz.states.Karnataka;
import com.xworkz.states.KarnatakaDistric;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Karnataka karnataka = new Karnataka();
        karnataka.Shimoga();
        karnataka.davangere();
        karnataka.chikmanglore();
        karnataka.dakshinaKannada();
        karnataka.banglore();



       KarnatakaDistric karnatakaDistric = new Karnataka();
        karnataka.Shimoga();
        karnataka.Banglore();
        karnataka.Chikmanglore();
        karnataka.DakshinaKannada();
        karnataka.Davangere();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>End Of Karnataka<<<<<<<<<<<<<<<<<<<<<<<<");

        Animals animals = new Animals();
        animals.lion();
        animals.tiger();
        animals.leopard();
        animals.birdspecie();
        animals.floweringplant();
        System.out.println(">>Letrs See Below<<");

        Animal animal = new Animals ();
        animals.lions();
        animals.tigers();
        animals.leopards();
        animals.birdspecies();
        animals.floweringplants();

        System.out.println(">>>>>>>>>>>>>>Now Assam Wildlife<<<<<<<<<<<<<<<<<<");


        AssamWildlife assamWildlife = new AssamWildlife();
        assamWildlife.lions();
        assamWildlife.tigers();
        assamWildlife.leopards();
        assamWildlife.birdSpecies();
        assamWildlife.floweringPlants();

        GujaratWildlife gujaratWildlife = new GujaratWildlife();
        gujaratWildlife.lions();
        gujaratWildlife.tigers();
        gujaratWildlife.leopards();
        gujaratWildlife.birdSpecies();
        gujaratWildlife.floweringPlants();

    }
}
>>>>>>> 195b35e (Initial commit)
