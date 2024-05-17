package co.com.tascon.decorator;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<String> logs = new ArrayList<>();

    public void add(String message){
        logs.add(message);
    }

    public List<String> obtener(){
        return logs;
    }

}
