package Pertrmuan10.Latihan3;

import Pertrmuan10.Latihan2.MyStack;

public class ParsePost {
    private MyStack theStack;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        theStack = new MyStack(20);
        char ch;
        int i, num1, num2, interAns;

        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                theStack.push((char)(ch - '0'));
            } else {
                num2 = theStack.pop();
                num1 = theStack.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push((char) interAns);
            }
        }
        return theStack.pop();
    }
}

