package com.ontime.encryption;

public class Main {
    public static void main(String[] args) {
        int[] ids = new int[2];
        ids[0] = 1;
        ids[1] =2;
        User user = new User ("camicass",
                "falafel@hotmail.com", "falafel");

        System.out.println("######  Original values  ########"
                + "\n" + "camicass"
                + "\n" + "falafel@hotmail.com"
                + "\n" + "falafel");

        String encryptedEmail = Encryption.encryptUser(user).getEmail();
        String encryptedPassword = Encryption.encryptUser(user).getPassword();
        String encryptedUsername = Encryption.encryptUser(user).getUsername();


        System.out.println("######  User Encrypted  ########"
                + "\n" + encryptedUsername
                + "\n" + encryptedEmail
                + "\n" + encryptedPassword
                );



        User encryptedUser = new User(encryptedUsername, encryptedEmail, encryptedPassword);


        String decryptedEmail = Encryption.decryptUser(encryptedUser).getEmail();
        String decryptPassword = Encryption.decryptUser(encryptedUser).getPassword();
        String decryptUsername = Encryption.decryptUser(encryptedUser).getUsername();


        System.out.println("######  User Decrypted  ######## "
                 + "\n" + decryptUsername
                + "\n" + decryptedEmail
                + "\n" + decryptPassword
                );


        System.out.println("-------------------------------------- /n --------------------------------------");

        String title = "doctor";
        String duration = "90mins";
        String [] address = {"germany","street 2"};

        System.out.println("######  Original values  ########"
                + "\n" + title
                + "\n" + address[0]
                + "\n" + address[1]
                + "\n" + duration);

        Event event = new Event(title, address, duration);

        String encryptedTitle, encryptedDuration;
        String [] encryptedAddress;

        encryptedTitle = Encryption.encryptEvent(event).getTitle();
        encryptedAddress = Encryption.encryptEvent(event).getAddress();
        encryptedDuration = Encryption.encryptEvent(event).getDuration();


        System.out.println("######  Encrypted values  ########"
                + "\n" + encryptedTitle
                + "\n" + encryptedAddress[0]
                + "\n" + encryptedAddress[1]
                + "\n" + encryptedDuration);


        // we create an encrypted event using the encrypted values // simulating data coming from DB

        Event encryptedEvent = new Event(encryptedTitle,encryptedAddress, encryptedDuration);

        String decryptedTitle = Encryption.decryptEvent(encryptedEvent).getTitle();
        String [] decryptedAddress = Encryption.decryptEvent(encryptedEvent).getAddress();
        String decryptedDuration = Encryption.decryptEvent(encryptedEvent).getDuration();


        System.out.println("######  Decrypted values  ########"
                + "\n" + decryptedTitle
                + "\n" + decryptedAddress[0]
                + "\n" + decryptedAddress[1]
                + "\n" + decryptedDuration);







    }
}
