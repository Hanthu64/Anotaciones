package ej5test;

import ej5.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UnitTest {

    @Test
    public void makingWebUser() {
        Web_User Carlos = new Web_User("carlos", "carlos1997", Web_User.UserState.NEW);
        assertEquals(Web_User.UserState.NEW, Carlos.getState());
    }
    @Test
    public void makingCustomer() {
        Customer Carlos = new Customer("E133", "C/España, Nº2", 612345678, "carlos@gmail.com");
        assertEquals("E133", Carlos.getId());
    }
    @Test
    public void makingAccount() {
        Account Carlos = new Account("E133","C/España, Nº2", false, new Date(), null);
        assertNull(Carlos.getClose());
    }

    @Test
    public void createProduct(){
        Product mortadela = new Product("P112", "Mortadela", "Elpozo");
        assertEquals("P112", mortadela.getId());
    }
    @Test
    public void createAnotherProduct(){
        Product desodorante = new Product("P231", "Desodorante", "Axe");
        assertEquals("P231", desodorante.getId());
    }

}
