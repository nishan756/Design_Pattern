package Behavioral.Observer;

public class Main {
    
    public static void main(String[] args) {
        
        Subscriber user1 = new Subscriber("Ata Alahy Nishan");

        Subscriber user2 = new Subscriber("Razoan Abir Lizan");

        Subscriber user3 = new Subscriber("Junayed Iqbal");

        Subscriber user4 = new Subscriber("Shakib Hossen");

        YoutubeChannel channel = new YoutubeChannel("The Fake Podcast");

        channel.addSubscriber(user1);

        channel.addSubscriber(user2);

        channel.addSubscriber(user3);

        channel.addSubscriber(user4);

        channel.upload("How to income 50000 per month via money laundering");

    }

}
