public class Main {
    private int x;
    private int y;
    private int z;
    private char direction;  // N, S, E, W, U, D
    private char secondry_direction;

    public Main() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.direction = 'N';

    }
    void executeCommands(char[] commands) {
        for(char command:commands){
            processCommand(command);
        }
    }

    private void processCommand(char command) {
        switch (command) {
            case 'f':
                moveForward();
                break;
            case 'b':
                moveBackward();
                break;
            case 'l':
                turnLeft();
                break;
            case 'r':
                turnRight();
                break;
            case 'u':
                turnUp();
                break;
            case 'd':
                turnDown();
                break;
        }
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }
    public void turnLeft() {
        if(direction=='U'||direction=='D'){
            switch (secondry_direction){
                case 'N':
                    direction = 'W';
                    break;
                case 'S':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'N';
                    break;
                case 'W':
                    direction = 'S';
                    break;
            }
        }
        else{
            switch (direction) {
                case 'N':
                    direction = 'W';
                    break;
                case 'S':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'N';
                    break;
                case 'W':
                    direction = 'S';
                    break;
            }
        }
    }
    public void turnRight() {
        if(direction=='U'||direction=='D'){
            switch (secondry_direction){
                case 'N':
                    direction = 'E';
                    break;
                case 'S':
                    direction = 'W';
                    break;
                case 'E':
                    direction = 'S';
                    break;
                case 'W':
                    direction = 'N';
                    break;
            }
        }
        else {
            switch (direction) {
                case 'N':
                    direction = 'E';
                    break;
                case 'S':
                    direction = 'W';
                    break;
                case 'E':
                    direction = 'S';
                    break;
                case 'W':
                    direction = 'N';
                    break;
            }
        }
    }
    public void turnUp() {
        secondry_direction=direction;
        if (direction == 'N' || direction == 'S'||direction == 'E'|| direction == 'W') {
            direction = 'U';
        }

    }
    public void turnDown() {
        secondry_direction = direction;
        if (direction == 'N' || direction == 'S' || direction == 'E' || direction == 'W') {
            direction = 'D';
        }
    }
    public String getPositionAndDirection() {
        return "(" + x + ", " + y + ", " + z + ") - " + direction;
    }
    public static void main(String[] args) {
        Main spacecraft = new Main();
        System.out.println("Initial Position: " + spacecraft.getPositionAndDirection());
        char[] commands={'d','d','d'};
        spacecraft.executeCommands(commands);
        // Print the final position and direction
        System.out.println("Final Position: " + spacecraft.getPositionAndDirection());
        }




}
