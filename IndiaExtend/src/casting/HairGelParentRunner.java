package casting;

public class HairGelParentRunner {
    public static void main(String[] args) {

        HairGelParent obj1 = new HairGelParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        HairGelParent obj2 = new HairGelParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        HairGelParentDetails obj3 = new HairGelParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        HairGelParentCast caster = new HairGelParentCast();
        caster.cast(obj2);
    }
}
