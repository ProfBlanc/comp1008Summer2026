package wk10;

import java.util.Random;

public class FightingGame {

    static void main() {
        new FightingGame();
    }

    private Fighter[] fighters;
    private Random random = new Random();

    public FightingGame(){
        fighters = new Fighter[]{
                new Fighter("Batman", random.nextInt(50, 100), random.nextInt(10, 20))
                ,
                new Boss("Superman", random.nextInt(20, 33), random.nextInt(10, 20), random.nextInt(15, 30) / 10.0)
        };

        int attacker = -1;
        int gettingAttacked = -1;
        while(playersAreAlive()){
            attacker = random.nextInt(10) % 2;
            gettingAttacked = attacker == 0 ? 1 : 0;
            String result = fighters[attacker].attacks(fighters[gettingAttacked]);
            IO.println(result);
        }

        IO.println(fighters[attacker].getName() + " won the fight against " + fighters[gettingAttacked].getName());

    }

    public boolean playersAreAlive(){
        return fighters[0].isAlive() && fighters[1].isAlive();
    }
}
