package casting;

public class LotionParentRunner {
    public static void main(String[] args) {

        LotionParent obj1 = new LotionParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        LotionParent obj2 = new LotionParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        LotionParentDetails obj3 = new LotionParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        LotionParentCast caster = new LotionParentCast();
        caster.cast(obj2);
    }
}
