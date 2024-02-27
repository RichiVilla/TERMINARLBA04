package co.edu.escuelaing.hangman;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HangmanApplicationTests {

	 private GameScore bonusScore = new BonusScore();

@Test
    void testBonusScore_CorrectCount3_IncorrectCount1_Returns25() {

        int score = bonusScore.calculateScore(3, 1);
        assertEquals(25, score);
    }

    @Test
    void testBonusScore_CorrectCount0_IncorrectCount0_Returns0() {
        int score = bonusScore.calculateScore(0, 0);
        assertEquals(0, score);
    }

    @Test
    void testBonusScore_CorrectCountNegative_IncorrectCountPositive_ThrowsException() {
        assertThrows(modelException.class, () -> {
            bonusScore.calculateScore(-1, 1);
        });
    }


}
