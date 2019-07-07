package exercise5;

import java.util.ArrayList;

public class AsterixHorizontal extends ArrayList {

    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < super.size(); i++){
            result = result + super.get(i);
        }
        return result;
    }
}
