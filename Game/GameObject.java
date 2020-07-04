package Game;

public abstract class GameObject {

    public abstract void draw();

    public static void main(String[] args) {
        Player player = new Player();
        //player.draw();

        Menu menu = new Menu();
        //menu.draw();

        GameObject[] gameObjects = new GameObject[2];
        gameObjects[0] = player;
        gameObjects[1] = menu;

        for (GameObject obj : gameObjects){
            obj.draw();
        }
        //GameObject myObject = new GameObject();


    }
}
