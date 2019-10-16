public class Environment {

    Bot[] bots;

    private int radius = 700;

    public Environment(int nbBots){
        bots = new Bot[nbBots];

        for(int i = 0; i < nbBots; i++){
            bots[i] = new Bot(this, i%2 + 1);
        }
    }

    public void push(Bot bot) {
        for(int i = 0; i < bots.length; i++){
            if(bots[i].getTeam() != bot.getTeam()){
                bots[i].getPushed(bot.getX(), bot.getY(), bot.getRange());
            }
        }
    }
}
