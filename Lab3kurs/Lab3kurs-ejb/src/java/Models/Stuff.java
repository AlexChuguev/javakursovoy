
package Models;

import java.sql.Date;

public class Stuff  {
    private int id;
    private String name;
    private int amount;
    
public Stuff (int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        
    }
  public Stuff () {      
    }
    ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
    }

    
}
