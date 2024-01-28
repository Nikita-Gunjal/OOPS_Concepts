public class PolymorphismEx {
    //METHOD OVERLOADING...!!!
    /*public static void main(String[]args){
        Calculator cal= new Calculator();
        System.out.println(cal.sum(3,7));
       System.out.println(cal.sum((float)7.8,(float)2.4));
        System.out.println(cal.sum(9, 70,5));
    }   
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }*/

    /*public static void main(String[] args){
        dog d = new dog();
        d.eat();
    }
    }
    class Animal{
        void eat(){
            System.out.println("Eat Anything");
        }
    }
    class dog extends Animal{
        void eat(){
            System.out.println("Eat grass");
        }*/

//ABSRACT CLASS IMPLEMENTATION...!!!
        /*public static void main(String []args){
            horse h = new horse();
            h.eat();
            h.walk();
            chicken ch = new chicken();
            ch.eat();
            ch.walk();
         }
    }
    abstract class Animal{
        void eat(){
            System.out.println("Eating");
        }
        abstract void walk();
    }
    class horse extends Animal{
        void walk(){
            System.out.println("Walk in 4 legs");
        }
    }
    class chicken extends Animal{
        void walk(){
            System.out.println("walk in 2 legs");
        }*/

//INTERFACE IMPLEMENTATION...!!!
        /*public static void main(String args[]){
            Queen Q1 = new Queen();
            Q1.move();
        }
    }
    interface ChessPlayer{
        void move();
    }
    class Queen implements ChessPlayer{
        public void move(){
            System.out.println("up, down, left, right");
        }
    }
    class King implements ChessPlayer{
        public void move(){
            System.out.println("up, down ,left, right");
        }
    }
    class Rook implements ChessPlayer{
        public void move(){
            System.out.println("up, down, left, right");
        }*/

//MULTIPLE INHERITANCE USING INTERFACES...!!
 /*public static void main(String [] args){
            Bear b1 = new Bear();
            b1.eatgrass();
            b1.eatmeat();

        }
    }
    interface Herbivore{
        void eatgrass();

    }
    interface Carnivore{
        void eatmeat();

    }

    class Bear implements Herbivore , Carnivore{
        public void eatgrass(){
            System.out.println("eating grass");
        }
        public void eatmeat(){
            System.out.println("Eating meat");
        }*/
        
    }


