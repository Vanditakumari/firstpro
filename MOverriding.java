class shape{
    void draw(){
        System.out.println("Various shapes");
    }
}

class Square extends shape{
    @Override
    void draw(){
        super.draw();
        System.out.println("Square shape");
    }
}

public class MOverriding {
    public static void main(String[] args){
        shape r = new Square();
        r.draw();
    }
}