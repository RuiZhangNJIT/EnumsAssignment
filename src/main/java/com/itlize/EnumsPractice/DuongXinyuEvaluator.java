package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {

    private String cur_name;
       public DuongXinyuEvaluator(String input)
       {
           cur_name="";
       }

       public boolean isDuong()
       {
           return cur_name=="Duong";
       }

       public boolean isXinyu()
       {
           return cur_name=="Xinyu";
       }

}
