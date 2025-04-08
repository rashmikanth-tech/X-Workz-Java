package casting;

public class PerfumeParentRunner {
    public static void main(String[] args) {

        PerfumeParent obj1 = new PerfumeParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        PerfumeParent obj2 = new PerfumeParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        PerfumeParentDetails obj3 = new PerfumeParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        PerfumeParentCast caster = new PerfumeParentCast();
        caster.cast(obj2);
    }
}
