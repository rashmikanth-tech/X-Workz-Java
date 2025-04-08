package casting;

public class ShampooParentDetails extends ShampooParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in ShampooParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in ShampooParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in ShampooParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in ShampooParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in ShampooParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ShampooParentDetails");
    }
}
