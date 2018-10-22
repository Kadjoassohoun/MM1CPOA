package fr.eliseeassohoun.miage.rps.model;

public class RockPaperScissors {

    Result play(RPSEnum p1, RPSEnum p2)
    {
        if(p1 == p2) return Result.TIE;
        if((p1.equals(RPSEnum.ROCK)&&p2.equals(RPSEnum.SCISSORS)))
        {
            return Result.WIN;
        }
        else if((p1.equals(RPSEnum.PAPER)&&p2.equals(RPSEnum.ROCK)))
        {
            return Result.WIN;
        }
        else if((p1.equals(RPSEnum.SCISSORS)&&p2.equals(RPSEnum.SCISSORS)))
        {
            return Result.WIN;
        }
        else
        {
            return Result.LOST;
        }
    }
}