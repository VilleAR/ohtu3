
package ohtu;

public class Player {
    private String name;
    private String nationality;
    private int goals;
    private int assists;

    public void setNationality(String nationality) {
        this.nationality=nationality;
    }
    public String getNationality() {
        return nationality;
    }
    public int getPoints() {
        return this.goals+this.assists;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
       
        
    }
      
}
