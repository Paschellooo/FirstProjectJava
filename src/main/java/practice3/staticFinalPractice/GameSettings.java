package practice3.staticFinalPractice;

public class GameSettings{
    public static int maxPlayers = 10;
    final String gameName;
    int currentPlayers = 0;
    GameSettings (String gameName){
        this.gameName = gameName;}
     public static void setMaxPlayers(int newMaxPlayers){
            maxPlayers = newMaxPlayers;
        }
     void addPlayers(){
        currentPlayers ++;
     }
     public void printGameStatus(){
        System.out.println("название " + gameName);
        System.out.println("текущее кол-во игроков " + currentPlayers);
        System.out.println("макс кол-во игроков " + maxPlayers);
     }
     public static void main (String[] args){
        GameSettings game1 = new GameSettings("шашки");
        GameSettings game2 = new GameSettings("chess");
         System.out.println("=== Начальный статус игр ===");
        game2.printGameStatus();
        game1.printGameStatus();

         System.out.println("=== Меняем максимальное количество игроков на 20 ===");
    GameSettings.setMaxPlayers(20);

         System.out.println("=== Добавляем по одному игроку в каждую игру ===");
    game1.addPlayers();
    game2.addPlayers();

         System.out.println("=== Финальный статус игр ===");
   game1.printGameStatus();
   game2.printGameStatus();
     }
    }