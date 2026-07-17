package wk10;

import java.util.Random;

public class FightingGame {

    static void main() {
        new FightingGame().fight();
    }

    private Fighter[] fighters;
    private Random random = new Random();

    public FightingGame(){

        fighters = new Fighter[]{
                new Fighter("Batman", random.nextInt(20, 100), random.nextInt(10, 20))
                ,
                new Boss("Superman", random.nextInt(20, 33), random.nextInt(10, 20), random.nextInt(15, 30) / 10.0)
        };


    }
    public FightingGame(Fighter fighter, Boss boss){
        fighters = new Fighter[]{fighter, boss};
    }
    public FightingGame(String fighterName, double fighterHealth, double fighterStrength,
                        String bossName, double bossHealth, double bossStrength, double bossMultiplier){

        fighters = new Fighter[]{
                new Fighter(fighterName, fighterHealth, fighterStrength),
                new Boss(bossName, bossHealth, bossStrength, bossMultiplier)
        };
    }
    public void fight(){
        int attacker = -1;
        int gettingAttacked = -1;

        IO.println(fighters[0]);
        IO.println(fighters[1]);

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
