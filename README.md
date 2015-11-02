# JNotifications-Win10
Windows10 notifications in Java

This lib is still under development.
To use it you need to put exes folder in same directory as main jar file.

example:<br>

public static void main(String[] args) {<br>
&emsp;&emsp;Notification not = new Notification("GroupName", "Image, mainClass.class);<br>
&emsp;&emsp;not.setLineFirst("1");<br>
&emsp;&emsp;not.setLineSecond("2");<br>
&emsp;&emsp;not.setLineThird("3");<br>
&emsp;&emsp;not.show();<br>
&emsp;}
