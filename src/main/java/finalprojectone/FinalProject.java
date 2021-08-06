package finalprojectone;

import java.io.Console;
import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args){
        Console console = System.console();
        if (console != null) {
            console.writer().println("We have a console");
            Scanner scanner = new Scanner(console.reader());
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("Hi " + name + ", how do you feel today?");
        }
        else {
            System.out.println("We don't have a console!");
        }
        //System.out.println("Hello Plamena");
    }
}