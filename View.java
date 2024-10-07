package view;

import controller.Controller;
import domain.Item;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private Controller controller;
    int var;

    public View(Controller controller) {
        this.controller = controller;
    }
    public void display(){

        Item[] array =this.controller.filterbyweight(var);
        for(Item item : array){
            if(item == null)
                break;
            System.out.println(item);
        }
    }
    public void read(){
        System.out.println("Choose a weight");
        Boolean ok = true;
        while(ok) {
            Scanner scanner = new Scanner(System.in);
            try {
                this.var = scanner.nextInt();
                ok = false;
            } catch (InputMismatchException ex) {
                System.out.println("Please give an int");
            }
        }
    }

}
