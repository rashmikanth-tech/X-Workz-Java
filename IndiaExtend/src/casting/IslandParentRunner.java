package casting;

public class IslandParentRunner {
    public static void main(String[] args) {

        IslandParent obj1 = new IslandParent();
        obj1.category();
        obj1.largestIsland();
        obj1.mostPopulatedIsland();
        obj1.islandClimate();
        obj1.famousIsland();
        System.out.println("----------------------");

        IslandParent obj2 = new IslandParentDetails();
        obj2.category();
        obj2.largestIsland();
        obj2.mostPopulatedIsland();
        obj2.islandClimate();
        obj2.famousIsland();
        System.out.println("----------------------");

        IslandParentDetails obj3 = new IslandParentDetails();
        obj3.category();
        obj3.largestIsland();
        obj3.mostPopulatedIsland();
        obj3.islandClimate();
        obj3.famousIsland();
        obj3.extraMethod();
        System.out.println("----------------------");

        IslandParentCast caster = new IslandParentCast();
        caster.cast(obj2);
    }
}
