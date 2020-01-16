/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Comparator;

/**
 *
 * @author suhru
 */
public class birthday implements Comparable<birthday>,Comparator<birthday>{

    public String name;
    String datestring;
    public int dd,mm,yy;
    public birthday(String name,String datestring){
        this.name=name;
        this.datestring=datestring;
        String temp[]=datestring.split("[/]|[-]");
        this.dd=Integer.parseInt(temp[2]);
        this.mm=Integer.parseInt(temp[1]);
        this.yy=Integer.parseInt(temp[0]);
    }
    public int compareTo(birthday o) {
        if(this.dd==o.dd && this.mm==o.mm)
            return -1;
        else if(this.mm>o.mm){
            return 1;
        }
        else if(this.mm<o.mm)
            return -1;
        else{
            if(this.dd>o.dd)
                return 1;
            else{
                return -1;
            }
        }
    }
    public int compare(birthday o1, birthday o2) {
        if(o1.dd==o2.dd && o1.mm==o2.mm)
            return 0;
        else if(o1.mm>o2.mm){
            return -1;
        }
        else{
            if(o1.dd>o2.dd)
                return -1;
            else{
                return 1;
            }
        }
    }
    public String toString(){
        return this.name+"   "+this.dd+"-"+this.mm+"-"+this.yy+"\n";
    }
    public String date(){
        return this.dd+"-"+this.mm+"-"+this.yy;
    }
}
