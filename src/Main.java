// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      MyStack st = new MyStack();

        ConvertInToPostFix myph=new ConvertInToPostFix();
       String Ali=myph.ConvertInfixToPostFix("(6+4)*(3*9)");
      System.out.println( st.PolishOperation(Ali));

    }
}