import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    String name = read.next();
	    
	    //screenshots
	    ScreenShot screenshot1 = new ScreenShot();
	    ScreenShot screenshot2 = new ScreenShot(name);
	    
	    //outputting the names
	    System.out.println(screenshot1.getName());
	    System.out.println(screenshot2.getName());
	}
}

class ScreenShot{
    private String name;
    
    //complete the first constructor
    ScreenShot(){
        this.name = "Screenshot";
    }
    
    //complete the second constructor
    ScreenShot(String name){
        this.name = name;
    }
    
    //Setter
    public void setName(String name){
        this.name = name;
    }
    
    //Getter
    public String getName(){
        return name;
    }
}

//sololearn.com 34.2 Practice: Organizing Screenshots