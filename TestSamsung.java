
package ss.view;

import ss.model.Note;
import ss.model.GalaxyS;

public class TestSamsung {
    public static void main(String[] args) {
        GalaxyS s1 = new GalaxyS(0,123,"S7",15000);
        System.out.println(s1);
        
        Note s2 = new Note(3000,456,"Note8",30000);
        System.out.println(s2);
    }
}
