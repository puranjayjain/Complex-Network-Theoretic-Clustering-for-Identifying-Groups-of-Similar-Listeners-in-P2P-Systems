/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.intelligence;

import java.util.ArrayList;

/**
 *
 * @author Puranjay
 */
public class Peer {

    int id;
    BuddyList buddylist;
    ArrayList<Integer> RandomCache; //peers which can be visited stated by their id

    ArrayList<Integer> TabooCache; //only used in buddycast and mbuddycast it contains the list of peers which are visited

    public Peer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BuddyList getBuddylist() {
        return buddylist;
    }

    public void setBuddylist(BuddyList buddylist) {
        this.buddylist = buddylist;
    }

    public ArrayList<Integer> getRandomCache() {
        return RandomCache;
    }

    public void setRandomCache(ArrayList<Integer> RandomCache) {
        this.RandomCache = RandomCache;
    }

    public ArrayList<Integer> getTabooCache() {
        return TabooCache;
    }

    public void setTabooCache(ArrayList<Integer> TabooCache) {
        this.TabooCache = TabooCache;
    }
}
