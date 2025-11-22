package org.example;


public class DishStack {

    private static Dish[] stack;

    DishStack() {
        stack = new Dish[5];
    }

    public static void push(Dish dish) {
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                stack[i] = dish;
                break;
            }
        }
    }

    public static Dish pop() {
        int index = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                index = i - 1;
                break;
            }
        }
        Dish popped = stack[index];
        stack[index] = null;
        return popped;
    }

    public static int size() {
        int count = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Dish peek() {
        int index = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                index = i - 1;
            }
        }
        return stack[index];
    }

    public static void printStack() {
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                break;
            } else {
                System.out.println(stack[i].description);
            }
        }
    }

    public static void clearStack() {
        for (int i = 0; i < stack.length; i++) {
            stack[i] = null;
        }
    }
}
