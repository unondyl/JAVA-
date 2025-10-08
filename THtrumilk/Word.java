package THtrumilk;

import java.util.Map;

public class Word {
    private String vi, en;
    int id;
    public Word(){};
    public Word(int id,String en, String vi){
        this.vi=vi;
        this.en=en;
        this.id =id;
    }

    public String getVi() {
        return vi;
    }

    public String getEn() {
        return en;
    }

    public int getId() {
        return id;
    }
    //

    public void setVi(String vi) {
        this.vi = vi;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public void setId(int id) {
        this.id = id;
    }
}
