package com.tiy.chat;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by DTG2 on 08/25/16.
 */
public class ChatAppServer implements Runnable {

    public void run() {

    }

    public void startServer() throws Exception {
        try {
            System.out.println("Server opening...");
            ServerSocket serverListener = new ServerSocket(8080);
            System.out.println("The audience is listening...");

            while (true) {
                Socket incomingConnection = serverListener.accept();
                System.out.println("Connection opening.");
                ChatAppConnectionHandler handler = new ChatAppConnectionHandler(incomingConnection);
                Thread handlerThread = new Thread(handler);
                handlerThread.start();
                userName(incomingConnection);
//                out.println("Connection open?");
//                userName(out, in);
//                out.println("What is your name?");
//                String userName;
//                userName= in.readLine();
//                System.out.println("Name: " + userName);
////                Scanner userName = new Scanner(System.in);
//                conversationHandler(incomingConnection);


            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public void userName(Socket incomingConnection) throws IOException {
        PrintWriter out = new PrintWriter(incomingConnection.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(incomingConnection.getInputStream()));
//        Scanner userInput = new Scanner(System.in);

//        System.out.println("What is your name?");
        try {
            Thread.sleep(1000);
            out.println("What is your name?");
            Thread.sleep(1000);
        String userName;
        userName= in.readLine();
        System.out.println("Name: " + userName);
////                Scanner userName = new Scanner(System.in);
////        conversationHandler(incomingConnection);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
    public void conversationHandler(Socket incomingConnection) throws IOException {



    }


}
