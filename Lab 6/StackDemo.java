public class StackDemo {
    int Top = -1;
    int mak = 4;
    int[] stack = new int[mak];

    void push(int n) {
        if (Top >= mak - 1) {
            System.out.println("Stack Overflow");
        } else {
            Top++;
            stack[Top] = n;
        }
    }

}
