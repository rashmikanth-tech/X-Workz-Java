package casting;

public class ShavingCreamParentCast {
    public void cast(ShavingCreamParent obj) {
        System.out.println("Casting ShavingCreamParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof ShavingCreamParentDetails) {
            ShavingCreamParentDetails ref = (ShavingCreamParentDetails)obj;
            ref.extraMethod();
        }
    }
}
