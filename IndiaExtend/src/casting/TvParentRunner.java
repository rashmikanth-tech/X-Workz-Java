package casting;

public class TvParentRunner {
    public static void main(String[] args) {

        TvParent obj1 = new TvParent();
        obj1.Display();
        obj1.SetupBox();
        obj1.Tvtype();
        obj1.Sound();
        obj1.Channels();
        System.out.println("----------------------");

        TvParent obj2 = new TvParentDetails();
        obj2.Display();
        obj2.SetupBox();
        obj2.Tvtype();
        obj2.Sound();
        obj2.Channels();
        System.out.println("----------------------");

        TvParentDetails obj3 = new TvParentDetails();
        obj3.Display();
        obj3.SetupBox();
        obj3.Tvtype();
        obj3.Sound();
        obj3.Channels();
        obj3.extraMethod();
        System.out.println("----------------------");

        TvParentCast caster = new TvParentCast();
        caster.cast(obj2);
    }
}
