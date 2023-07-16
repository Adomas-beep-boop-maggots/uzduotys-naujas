import utils.TextProcessor;

public class Main {
    public static void main(String[] args) {

        TextProcessor text = new TextProcessor("input.txt");

        text.processCommands();
    }
}