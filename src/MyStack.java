public class MyStack {
    public int Size=20;
    public int top=0;
    public int[] myStack=new int[Size];
    public MyStack(){
        System.out.println("hello world");
    }
    public void push(int ali){
        myStack[top]=ali;
       ++top;
    }
    public int pop() throws StackOverflowError{
        if(!isEmpty()) throw new StackOverflowError("err");
        return myStack[--top];
    }
    public boolean isEmpty(){
        if (top==0){
            return  false;
        }
        return true;
    }
    public int PolishOperation(String Phrase){
        for (int i=0;i<Phrase.length();i++){
              char c=Phrase.charAt(i);
              if(Character.isDigit(c)){
                  push(Character.getNumericValue(c));
              }else{
                  push(DetermineStack(pop(),pop(),c));
              }
        }
       return pop();
    }
    public int DetermineStack(int num1,int num2,char operator){
        switch (operator){
            case '-':
              return   num2 - num1;
            case '*':
                return   num1 * num2;
            case '/':
                return   num2 / num1;
            default:
                return   num1 + num2;

        }

    }


}
