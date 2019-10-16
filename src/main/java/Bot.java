public class Bot {

    private int x;
    private int y;
    private int range = 100;

    private int team;

    Environment env;

    public Bot(Environment env, int team){
        this.env = env;
        this.team = team;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getTeam() {
        return team;
    }

    public int getRange() {
        return range;
    }

    public void push(){
        env.push(this);
    }

    public boolean isInRange(int x, int y, int range){
        return (this.x - x + this.y - y)
    }

    public void getPushed(int x, int y, int range) {

    }

    public void getAttract(){

    }
}
