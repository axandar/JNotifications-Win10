package com.axandar;

/**
 * Created by Axandar on 01.11.2015.
 */
public class startTest {

    public static void main(String[] args) {
        Notification not = new Notification("Testowe", "G:\\image.png", startTest.class);
        not.setLineFirst("1");
        not.setLineSecond("2");
        not.setLineThird("3");
        not.show();
    }
}
