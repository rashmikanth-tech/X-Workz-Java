package casting;

public class SoapParentRunner {
    public static void main(String[] args) {

        SoapParent obj1 = new SoapParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        SoapParent obj2 = new SoapParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        SoapParentDetails obj3 = new SoapParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        SoapParentCast caster = new SoapParentCast();
        caster.cast(obj2);
    }
}
