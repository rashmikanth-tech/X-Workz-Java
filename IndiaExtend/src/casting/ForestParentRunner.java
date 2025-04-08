package casting;

public class ForestParentRunner {
    public static void main(String[] args) {

        ForestParent obj1 = new ForestParent();
        obj1.category();
        obj1.largestForest();
        obj1.biodiversity();
        obj1.forestArea();
        obj1.forestImportance();
        System.out.println("----------------------");

        ForestParent obj2 = new ForestParentDetails();
        obj2.category();
        obj2.largestForest();
        obj2.biodiversity();
        obj2.forestArea();
        obj2.forestImportance();
        System.out.println("----------------------");

        ForestParentDetails obj3 = new ForestParentDetails();
        obj3.category();
        obj3.largestForest();
        obj3.biodiversity();
        obj3.forestArea();
        obj3.forestImportance();
        obj3.extraMethod();
        System.out.println("----------------------");

        ForestParentCast caster = new ForestParentCast();
        caster.cast(obj2);
    }
}
