//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Bank axis = new Bank("Axis Bank");
        axis.addCustomer("Prosen", 1000);
        axis.addCustomer("Indra", 1500);
        axis.addCustomer("Sourav", 800);
        axis.addTransaction("Prosen", 10);
        axis.addTransaction("Prosen", -7);
        axis.addTransaction("Indra", -12);
        axis.addTransaction("Indra", 6);
        axis.addTransaction("Sourav", 15);
        axis.addTransaction("Sourav", -13);
        axis.printStatement("Prosen");
        axis.printStatement("Indra");
        axis.printStatement("Sourav");
    }
}