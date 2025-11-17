import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        try{
            Scanner scanner = new Scanner(inputFile);
            while(scanner.hasNextLine()){
                String input = scanner.nextLine();
                InterpertInput.interpret(input);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}