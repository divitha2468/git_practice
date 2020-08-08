
class mammal{
    void walk(){
        System.out.println("walks");
    }
}
class human extends mammal{
    void talk(){
        System.out.println("talks");
    }
    void eat(){
        System.out.println("eats");
    }
}

class livingBeings{
    public static void main(String args[]) {
   
        human examp = new human();
        examp.eat();
        examp.walk();
        System.out.println();
    }
}