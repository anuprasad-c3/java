class Product{
        String pcode;
        String pname;
        float price;
        void display(){
                System.out.println("Product Code "+pcode);
                System.out.println("Product Code "+pcode);
                System.out.println("Product Code "+pcode);
        }
}


public class Market{
        public static void main(String[] args){
        Product pdt1=new Product();
                pdt1.pcode="hxdg8w635";
                pdt1.pname="TV";
                pdt1.price=25000;
                pdt1.display();


        Product pdt2=new Product();
                pdt2.pcode="hdg534635";
                pdt2.pname="AC";
                pdt2.price=15000;
                pdt2.display();


        Product pdt3=new Product();
                pdt3.pcode="wedg8w635";
                pdt3.pname="COOLER";
                pdt3.price=20000;
                pdt3.display();


        }
}

