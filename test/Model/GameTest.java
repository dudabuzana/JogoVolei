/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;

/**
 * Classe de Testes do Jogo
 * 
 * @author Maria Eduarda Buzana
 */
public class GameTest {
    
    private Game instance;
    
    public GameTest() {
        instance = new Game(new Team(), new Team(), "10:00");
    }
    
    @BeforeClass
    public static void setUpClass() { }
    
    @AfterClass
    public static void tearDownClass() { }

    @Test
    @DisplayName("Verifica se o Time 1 venceu o jogo") 
    public void testVerifyTeam1WonSetFalse() {
        System.out.println("Deve retornar false (25x24), pois o Time 1 atingiu 25 mas não possui 2 pontos de vantagem");
        int min = 25;
        instance.getTeam1().setScore(25);
        instance.getTeam2().setScore(24);
        
        boolean expResult = false;
        boolean result = instance.verifyTeam1WonSet(min);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Verifica e retorna se o Time 1 venceu o jogo") 
    public void testVerifyTeam1WonSetFalse2() {
        System.out.println("Deve retornar false (20x11), pois o Time 1 ainda não atingiu 25");
        int min = 25;
        instance.getTeam1().setScore(20);
        instance.getTeam2().setScore(11);
        
        boolean expResult = false;
        boolean result = instance.verifyTeam1WonSet(min);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Verifica e retorna se o Time 1 venceu o jogo") 
    public void testVerifyTeam1WonSetTrue() {
        System.out.println("Deve retornar true (25x21), pois o Time 1 atingiu 25 e possui mais de 2 pontos de vantagem");
        int min = 25;
        instance.getTeam1().setScore(25);
        instance.getTeam2().setScore(21);
        
        boolean expResult = true;
        boolean result = instance.verifyTeam1WonSet(min);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Verifica e retorna se o Time 2 venceu o jogo") 
    public void testVerifyTeam2WonSetFalse() {
        System.out.println("Deve retornar false (24x25), pois o Time 2 atingiu 25 mas não possui 2 pontos de vantagem");
        int min = 25;
        instance.getTeam1().setScore(24);
        instance.getTeam2().setScore(25);
        
        boolean expResult = false;
        boolean result = instance.verifyTeam2WonSet(min);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Verifica e retorna se o Time 2 venceu o jogo") 
    public void testVerifyTeam2WonSetFalse2() {
        System.out.println("Deve retornar false (18x20), pois o Time 2 ainda não atingiu 25");
        int min = 25;
        instance.getTeam1().setScore(18);
        instance.getTeam2().setScore(20);
        
        boolean expResult = false;
        boolean result = instance.verifyTeam2WonSet(min);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Verifica e retorna se o Time 2 venceu o jogo") 
    public void testVerifyTeam2WonSetTrue() {
        System.out.println("Deve retornar true (20x25), pois o Time 2 atingiu 25 e possui mais de 2 pontos de vantagem");
        int min = 25;
        instance.getTeam1().setScore(20);
        instance.getTeam2().setScore(25);
        
        boolean expResult = true;
        boolean result = instance.verifyTeam2WonSet(min);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Verifica e retorna se um dos times venceu o jogo") 
    public void testVerifyTeam1WonGame() {
        System.out.println("Deve retornar 1 que representa que o Time 1 ganhou o jogo");
        int expResult = 1;
        instance.getTeam1().setSetsWons(3);
        int result = instance.verifyTeamWonGame();
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Verifica e retorna se um dos times venceu o jogo") 
    public void testVerifyTeam2WonGame() {
        System.out.println("Deve retornar 2 que representa que o Time 2 ganhou o jogo");
        int expResult = 2;
        instance.getTeam2().setSetsWons(3);
        int result = instance.verifyTeamWonGame();
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Verifica e retorna se um dos times venceu o jogo") 
    public void testVerifyTeamWonGame() {
        System.out.println("Deve retornar 0 que representa que nenhum Time ganhou o jogo");
        int expResult = 0;
        instance.getTeam2().setSetsWons(2);
        instance.getTeam2().setSetsWons(1);
        int result = instance.verifyTeamWonGame();
        assertEquals(expResult, result);
    }
    
}
