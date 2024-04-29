package br.ce.wcaquino.taskbackend.utils;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDatasFuturas(){

        LocalDate ld = LocalDate.of(2040, 01,01);
        boolean SN = DateUtils.isEqualOrFutureDate(ld);
        Assert.assertTrue(SN);
    }

    @Test
    public void deveRetornarFalseParaDatasPassadas(){

        LocalDate ld = LocalDate.of(2010, 01,01);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(ld));
    }

    @Test
    public void deveRetornarTrueParaDataAtual(){
        LocalDate date = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

}
