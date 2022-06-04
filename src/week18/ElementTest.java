package week18;

import week18.poly_demo2.Links;
import week18.poly_demo2.WebElement;

public class ElementTest {
    public static void main(String[] args) {

        Links links=new Links();

        links.click();
        links.getLinkHref();
        links.sendKeys("EU8");
        links.getText();

        WebElement loginLink=new Links();
        System.out.println("-----");
        String text= links.getText();
        System.out.println("text = " + text);

        loginLink.click();
        loginLink.getText();


        ((Links)loginLink).getLinkHref();//Explicit downcasting

        




    }
}
