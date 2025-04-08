package casting;

public class ToothpasteParentCast {
    public void cast(ToothpasteParent obj) {
        System.out.println("Casting ToothpasteParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof ToothpasteParentDetails) {
            ToothpasteParentDetails ref = (ToothpasteParentDetails)obj;
            ref.extraMethod();
        }
    }
}
