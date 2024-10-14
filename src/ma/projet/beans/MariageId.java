/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author DELL
 */
@Embeddable
public class MariageId implements Serializable {
    private int hommeId;
    private int femmeId;

    public MariageId() {
    }

    public MariageId(int hommeId, int femmeId) {
        this.hommeId = hommeId;
        this.femmeId = femmeId;
    }

    public int getHommeId() {
        return hommeId;
    }

    public void setHommeId(int hommeId) {
        this.hommeId = hommeId;
    }

    public int getFemmeId() {
        return femmeId;
    }

    public void setFemmeId(int femmeId) {
        this.femmeId = femmeId;
    }

   
}