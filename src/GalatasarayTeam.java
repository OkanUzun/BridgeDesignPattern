public class GalatasarayTeam implements Team {

    private Branch branch;

    GalatasarayTeam(Branch branch){
        this.branch = branch;
    }

    @Override
    public String getTeamDescription() {
        return "This is a Galatasaray Team";
    }

    Branch getBranch() {
        return branch;
    }
}
