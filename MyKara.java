import kara.gamegrid.Kara;
import kara.gamegrid.KaraWorld;


/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara:
 * 
 * 
 * Actions:     move(), turnLeft(), turnRight(), putLeaf(), removeLeaf()
 * Sensors:     onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara {
	
    /**
     * In the 'act()' method you can write your program for Kara 
     */
  int row = 0;
  int cloverleaves = 0;
  
	public void act() {
    move();
    stop();
    System.out.println("The row with the most cloverleaves is " + row);
    System.out.println("The row contains " + cloverleaves + " cloverleaves");
	}

  
	/**
	 * The main-method is the start of the program where the Kara world is loaded
	 */
	public static void main(String[] args) {
		KaraWorld world = new KaraWorld("WorldSetup.txt", MyKara.class);
		// KaraWorld world = new KaraWorld("WorldSetup2.txt", MyKara.class);
		world.show();
	}
}
