package fr.eliseeassohoun.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {
    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() throws Exception{
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown()throws Exception {
        rps = null;
    }

    @Test
    public void testPlay()throws Exception {
        assertEquals(rps.play(RPSEnum.ROCK,RPSEnum.SCISSORS),Result.WIN);
    }

    @Test
    public void testPlay2()throws Exception {
        assertEquals(rps.play(RPSEnum.ROCK,RPSEnum.PAPER),Result.LOST);
    }


    @Parameters ({"paper","rock"})
    @Test
    public void testWinPlay(String p1, String p2)
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.WIN);
    }

    @Parameters({"paper","paper"})
    @Test
    void testTiePlay(String p1, String p2){

        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.TIE);
    }

    @Parameters
    @Test
    public void testLostPlay(String p1, String p2)
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.LOST);

    }
}