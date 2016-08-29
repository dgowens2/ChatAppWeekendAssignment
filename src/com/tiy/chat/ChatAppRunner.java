package com.tiy.chat;

import java.io.IOException;

/**
 * Created by DTG2 on 08/25/16.
 */
public class ChatAppRunner {
    public static void main(String[] args) {

        ChatAppServer myServer = new ChatAppServer();
        try {
            myServer.startServer();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
