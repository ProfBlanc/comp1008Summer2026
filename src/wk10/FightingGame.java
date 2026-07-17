package wk10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FightingGame {

    static void main() {
        new FightingGame().fight();
        IO.println("*".repeat(20));
        simulate(100);
    }

    private Fighter[] fighters;
    private final Random random = new Random();

    private final int FIGHTER_MIN_HEALTH = 50;
    private final int FIGHTER_MAX_HEALTH = 100;

    private final int BOSS_MIN_HEALTH = 20;
    private final int BOSS_MAX_HEALTH = 33;

    private final int BOS_MIN_MULTIPLIER = 15;
    private final int BOS_MAX_MULTIPLIER = 30;

    private final int MIN_POWER = 10;
    private final int MAX_POWER = 20;


    public FightingGame(){

        fighters = new Fighter[]{ generateFighter("Fighter"), generateBoss("Boss")};
    }
    public FightingGame(String fighterName, String bossName){

        fighters = new Fighter[]{ generateFighter(fighterName), generateBoss(bossName)};
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
    private void restartFight(){
        Fighter pastFighter = fighters[0];
        Fighter pastBoss = fighters[1];
        fighters[0] = generateFighter(pastFighter.getName());
        fighters[1] = generateBoss(pastBoss.getName());
    }
    public Fighter fight(){
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

        return fighters[attacker];

    }
    public Fighter generateFighter(String name){
        return new Fighter(name, random.nextInt(FIGHTER_MIN_HEALTH, FIGHTER_MAX_HEALTH), random.nextInt(MIN_POWER, MAX_POWER));
    }
    public Boss generateBoss(String name){
        return new Boss(name, random.nextInt(BOSS_MIN_HEALTH, BOSS_MAX_HEALTH), random.nextInt(MIN_POWER, MAX_POWER), Math.round(random.nextInt(BOS_MIN_MULTIPLIER, BOS_MAX_MULTIPLIER) / 10.0));
    }
    public static void simulate(int num_times){
        FightingGame game = new FightingGame();
        HashMap<String, Integer> winCharts = new HashMap<>();

        winCharts.put(game.fighters[0].getName(), 0);
        winCharts.put(game.fighters[1].getName(), 0);

        for(int i = 1; i < num_times + 1; i++){
            IO.println("Fight " + i + " of " + num_times);
            IO.println("*".repeat(20));
            Fighter winner = game.fight();
            winCharts.put(winner.getName(), winCharts.get(winner.getName()) + 1);
            game.restartFight();
            IO.println();
            IO.println("*".repeat(20));
        }

        IO.println("Tally");
        double fighterWinPercent = Math.round((winCharts.get(game.fighters[0].getName()) / (num_times * 1.0)) * 100);
        double bossWinPercent = Math.round((winCharts.get(game.fighters[1].getName()) / (num_times * 1.0)) * 100);
        IO.println(game.fighters[0].getName() + " has won " + winCharts.get(game.fighters[0].getName()) + " times out of " + num_times + " times. ("+fighterWinPercent + "%)");
        IO.println(game.fighters[1].getName() + " has won " + winCharts.get(game.fighters[1].getName()) + " times out of " + num_times + " times. ("+bossWinPercent + "%)");

    }
    public Fighter[] getFighters(){
        return fighters;
    }
    public boolean playersAreAlive(){
        return fighters[0].isAlive() && fighters[1].isAlive();
    }
}
