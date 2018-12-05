package lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("H I HI HI HI");
            }
        };
        Runnable runnable1=()-> {System.out.println("Hello");};
        Runnable runnable2=()->  System.out.println("Hello");

        ActionListener actionListener1=(e)-> System.out.println(e.paramString());
                ActionListener actionListener2= e -> System.out.println(e.paramString());
        String s="hello";
        ActionListener actionListener3=(e)-> System.out.println(s);

    }
}

