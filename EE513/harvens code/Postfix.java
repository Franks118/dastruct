import java.util.*;

import javax.swing.Popup;
public class Postfix{
    Node head = null;
    int counter;
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Postfix pf = new Postfix();
        String infix;
        System.out.println("Enter infix: ");
        infix = s.nextLine();
        pf.operation(infix);
    }
    public void operation(String infix){
        String postfix = "";
        int string_length = infix.length();
        for(int i = 0; i < string_length; i++){
            char current_letter = infix.charAt(i);
            if(Character.isLetter(current_letter)){
                postfix += current_letter;
            } else if(current_letter == '+' || current_letter == '-' || current_letter == '/' || current_letter == '*' || current_letter == '^'){
                if(head == null){
                    push(current_letter);
                } else{
                    if(current_letter == '^'){
                        while(head.info == '^'){
                            postfix += head.info;
                            pop();
                        }
                        push(current_letter);
                    }else if(current_letter == '/' || current_letter == '*'){
                        while(head.info == '^'|| head.info == '*'|| head.info == '/' ){
                            postfix += head.info;
                            pop();
                        }
                        push(current_letter);
                    } else if(current_letter == '-' || current_letter == '+'){
                        while(head.info == '^'|| head.info == '*'|| head.info == '/' || head.info == '-' || head.info == '+'){
                            postfix += head.info;
                            pop();
                        }
                        push(current_letter);
                     
                   }
                }
            } else if(current_letter == '('){
                push(current_letter);
            } else if(current_letter == ')'){
                while(head.info != '('){
                        postfix += head.info;
                        pop();
                }
                pop();
            }
      }
        
        while(head != null){
            postfix += head.info;
            pop();
        }
        
        System.out.println("postfix: " + postfix);
    }
    public void push(char info){
        if(head == null){
            Node new_node = new Node(info);
            head = new_node;
        } else{
            Node new_node = new Node(info);
            new_node.next = head;
            head = new_node;
        }
    }
    public void pop(){
        head = head.next;
    }
}