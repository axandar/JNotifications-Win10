package com.axandar;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by Axandar on 01.11.2015.
 */
public class Notification {

    private String groupName;
    private String imagePath;
    private String lineFirst;
    private String lineSecond;
    private String lineThird;
    private String exeLocation;
    private Class mainClass;

    public Notification(String groupName, String imagePath, Class mainClass){
        this.groupName = groupName;
        this.imagePath = imagePath;
        this.mainClass = mainClass;
    }

    public void setLineFirst(String text){
        lineFirst = text;
    }

    public void setLineSecond(String text){
        lineSecond = text;
    }

    public void setLineThird(String text){
        lineThird = text;
    }

    public void show(){
        try {
            URL fileUrl = mainClass.getProtectionDomain().getCodeSource().getLocation();
            File file = new File(fileUrl.toURI());
            String grandParent = file.getParentFile().toString();
            exeLocation = (grandParent + "\\notification.exe");
            //exeLocation = (mainClass.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() + "notification.exe").substring(1);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String command = exeLocation + " " + groupName + " " + imagePath + " " +
                "\"" + lineFirst + "\"" + " " + "\"" + lineSecond + "\"" + " " + "\"" + lineThird + "\"";
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
        builder.redirectErrorStream(true);
        System.out.println(command);
        try{
            builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
