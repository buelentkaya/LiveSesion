package Week11;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTV {
    public static void main(String[] args) {
        TV Samsung = new TV();// new keyword invokes our constructer with no parameters

        System.out.println(Samsung);

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung.toString());


        TV LG = new TV();
        LG.turnOn();
        LG.setVolume(5);
        LG.setChannel(78);
        System.out.println(LG.toString());

        TV Sony = new TV();
        //Sony.turnOn();
        Sony.setVolume(3);
        Sony.setChannel(38);
        System.out.println(Sony.toString());

        TV[] tvList = {Samsung, LG,Sony};
        ArrayList<TV>list=new ArrayList<>(Arrays.asList(tvList));


       for(TV each:list){
           System.out.println("Is the TV on?"+ each.on);
       }


    }
}
