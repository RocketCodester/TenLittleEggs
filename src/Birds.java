//---------------------------------------------------------------
//         Project
//         Birds.java
//         Does XXX
//---------------------------------------------------------------

public class Birds {

    private Bird[] hiddenBirds;

    public Birds(Bird... birds) {
        setBirds(birds);
    }

    public Bird[] getBirds() {
        return hiddenBirds;
    }

    private void setBirds(Bird... birds) {
        for (Bird i : birds) {
            hiddenBirds = birds;
        }
    }
}
