package FYP;
import java.util.*;

public class Bus{
    String busNum;
    ArrayList<String> passStops = new ArrayList<String>();
    ArrayList<Integer> interval = new ArrayList<Integer>();//use data analysis to modify this
    boolean[] validDate = new boolean[7];
    String startTime, endTime;
    ArrayList<String> timePoint = new ArrayList<String>();
    public Bus(String line){
        busNum = line;
        switch (line){//initiliaze bus info
            case "1A":
                break;
            case "Campus Circuit East":
                break;
            case "1B":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "Shaw College":
                break;
            case "6A":
                break;
            case "6B":
                break;
            case "7":
                break;
            case "8":
                break;
            case "N":
                break;
            case "H":
                break;
    }
}