public class Stack {
  int stack[];
  int top;
  int capacity;

  public Stack(int size) {
    stack = new int[size];
    this.capacity = size;
    this.top = -1;
  }

  public void push(int value) {
    if (isFull()) {
      System.exit(1);
    }
    stack[++top] = value;
  }

  public int pop() {
    if (isEmpty()) {
      return top;
    }
    return stack[--top];
  }

  public void printStack() {
    for (int i = 0; i < stack.length; i++) {
      System.out.println("Stack: " + stack[i]);
    }
  }

  public boolean isEmpty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isFull() {
    if (top == stack.length) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack(5);
    stack.push(3);
    stack.push(2);
    stack.push(1);
    stack.push(4);
    stack.push(5);
    System.out.println("Stack List:");
    stack.pop();
    stack.printStack();

  }

}
