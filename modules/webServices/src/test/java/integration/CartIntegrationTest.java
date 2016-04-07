package integration;

import arquillian.AbstractTCFTest;
import fr.unice.polytech.isa.tcf.CartModifier;
import fr.unice.polytech.isa.tcf.CustomerFinder;
import fr.unice.polytech.isa.tcf.CustomerRegistration;
import fr.unice.polytech.isa.tcf.Payment;
import fr.unice.polytech.isa.tcf.Tracker;
import fr.unice.polytech.isa.tcf.entities.Cookies;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Item;
import fr.unice.polytech.isa.tcf.entities.Order;
import fr.unice.polytech.isa.tcf.entities.OrderStatus;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.webservice.CartWebService;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import java.util.ArrayList;


import static org.junit.Assert.assertTrue;

@RunWith(Arquillian.class)
public class CartIntegrationTest extends AbstractTCFTest {

    
    @EJB private CustomerRegistration registration;
    @EJB private CartModifier cart;
    @EJB private Tracker tracker;
    @EJB private CustomerFinder finder;

    private ArrayList<Item> items;

    @Before
    public void setUpContext() throws Exception {
        memory.flush();
        registration.register("pat", "1234-896983");
        registration.register("rob", "4321-896983");
        items = new ArrayList<Item>();
        items.add(new Item(Cookies.CHOCOLALALA, 3));
        items.add(new Item(Cookies.DARK_TEMPTATION, 2));
    }

    @Test
    public void integrationBetweenCustomersAndKitchen() throws Exception {
        Customer pat = finder.findByName("pat").get();
        Customer rob = finder.findByName("rob").get();
        
        for(Item i : items){
            cart.add(pat, i);
            cart.add(rob, i);
        }
        
        assertTrue(memory.getCarts().get(pat).size() == items.size());
        assertTrue(memory.getCarts().get(rob).size() == items.size());

        cart.validate(pat);
        cart.validate(rob);
        
        assertTrue(pat.getOrders().size() == 1);
        assertTrue(rob.getOrders().size() == 1);
        
        // Ici, on a un "p" dans le nom du client donc on a status IN_PROGRESS
        Order orderJ = pat.getOrders().iterator().next();
        
        //Verification du status avec la DataBase
        assertTrue(orderJ.equals(memory.getOrders().get(orderJ.getId())));
        assertTrue(memory.getOrders().get(orderJ.getId()).getStatus().equals(OrderStatus.IN_PROGRESS));
        
        //Verification du status avec la kitchen
        assertTrue(tracker.status(orderJ.getId()).equals(OrderStatus.IN_PROGRESS));
        
        // Ici, on a un "r" dans le nom du client donc on a status READY
        Order orderB = rob.getOrders().iterator().next();
        
        //Verification du status avec la DataBase
        assertTrue(orderB.equals(memory.getOrders().get(orderB.getId())));  
        assertTrue(memory.getOrders().get(orderB.getId()).getStatus().equals(OrderStatus.READY));
        
        //Verification du status avec la kitchen
        assertTrue(tracker.status(orderB.getId()).equals(OrderStatus.READY));

    }


}