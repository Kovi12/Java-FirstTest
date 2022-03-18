/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firsttest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ovidi
 */
public class FirstTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Difficulty d = null;
        Challenge c1 = new Challenge("name1","a",d.Medium,"Java");
        Challenge c2 = new Challenge("name1","a",d.Medium,"Java");
        User u1 = new User("username1", "email1");
        u1.addChallenge(c1);
        u1.addChallenge(c2);
        u1.ShowChallenges();
        Map<User, List<String>> hm = new HashMap<User, List<String>>();
        hm.put(u1, u1.getPL());
    }
    
}
