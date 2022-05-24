public class Product
{
    
	int pcode;
	String pname;
	int price;
Product(int code,String name,int rate)
{
	pcode=code;
	pname=name;
	price=rate;
	
}
void display()
{
System.out.println(pcode+" "+pname+" "+price);
}

static void lowest(int p1, int p2, int p3){
    if(p1<p2&&p1<p3)
    {    
        System.out.println("Product 1 has the lowest price");
    }
    else if(p2<p1&&p2<p3){
        System.out.println("Product 2 has the lowest price");
    }
    else if(p3<p1&&p2>p3)
    {
        System.out.println("Product 3 has the lowest price");

    }
} 	

public static void main(String Args[]){
 	
	Product p1=new Product(100,"bottle",150);
	Product p2=new Product(111,"mirror",200);
	Product p3=new Product(110,"brush",20);
	p1.display();
	p2.display();
	p3.display();
	lowest(p1.price,p2.price,p3.price);

}
}