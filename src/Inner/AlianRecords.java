package Inner;

public class AlianRecords {
    public void AlianData(Alien [] alien){
        for (Alien alians : alien){
            if (alien != null){
                System.out.println("Alian Seen By : "+alians.getSeenBy());
                System.out.println("Alian Seen Date : "+alians.getSeenDate());
                System.out.println("Alian Describe : "+alians.getDescribe());

        }

        }
    }
    public void AlianInit(){
        Alien [] alian = new Alien[2];

        alian[0]=new Alien();
        alian[0].setSeenBy("No One");
        alian[0].setSeenDate("null");
        alian[0].setDescribe("Dont Now exact");

        alian[1]= new Alien();
        alian[1].setSeenBy("Nuton");
        alian[1].setSeenDate("18s");
        alian[1].setDescribe("Fully Technologic");

        AlianData(alian);
    }
}
