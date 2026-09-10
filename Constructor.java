
public static class Constructor {
    int a;
    float b;
    String c;
    Constructor() {
        System.out.println("Default constructor");
    }
    Constructor(int x){
        this.a=x;

    }
    Constructor(int x,float y){
        this.a=x;
        this.b=y;
    }
    Constructor(int x,float y,String z){
        this.a=x;
        this.b=y;
        this.c=z;
    }
    
}
public static void main(String[] args) {
    Constructor obj1 = new Constructor();
     System.out.println("inside object 1" + "a:" + obj1.a + "b:" + obj1.b + "c:" + obj1.c);
    Constructor obj2 = new Constructor(10);
    System.out.println("inside object 2" + "a:" + obj2.a + "b:" + obj2.b + "c:" + obj2.c);
}
