package org.example.Modell;

public class Ruha {
    private String tulajdonos;
    private boolean  tiszta =false;

    public String getTulajdonos() {
        return tulajdonos;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    public Ruha(String tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    @Override
    public String toString() {
        return "Ruha{" +
                "tulajdonos='" + tulajdonos + '\'' +
                ", tiszta=" + tiszta +
                '}';
    }
}
