package com.company;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Main {


    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            displayStuff("local host", inetAddress);
            System.out.print("--------------------------");
            inetAddress = InetAddress.getByName("rd8vr7ogx7udrzjy3zy2fxum6dc30s.burpcollaborator.net");
            displayStuff("rd8vr7ogx7udrzjy3zy2fxum6dc30s.burpcollaborator.net", inetAddress);
            System.out.print("--------------------------");
            InetAddress[] inetAddressArray = InetAddress.getAllByName("rd8vr7ogx7udrzjy3zy2fxum6dc30s.burpcollaborator.net");
            for (int i = 0; i < inetAddressArray.length; i++) {
                displayStuff("rd8vr7ogx7udrzjy3zy2fxum6dc30s.burpcollaborator.net #" + (i + 1), inetAddressArray[i]);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void displayStuff(String whichHost, InetAddress inetAddress) {
        System.out.println("--------------------------");
        System.out.println("Which Host:" + whichHost);
        System.out.println("Canonical Host Name:" + inetAddress.getCanonicalHostName());
        System.out.println("Host Name:" + inetAddress.getHostName());
        System.out.println("Host Address:" + inetAddress.getHostAddress());
    }
}

