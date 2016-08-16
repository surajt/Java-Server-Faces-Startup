/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.model.Tea;
import java.util.TreeMap;

/**
 *
 * @author 985088
 */
public class TeaStore {
    
    public TeaStore(){
        
    }
    
     private final String[] colors =  {"white", "green", "black"}; 
      private final String[] menu = {"register"};
     public String[] getColors(){
        return colors;
    } 
    public String[] getMenu(){
        return menu;
    }
     
     private static TreeMap<String, Tea[]> teaMap = new TreeMap<>();
     static {
         teaMap.put("white", new Tea[]{ new Tea("red", "White Peony", "This particular white tea comes from the Fujian province of China. The tea is very rare...and thus rather expensive. This tea is harvested in the spring and is created from tiny leaves and buds.","1"), 
             new Tea("white", "White Silver Needles", "This white tea is considered a \"premium white tea.\" The leaves are picked on only a handful of specific days each year. The processing is done entirely by hand. The tea is quite rare...and thus quite expensive. The tea itself is created from new buds that are very tender and look like \"silvery needles,\" hence the name.","2"),
             new Tea("white", "White Darjeeling", "India is more known for its black teas, but it also produces one of the finest and most delicate white teas too. This tea when brewed has a beautiful golden color to it. The taste is slightly sweet with a very delicate aroma. Considered one of the finest white teas around.","3")});
         
         teaMap.put("green", new Tea[]{ new Tea("green", "Gunpowder", "his is one of the most popular types of chinese green teas. This tea is still primarily grown in the Zhejian Province of China, although plantations for this tea are spreading elsewhere in China. One of the characteristics of this tea is that, once processed, the tea looks like tiny pellets. These pellets open up during the brewing process.","4"), 
             new Tea("green", "Sencha", "Sencha is the \"everyday\" Japanese green tea. Types and qualities vary widely. Leaves of this tea are exposed directly to sunlight.","5"), 
             new Tea("green", "Matcha", "Matcha is a powdered green tea. The is manufactured in the Uji region of Japan. Tea is grown primarily in the shade. This tea is commonly used in the Japanese Tea Ceremony.","6"), 
             new Tea("green", "Kukicha ", "A tea made from white stalks produced by harvesting one bud and three leaves. A very unusual tea, with a taste of chestnut due to the twigs in the tea.","7")});
        
         
         teaMap.put("black", new Tea[]{ new Tea("black", "Keemun Tea", "A caffeine haters black tea...black tea made from this leaf have less than than black tea made from Assam leaves. The tea has a fruity aroma and can be more bitter than other black teas.","8"),
             new Tea("black", "Assam", "Assam is the most popular and most grown tea in India. Like Darjeeling, it has several \"flushes,\" or when the tea is harvested. The first flush is harvested over the course of ten week beginning in March. The second flush is picked in June, with production taking place over the summer and early fall.","9"), 
             new Tea("black", "Yunnan Tea (Dian Hong)", "A very popular black tea in China that is grown in the Yunnan province. It has several varities, including broken yunnan, yunnan gold and yunnan pure gold. High grades of this tea are less bitter than most other black teas and have a rather sweet aroma (for a black tea).","10")});
   
     };
     
    public Tea[] getTeaByColor(String colorType) {
        return teaMap.get(colorType);
    }
     
    
}
