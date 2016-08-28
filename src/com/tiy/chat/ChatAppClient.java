package com.tiy.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by DTG2 on 08/25/16.
 */
public class ChatAppClient {
    public static void main(String[] args) {
        Scanner clientInput = new Scanner(System.in);

        try {

            Socket clientSocket = new Socket("localhost", 8080);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


//            System.out.println("What is your response?");



//            out.println("My name is Donald");

            String serverResponse;
//            while ((serverResponse = in.readLine()) != null) {
            serverResponse = in.readLine();
            System.out.println("Received message: " + serverResponse);
            out.println("Connection made.");

            userName(out, in, clientInput);
////            System.out.println(serverResponse);
//            System.out. println("Name: ");
//            out.println(clientInput);
//            String userName = clientInput.nextLine();
//            System.out.println(userName + ":");





            clientSocket.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void userName(PrintWriter out, BufferedReader in, Scanner clientInput) throws IOException{
        String nameQuestion;
        nameQuestion = in.readLine();
        System.out.println(nameQuestion);
        System.out. println("Name: ");
        out.println(clientInput);
        String userName = clientInput.nextLine();
        System.out.println(userName + ":");
    }


    public void clientConversationHandler() {


    }
}
