# JNotifications-Win10
Windows10 notifications in Java

This lib is still under development.
To use it you need to put exes folder in same directory as main jar file.

example:

public static void main(String[] args) {<br>
        Notification not = new Notification("GroupName", "Image, mainClass.class);
        not.setLineFirst("1");
        not.setLineSecond("2");
        not.setLineThird("3");
        not.show();
    }
