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
public class BuddyList {
    ArrayList<String> PreferenceList; //Ranked list of preferred movies from 1st rank to n rank
    ArrayList<PeerList> PeerList;//list of peer buddies

    public ArrayList<String> getPreferenceList() {
        return PreferenceList;
    }

    public void setPreferenceList(ArrayList<String> PreferenceList) {
        this.PreferenceList = PreferenceList;
    }

    public ArrayList<PeerList> getPeerList() {
        return PeerList;
    }

    public void setPeerList(ArrayList<PeerList> PeerList) {
        this.PeerList = PeerList;
    }
}
