# JNotifications-Win10
Windows10 notifications in Java

This lib is still under development.
To use it you need to put exes folder in same directory as main jar file.

example:<br>

public static void main(String[] args) {<br>
        &emspNotification not = new Notification("GroupName", "Image, mainClass.class);<br>
        not.setLineFirst("1");<br>
        not.setLineSecond("2");<br>
        not.setLineThird("3");<br>
        not.show();<br>
    }
