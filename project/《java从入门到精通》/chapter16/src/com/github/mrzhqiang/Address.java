package com.github.mrzhqiang;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
