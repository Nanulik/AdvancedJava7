package StaticClassesEnumsExceptions;



public class GameMain {



     public static String gameType(String text, GameType type){
            String result = "Success";

           switch (type){
               case SOCCER:
                   //create file
                   //write to file
                   break;
               case HOCKEY:
                   //create file
                   //write to file
                   break;
               case RUGBY:
                   //create file
                   //write to file
                   break;

               default:
               result = "Failed";
           }
            return result;
     }

}

/*copy of my code and Gena's code that I have sent for homework
the other file Game I will clear and sent only what we did with Gena

package StaticClassesEnumsExceptions;


import com.sun.jdi.event.StepEvent;

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

  /*  public static void main(String[] args) {

        String soccer = "Soccer.txt";
        String hockey = "Hockey.txt";
        String rugby = "Rugby.txt";

        Game game = new Game();
        //call to create file function

        game.createSoccerFile(soccer);
        game.createHockeyFile(hockey);
        game.createRugbyFile(rugby);
        //call to write to file function
        game.writeToSoccerFile(soccer, "11");
        game.writeToHockeyFile(hockey, "6");
        game.writeToRugbyFile(rugby, "15");
    }

    public void createSoccerFile(String fileSoccer){
        File soccer = new File(fileSoccer);

        try {
            soccer.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createHockeyFile(String fileHockey){
        File hockey = new File(fileHockey);

        try {
            hockey.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createRugbyFile(String fileRugby){
        File rugby = new File(fileRugby);

        try {
           rugby.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToSoccerFile(String fileSoccer, String text){
        try {
            FileWriter soccer = new FileWriter(fileSoccer);
            soccer.write(text);
            soccer.close();
        } catch (IOException e) {
            System.out.println("Can't write to Soccer file ");
            e.printStackTrace();
        }
    }
    public void writeToHockeyFile(String fileHockey, String text){
        try {
            FileWriter hockey = new FileWriter(fileHockey);
            hockey.write(text);
            hockey.close();
        } catch (IOException e) {
            System.out.println("Can't write to Hockey file ");
            e.printStackTrace();
        }
    }
    public void writeToRugbyFile(String fileRugby, String text){
        try {
            FileWriter rugby = new FileWriter(fileRugby);
            rugby.write(text);
            rugby.close();
        } catch (IOException e) {
            System.out.println("Can't write to Rugby file ");
            e.printStackTrace();
        }
    }


}





    //The enum "GameType" will list three types of games: soccer, hockey, and rugby.
   //enum GameType {
  //      SOCCER,
   //     HOCKEY,
    //    RUGBY
   // }
    //will check the type
    //create a new file with the name of the game as the name of the file
    //In the file, it will print 11 in the case of Soccer, 6 if it is Hockey, and 15 for Rugby.
    //Please use a switch case
*/


