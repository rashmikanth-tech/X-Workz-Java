package casting;

public class ToothpasteParentDetails extends ToothpasteParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in ToothpasteParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in ToothpasteParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in ToothpasteParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in ToothpasteParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in ToothpasteParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ToothpasteParentDetails");
    }
}
