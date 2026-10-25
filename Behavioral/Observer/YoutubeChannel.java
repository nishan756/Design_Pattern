package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    String name;

    List<Subscriber> users = new ArrayList<>();


    public YoutubeChannel(String name){

        this.name = name;
    }

    public void addSubscriber(Subscriber subscriber){
        users.add(subscriber);
    }

    public void notifyUser(String title){

        for(Subscriber user : users){

            user.notify(this, title);

        }
    }

    public void upload(String title){

        System.out.println("Video "+"( "+title+" )" +" uploaded successfully");

        this.notifyUser(title);

    }

    @Override 
    public String toString(){
        return this.name;
    }
    
}