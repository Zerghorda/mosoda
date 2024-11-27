package org.example.Modell;

import java.util.ArrayList;
import java.util.Collection;

public class Mosoda {
    private Ruha[]ruhak;
    private Integer db = 5;

    public Mosoda() {
      this.ruhak = new Ruha[5];
    }

    public Mosoda(Integer db) {
      this.ruhak = new Ruha[db];
    }

    public void bevesz(Ruha ruha){
        int i = 0;
        while(i < ruhak.length & ruhak[i] == null){
           ruhak[i] = ruha;
           i++;
        }
    }
    public Ruha kiad(Ruha ruha){
        int i = 0;
        while (i < ruhak.length & ruhak[i] == ruha){
            i++;
        }
        ruhak[i] = null;
    return ;
    }
    public void mos(){
    for (int i = 0;i < ruhak.length;i++){
        if (ruhak[i].isTiszta()==false) {
            ruhak[i].setTiszta(true);
        }
        else {
            
        }
    }
    }
}

