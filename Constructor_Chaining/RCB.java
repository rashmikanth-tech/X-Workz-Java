class RCB{
	void playMatch(Team team){
		if(team!=null){
			team.teamInfo();
		}else{
			System.out.println("Team is null,cannot run..");
		}
	}
}