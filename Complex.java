public class Complex {
int r;
int i;
    Complex(int real,int img){
    r=real;
    i=img;
    }
    void display(){
    System.out.println(r+"+"+i+"i");
    }
    static void add(int r1,int i1,int r2,int i2 ){
        r1=r1+r2;
        i1=i1+i2;
        System.out.println("Result = "+r1+"+"+i1+"i");
    }
    public static void main(String[] args) {
        
        Complex s1=new Complex(3,2);
        Complex s2=new Complex(4,6);
        System.out.println("Complex Numbers are:");
        s1.display();
        s2.display();
        add(s1.r,s1.i,s2.r,s2.i);
    }
}
    
