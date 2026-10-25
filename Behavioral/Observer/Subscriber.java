package Behavioral.Observer;

public class Subscriber {

    private final String username;
    
    public Subscriber(String username){
        this.username = username;
    }

    public void notify(YoutubeChannel channel, String title){

        System.out.println("Subscriber : "+this.username + "\n" + channel + " uploaded new video "+title);

    }

    @Override 
    public String toString(){
        return this.username;
    }
}