import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class MissionControl {

    public static void main(String[] args) {
        System.out.println("Mission Control Launched!");

        Input missionInput = new Input();
        Terrain missionTerrain = missionInput.terrainSize;

        Rover pathfinder = new Rover("Pathfinder", missionInput.pathfinderLocation,missionTerrain);
        Rover curiosity = new Rover("Curiosity", missionInput.curiosityLocation,missionTerrain);

        pathfinder.move(missionInput.pathfinderMovements);
        curiosity.move(missionInput.curiosityMovements);

    }
}


