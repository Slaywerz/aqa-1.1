package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnBoundary(){
        int actual =service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnHalfBoundary(){
        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn100(){
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999(){
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn920(){
        int actual = service.remain(80);
        int expected = 920;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn(){
        int actual = service.remain(80);
        int expected = 920;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0(){
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}



