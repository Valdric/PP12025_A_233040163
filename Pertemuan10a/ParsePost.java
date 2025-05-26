package Pertemuan10a;

public class ParsePost {
    private MyStack theStack;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        theStack = new MyStack(20);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);

            if (ch >= '0' && ch <= '9') {
                theStack.push(ch - '0');
            } else {
                if (theStack.isEmpty()) {
                    System.out.println("Error: operand kurang.");
                    return 0;
                }
                int num2 = theStack.pop();

                if (theStack.isEmpty()) {
                    System.out.println("Error: operand kurang.");
                    return 0;
                }
                int num1 = theStack.pop();

                switch (ch) {
                    case '+':
                        theStack.push(num1 + num2);
                        break;
                    case '-':
                        theStack.push(num1 - num2);
                        break;
                    case '*':
                        theStack.push(num1 * num2);
                        break;
                    case '/':
                        if (num2 != 0) {
                            theStack.push(num1 / num2);  // ← diperbaiki
                        } else {
                            System.out.println("Error: pembagian dengan nol.");
                            return 0;
                        }
                        break;
                    default:
                        System.out.println("Operasi tidak dikenali: " + ch);
                        return 0;
                }
            }
        }

        if (!theStack.isEmpty()) {
            return theStack.pop();
        } else {
            System.out.println("Error: hasil tidak ditemukan.");
            return 0;
        }
    }
}
