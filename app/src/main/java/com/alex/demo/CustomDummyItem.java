package com.alex.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marat on 23.02.15.
 */
public class CustomDummyItem {
    public static List<CustomDummyItem> ITEMS= new ArrayList<>();
    static {
       add("Item1 ","http://www.dentistatfalsecreek.com/wp-content/uploads/2015/01/Smile-Olympic-Village-Dentist.jpg");
       add("Item2 ","http://www.dentistatfalsecreek.com/wp-content/uploads/2015/01/Smile-Olympic-Village-Dentist.jpg");
       add("Item3 ","http://www.dentistatfalsecreek.com/wp-content/uploads/2015/01/Smile-Olympic-Village-Dentist.jpg");
       add("Item4 ","http://www.dentistatfalsecreek.com/wp-content/uploads/2015/01/Smile-Olympic-Village-Dentist.jpg");
    }

    private static void add(String s, String s1) {
        ITEMS.add(new CustomDummyItem(s,s1));
    }

    private  String text;
    private  String imageUrl;
    public CustomDummyItem(String text,String url){
        this.text=text;
        this.imageUrl=url;
    }
    public String getText(){
        return text;
    }
    public String getImageUrl(){
        return  imageUrl;
    }
}
