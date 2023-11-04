import java.util.Stack;

public class ConvertInToPostFix {
    Stack<String> myStack = new Stack<>();

    public String ConvertInfixToPostFix(String phrase) {
        String output = "";
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (Character.isDigit(c)) {
                output += c;
            } else if (c == ')') {
                while (!myStack.isEmpty() && !myStack.peek().equals("(")) {
                    output += myStack.pop();
                }
                if (!myStack.isEmpty()) {
                    myStack.pop();
                } else {

                }
            } else if (myStack.isEmpty()) {
                myStack.push(String.valueOf(c));
            } else {
                if (myStack.peek().equals("(")) {
                    myStack.push(String.valueOf(c));
                } else {
                    while (!myStack.isEmpty() && geSymbolValue(String.valueOf(c)) <= geSymbolValue(myStack.peek())) {
                        output += myStack.pop();
                    }
                    myStack.push(String.valueOf(c));
                }
            }
        }
        while (!myStack.isEmpty()) {
            output += myStack.pop();
        }
        return output;
    }

    public int geSymbolValue(String sy) {
        switch (sy) {
            case "-":
            case "+":
                return 1;
            case "*":
            case "/":
                return 2;
            case "(":
            case ")":
                return 3;
            default:
                return -1; // برای علامت‌های غیرمعتبر
        }
    }
}





