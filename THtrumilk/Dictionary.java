package THtrumilk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dictionary {
    private ArrayList<Word> list;

    public Dictionary() {

        list = new ArrayList<>();
        list.add(new Word(1, "apple", "quả táo"));
        list.add(new Word(2, "banana", "quả chuối"));
        list.add(new Word(3, "cat", "con mèo"));
        list.add(new Word(4, "dog", "con chó"));
        list.add(new Word(5, "fish", "con cá"));
        list.add(new Word(6, "orange", "quả cam"));
        list.add(new Word(7, "car", "xe hơi"));
        list.add(new Word(8, "house", "ngôi nhà"));
        list.add(new Word(9, "book", "quyển sách"));
        list.add(new Word(10, "school", "trường học"));
        Collections.sort(list, Comparator.comparing(Word::getEn));
    }
    public Word binarySearch(String enS){
        System.out.println("3");
        int l=0,r= list.size()-1;
        while(l<r){
            int mid=(r+l)/2;
            System.out.println(mid);
            int bol = enS.compareToIgnoreCase(list.get(mid).getEn());
            System.out.println("s "+ bol);
            System.out.println("mid: "+list.get(mid).getEn());
            if(bol == 0) return list.get(mid);
            else if(bol<0) r=mid-1;
            else l=mid+1;
        }
        //System.out.println(3);
        return null;
    }
    public void add(Word w){
        list.add(w);
        Collections.sort(list,Comparator.comparing(Word::getEn));
    }
    public int length(){
        return list.size();
    }
}
