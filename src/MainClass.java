public class MainClass {
    public static void main(String[] args) {
        GalatasarayTeam galatasarayTeam = new GalatasarayTeam(new FootballBranch());

        System.out.println(galatasarayTeam.getTeamDescription() + " : " + galatasarayTeam.getBranch().getBranchDescription());

        FenerbahceTeam fenerbahceTeam = new FenerbahceTeam(new BasketballBranch());

        System.out.println(fenerbahceTeam.getTeamDescription() + " : " + fenerbahceTeam.getBranch().getBranchDescription());
    }
}
