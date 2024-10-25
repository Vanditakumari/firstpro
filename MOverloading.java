class Calculator{
    //example of method overloading

    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public double add(double n1,int n2){
        //method declared as double because when adding int and double it will return double
        return n1+n2;
    }




}

public class MOverloading {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int r1 = obj.add(3,4);
        int r2 = obj.add(4,5,6);
        double r3 = obj.add(4,5);

        String str = "Sita";
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(str.getClass().getName()); //This is to check datatype of String only
        //but how I can check or print it for another datatype?
        /* here 3 times object created but why 3rd add method not call and after adding the result
        variable declared as double but that method is not called why and how can I call that one?
         */
    }

}
