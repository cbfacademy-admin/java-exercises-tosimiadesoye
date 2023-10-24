package com.cbfacademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ExerciseServer {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4040);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {

            out.println("Hello from server");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
