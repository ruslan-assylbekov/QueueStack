public class MyLinkedListStack {
    static MyLinkedList stack = new MyLinkedList();
    MyLinkedListStack(){}

    public static void push(Object o){
        stack.add(o,0);
    }

    public static Object pop(){
        Object element = stack.get(stack.size()-1);
        stack.removeByIndex(stack.size()-1);
        return element;
    }
}