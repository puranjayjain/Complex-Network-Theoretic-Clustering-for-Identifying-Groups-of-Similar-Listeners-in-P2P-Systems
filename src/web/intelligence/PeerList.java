/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.intelligence;

/**
 *
 * @author Puranjay
 */
public class PeerList {

    public PeerList(int Address, int Similarity) {
        this.Address = Address;
        this.Similarity = Similarity;
    }
    int Address //address or id of peer
    ,Similarity; //As calculated from 2.2 (1)

    public int getAddress() {
        return Address;
    }

    public void setAddress(int Address) {
        this.Address = Address;
    }

    public int getSimilarity() {
        return Similarity;
    }

    public void setSimilarity(int Similarity) {
        this.Similarity = Similarity;
    }
}
