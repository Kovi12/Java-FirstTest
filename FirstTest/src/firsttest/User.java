/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author ovidi
 */
public class User {
    private String username;
    private String email;
    private Set<Challenge> challenges = new HashSet<>();

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    
    
    void addChallenge(Challenge c){
        challenges.add(c);
    }
    
    void ShowChallenges(){
        Iterator<Challenge> i = this.challenges.iterator();
        while(i.hasNext()){
            System.out.println(i.next().toString());
        }
    }
    private Set<String> PL = new HashSet<>();
    public List<String> getPL(){
        Iterator<Challenge> it = this.challenges.iterator();
        while(it.hasNext()){
            PL.add(it.next().getProgrammingLanguage());
        }
        List<String> PLlist = new ArrayList<String>(PL);
        return PLlist;
    } 
}
