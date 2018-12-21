//---------------------------------------------------------------
//         Project
//         Bird.java
//         Does XXX
//---------------------------------------------------------------

public class Bird {

    static Object getBirds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String hiddenName;
    private String hiddenColor;
    private String hiddenSaying;

    public Bird(String name, String color, String saying) {
        setName(name);
        setColor(color);
        setSaying(saying);
    }

    public String getName() {
        return hiddenName;
    }

    public String getColor() {
        return hiddenColor;
    }

    public String getSaying() {
        return hiddenSaying;
    }

    private void setName(String name) {
        hiddenName = name;
    }

    private void setColor(String color) {
        hiddenColor = color;
    }

    private void setSaying(String saying) {
        hiddenSaying = saying;
    }

}
