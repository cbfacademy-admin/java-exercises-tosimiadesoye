package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseClient {
public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(4040)){
        while (true){
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = bufferedReader.readLine();
            System.out.println(str);
        }
    }catch (IOException e){
        System.out.println(e);
    }
}

}
