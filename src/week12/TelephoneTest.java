package week12;

import javax.xml.stream.events.StartElement;
import java.awt.event.ItemListener;

public class TelephoneTest {
    public static void main(String[] args) {
        System.out.println(Telephone.total);

        Telephone telephone = new Telephone();
        System.out.println(telephone.total);
        telephone.setNumber("0175-4454695");
        System.out.println(telephone.getNumber());


    }
}
