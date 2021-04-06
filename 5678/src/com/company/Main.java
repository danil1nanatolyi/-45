package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person Kate=new Person();
        Kate.Fullname="ЕКАТЕРИНА";
        Kate.age=37;
        System.out.println("Меня зовут"+ Kate.Fullname+","+"Мне"+Kate.age+"лет");
        Kate.move();
        Kate.talk();
    }
}
class  Person{
  String Fullname;
  int age;
  void move(){

  }
    void talk(){
      System.out.println("Такой-то Person говорит");
    }

}