import java.util.Scanner;
import java.util.Random;
class cylinder{
    private float radius;
    private float height;
    private float surfacearea;
    private float volume;
    public cylinder(){
        surfacearea = (2.0f*(22.0f/7)*radius)*(radius+height);
        volume = (22.0f/7)*(radius*radius)*height;
    }
    public cylinder(float r , float h){
        radius = r;  height = h;
        surfacearea = (2.0f*(22.0f/7)*radius)*(radius+height);
        volume = (22.0f/7)*(radius*radius)*height;
    }
    void SetRadius(float x){
    radius = x;
    }
    void SetHeight(float x){
        height = x;
    }
    float GetHeight(){
        return height;
    }
    void SetSurafaceArea(float x){
        if(x==surfacearea){
            System.out.println("Yes your answer is write");
        }
        else{
            System.out.println("Your answer is wrong please try again");
        }

    }
    float GetSurfaceArea(){
        return surfacearea;
    }
    float GetVolume(){
        return volume;
    }
    

    
}
public class tf8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        cylinder c = new cylinder(5, 6);
        System.out.println(c.GetSurfaceArea());
        System.out.println(c.GetVolume());
    }
}
