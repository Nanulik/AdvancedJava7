package StaticClassesEnumsExceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

enum GameType {
    SOCCER,
    HOCKEY,
    RUGBY
}

public class Game {
    public static void writeNumPlayersPerTeam(GameType game) throws IOException {
        File file;
        FileWriter writer;
        String fileName="";
        String playerNum="";
        switch (game) {
            case SOCCER:
                fileName="soccer.txt";
                playerNum="11";
                break;
            case HOCKEY:
                fileName="hockey.txt";
                playerNum="6";
                break;
            case RUGBY:
                fileName="rugby.txt";
                playerNum="15";
                break;
          }

        file = new File(fileName);
        file.createNewFile();
        writer = new FileWriter(fileName);
        writer.write(playerNum);
        writer.close();
    }

    public static void main(String[] args) {
        try {
            writeNumPlayersPerTeam(GameType.SOCCER);
            writeNumPlayersPerTeam(GameType.HOCKEY);
            writeNumPlayersPerTeam(GameType.RUGBY);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}