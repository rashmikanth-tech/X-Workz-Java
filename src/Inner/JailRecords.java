package Inner;

public class JailRecords {
    public void jailDetails(Jail jail){
        System.out.println("Jail Name : "+jail.getJailName());
        System.out.println("Jail loaction : "+jail.getJailLocation());
        System.out.println("Jailer Name : "+jail.getJailerName());
        System.out.println("Jail Total sell : "+jail.getTotalSell());
    }


    public void addDetails(){
        Jail jail = new Jail();
            jail.setJailName("Ballari Jail");
            jail.setJailLocation("Ballari");
            jail.setJailerName("Jailer");
            jail.setTotalSell(20);

            jailDetails(jail);

    }
}
