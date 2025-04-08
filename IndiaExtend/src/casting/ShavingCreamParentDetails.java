package casting;

public class ShavingCreamParentDetails extends ShavingCreamParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in ShavingCreamParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in ShavingCreamParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in ShavingCreamParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in ShavingCreamParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in ShavingCreamParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ShavingCreamParentDetails");
    }
}
