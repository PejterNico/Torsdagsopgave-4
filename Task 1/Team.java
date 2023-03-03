class Team {
	
	private String teamName;
	private int teamRank;
	private String teamPlayerName;


	public Team(String teamName){
	this.teamName = teamName;
	}

	String getTeamName(){
		return this.teamName;
	}

	int setRank(int rankId){
		this.teamRank = rankId;
		return this.teamRank;
	}

	@Override
	public String toString(){
		String s = ("Hold: " + getTeamName() + ", Rank: " + setRank(1));
		return s;
	}
}