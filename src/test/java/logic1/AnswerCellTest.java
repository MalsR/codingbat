package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerCellTest {

    @Test
    public void shouldNotAnswerIfAsleep() {
        AnswerCell answerCell = new AnswerCell();

        assertFalse(answerCell.answerCell(false, false, true));
    }

    @Test
    public void shouldAnswerIfNotMorning() {
        AnswerCell answerCell = new AnswerCell();

        assertTrue(answerCell.answerCell(false, false, false));
    }

    @Test
    public void shouldNotAnswerIfMorning() {
        AnswerCell answerCell = new AnswerCell();

        assertFalse(answerCell.answerCell(true, false, false));
    }

    @Test
    public void shouldAnswerInMorningIfOnlyMum() {
        AnswerCell answerCell = new AnswerCell();

        assertTrue(answerCell.answerCell(true, true, false));
    }
}