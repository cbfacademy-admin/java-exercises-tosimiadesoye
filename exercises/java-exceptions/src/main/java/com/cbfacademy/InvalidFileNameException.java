package com.cbfacademy;


//  class InvalidFileNameException extends Exception {
//         public InvalidFileNameException(String message) {
//             super(message);
//         }
//     }

public class InvalidFileNameException extends Exception {
    private final String message;

    public InvalidFileNameException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return String.join("-", super.getMessage(), this.message);
    }
}
