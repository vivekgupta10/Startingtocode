import java.util.Scanner;//importing the scanner 
class circle{//making circle
    float r;//value of radius
    float area(){//calculating the area
        return pie()*r*r;
    }    // area cal ends

float pie(){//making the value of pie for our conveynece
    return 22.0f/7;
}
}//class circle ends

class cyllinder extends circle{//class cylinder begin
    float h;

     float area (){//calculating the area
        return 2*pie()*r*(r+h);
     }

     float volume(){//calculating the vloumce
        return h*pie()*(r*r);
     }

}//cylinder calss ends

class rectangle{//making the rectangle class
    private float l;
    private float b;
    /**
     * @return the l
     */
    public float getL() {
        return l;
    }
    /**
     * @param l the l to set
     */
    public void setL(float l) {
        this.l = l;
    }
    /**
     * @return the b
     */
    public float getB() {
        return b;
    }
    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }
    float area(){
        return l*b;
    }
}//rectangle ends

class cuboid extends rectangle{
    private float h;

    /**
     * @return the h
     */
    public float getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(float h) {
        this.h = h;
    }
    
    float area(){
        return 2.0f*(getL()*getB()+getB()*h+h*getL());
    }

    float volume(){
        return getL()*getB()*h;
    }
}

public class tf10 {
    public static void main(String[] args) {
        // creating the objects
        Scanner in = new Scanner(System.in);
        circle c = new circle();
        cyllinder cy = new cyllinder();
        rectangle r = new rectangle();
        cuboid cu = new cuboid();
        //ends        
       System.out.println("Enter the length of cuboid");
       float x = in.nextFloat();
       cu.setL(x);
       System.out.println("Enter the breath of cuboid");
       float y = in.nextFloat();
       cu.setB(y);
       System.out.println("Enter the height of cuboid");
       float h = in.nextFloat();
       cu.setH(h);

       System.out.println(cu.area());
       System.out.println(cu.volume());
    }
}
