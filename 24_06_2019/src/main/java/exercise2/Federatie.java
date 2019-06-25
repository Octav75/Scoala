package exercise2;

import java.util.LinkedList;
import java.util.List;

public class Federatie {

    public static Federatie self;

    private List<NationalTeam> nationala;
    private List<NationalTeamU21> nationala21;
    private List<NationalTeam19> nationala19;

    private Federatie(){
        nationala = new LinkedList<>();
        nationala21 = new LinkedList<>();
        nationala19 = new LinkedList<>();
    }

    public static Federatie buildFederatie () {
        if (self == null) {
            self = new Federatie();
        }

        return self;
    }

    public void addNationalTeam(NationalTeam nationalTeam){
        nationala.add(nationalTeam);
    }

    public void addNationalTeamU21(NationalTeamU21 nationalTeamU21){
        nationala21.add(nationalTeamU21);
    }

    public void addNationalTeamU19(NationalTeam19 nationalTeam19){
        nationala19.add(nationalTeam19);
    }

    public void deleteNationalTeamU21(NationalTeamU21 nationalTeamU21){
        nationala21.remove(nationalTeamU21);
    }

}
