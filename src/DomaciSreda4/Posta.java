package DomaciSreda4;

import java.util.ArrayList;

public class Posta {
    private ArrayList<Poruka> poruke;

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public Posta() {
        poruke = new ArrayList<>();
    }

    public ArrayList<Poruka> getPoruke(int index) {
        return poruke;
    }

    public void setPoruke(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public void add(Poruka p) {
        {
            for (Poruka el: poruke) {
                if (el.getId()==p.getId())
                    return;
            }
        }poruke.add(p);
    }


    public void remove(Poruka p) {
        for (int i = 0; i < poruke.size(); i++) {
            if (p.getId() == poruke.get(i).getId()) ;
            {
                poruke.remove(p);
            }

        }
    }

    public void send(Poruka p) {
        for (int i = 0; i < poruke.size(); i++) {
            if (p.getId() == poruke.get(i).getId()) ;
            {
                System.out.println(p.getPoruka());
                poruke.remove(p);
            }
        }

    }

    public void change(Poruka p, String msg) {
        p.setPoruka(msg);
    }

    public int isplata(Poruka p) {
        int suma=0;
        for (int i = 0; i < poruke.size(); i++) {
            if (p.getPoruka().equals(poruke.get(i).getPoruka())) {
                suma=p.getSuma();

            }

        }
        return suma;

    }

    @Override
    public String toString() {
        for (Poruka el : poruke) {
            el.posalji();
        }

        return "";
    }

}
