import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

    Terrain terrainSize;
    Location pathfinderLocation;
    Location curiosityLocation;
    char[] pathfinderMovements;
    char[] curiosityMovements;

    public Input(){
        File file = new File("src/InputFile.txt");
        try {
            Scanner input = new Scanner(file);
            char[] firstLine = input.nextLine().replace(" ", "").toCharArray();
            this.terrainSize = new Terrain(
                    Character.getNumericValue(firstLine[0]),
                    Character.getNumericValue(firstLine[1]));

            char[] secondLine = input.nextLine().replace(" ", "").toCharArray();
            this.pathfinderLocation = new Location(
                    Character.getNumericValue(secondLine[0]),
                    Character.getNumericValue(secondLine[1]),
                    secondLine[2]);

            this.pathfinderMovements = input.nextLine().replace(" ", "").toCharArray();

            char[] fourthLine = input.nextLine().replace(" ", "").toCharArray();
            this.curiosityLocation = new Location(
                    Character.getNumericValue(fourthLine[0]),
                    Character.getNumericValue(fourthLine[1]),
                    fourthLine[2]);

            this.curiosityMovements = input.nextLine().replace(" ","").toCharArray();

            input.close();
            System.out.println("Executed all Commands...");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
