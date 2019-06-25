package exercise2;

public class Main {

    public static void main(String[] args) {
        Federatie federatie = Federatie.buildFederatie();
        Player coman = new Player("Coman", 23, 11);
        Player man = new Player("Man", 22, 14);
        System.out.println("Coman: " + coman.getName() + " " + coman.getNumber() + " " + coman.getPrice());
        NationalTeam nationalTeam = new NationalTeam();
        nationalTeam.addPlayer(coman);
        nationalTeam.addPlayer(man);
        federatie.addNationalTeam(nationalTeam);
        NationalTeamU21 nationalTeamU21 = new NationalTeamU21();
        Player puscas = new Player("Puscas", 9, 11);
        Player pascanu = new Player("Pascanu", 20, 155);
        System.out.println("Puscas: " + puscas.getName() + " " + puscas.getNumber() + " " + puscas.getPrice());
        NationalTeam19 nationalTeam19 = new NationalTeam19();
        Player baluta = new Player("Baluta", 21, 323);
        System.out.println("Baluta: " + baluta.getName() + " " + baluta.getNumber() + " " + baluta.getPrice());

    }

}
