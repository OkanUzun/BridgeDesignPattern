public class FenerbahceTeam implements Team {

    private Branch branch;

    FenerbahceTeam(Branch branch){
        this.branch = branch;
    }

    @Override
    public String getTeamDescription() {
        return "This is a Fenerbahce Team";
    }

    Branch getBranch() {
        return branch;
    }
}
