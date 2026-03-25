package practice3.staticFinalPractice;

public class GameSettings {
    static int maxPlayers;
    final String gameName = "Dota2";
    int currentPlayers;

    GameSettings(int someCurrentPlayers) {
        this.currentPlayers = someCurrentPlayers;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        currentPlayers += 1;
    }

    void printGameStatus() {
        System.out.println("Название " + gameName);
        System.out.println("текущее кол-во игроков " + currentPlayers);
        System.out.println("максимальное кол-во игроков " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings.setMaxPlayers(100);
        GameSettings cs2 = new GameSettings(10);
        GameSettings cs1 = new GameSettings(12);
        cs1.addPlayer();
        cs2.addPlayer();
        cs2.addPlayer();
        System.out.println("Статус игр после изменений:");
        cs2.printGameStatus();
        cs1.printGameStatus();
    }
}
