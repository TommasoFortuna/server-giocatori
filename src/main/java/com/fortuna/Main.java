package com.fortuna;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Server avviato");

        ServerSocket mioServerSocket = new ServerSocket(3000);

        do {
            Socket mioSocket = mioServerSocket.accept();
            MioThread t = new MioThread(mioSocket);
            t.start();
        } while (true);

    }
}