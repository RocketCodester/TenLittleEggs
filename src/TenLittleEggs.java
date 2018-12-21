//---------------------------------------------------------------
//         Project
//         TenLittleEggs.java
//         Instantiates a Birds Object of Bird Objects and runs the nethods to get the data for the rhyme
//         Runs with correct colors on git-bash by running java -jar TenLittleEggs.jar
//---------------------------------------------------------------

import englishnumbertowords.EnglishNumberToWords;

public class TenLittleEggs {

    /**
     * @param args the command line arguments
     */
    static String[] firstverses = {" in a world so fine ...",
        ", one couldn't wait ...",
        ", round gifts of heaven ...",
        ", one full of kicks ...",
        ", each one alive ...",
        ", not too many more ...",
        ", quiet as can be ...",
        ", waiting just for you ...",
        ", wondering how it's done ...",
        "1 reamaining egg beneath an evening sky ..."
    };
    static String[] colors = {"red", "yellow", "green", "purple", "blue", "orange", "pink", "white", "brown", "black"};

    static String[] birdsaying = {"Hi!", "Hi!", "Hi!", "Hello!", "What's up!", "Buenos dias!", "Hi, there!", "Hi!", "Ciao!", "Wow!"

    };

    public static final String ANSI_RESET = "\u001B[0;1m";
    public static final String ANSI_BR_RED_16 = "\u001B[31;1m";
    public static final String ANSI_BR_YELLOW_16 = "\u001B[33;1m";
    public static final String ANSI_BR_GREEN_16 = "\u001B[32;1m";
    public static final String ANSI_BR_PURPLE_16 = "\u001B[35m";
    public static final String ANSI_BR_BLUE_16 = "\u001B[34;1m";
    public static final String ANSI_BR_ORANGE_16 = "\u001B[31;1m";
    public static final String ANSI_BR_PINK_16 = "\u001B[35;1m";
    public static final String ANSI_WHITE_16 = "\u001B[37m";
    public static final String ANSI_BROWN_256 = "\u001B[38;5;130m";
    public static final String ANSI_BR_BLACK_16 = "\u001B[30;1m";

    public static final String ANSI_RED_256 = "\u001B[38;5;9m";
    public static final String ANSI_YELLOW_256 = "\u001B[38;5;11m";
    public static final String ANSI_GREEN_256 = "\u001B[38;5;2m";
    public static final String ANSI_PURPLE_256 = "\u001B[38;5;5m";
    public static final String ANSI_BLUE_256 = "\u001B[38;5;12m";
    public static final String ANSI_ORANGE_256 = "\u001B[38;5;214m";
    public static final String ANSI_PINK_256 = "\u001B[38;5;13m";
    public static final String ANSI_WHITE_256 = "\u001B[38;5;15m";
    public static final String ANSI_BLACK_256 = "\u001B[38;5;0m";
    public static final String BOLD = "\u001B[1m";
    public static final String UNBOLD = "\u001B[0m";
    
    public static final String BG_GREEN_256 = "\u001B[48;5;10m";
    static String[] uColors = {ANSI_RED_256, ANSI_YELLOW_256, ANSI_GREEN_256, ANSI_PURPLE_256, ANSI_BLUE_256, ANSI_ORANGE_256, ANSI_PINK_256, ANSI_WHITE_256, ANSI_BROWN_256, ANSI_BR_BLACK_16};

    public static void main(String[] args) {
        //printTextColors();
        // <editor-fold defaultstate="collapsed" desc="Deprecated "This text is color"">
        /*System.out.println(ANSI_BR_RED_16 + "This text is red!");
        System.out.println(ANSI_BR_YELLOW_16 + "This text is yellow!");
        System.out.println(ANSI_BR_GREEN_16 + "This text is green!");
            System.out.println(ANSI_BR_PURPLE_16 + "This text is purple!");
        System.out.println(ANSI_BR_BLUE_16 + "This text is blue!");
        System.out.println(ANSI_BR_ORANGE_16 + "This text is orange!");
        System.out.println(ANSI_BR_PINK_16 + "This text is pink!");
        System.out.println(ANSI_WHITE_16 + "This text is white!");
        System.out.println(ANSI_BROWN_256 + "This text is brown!");
        System.out.println(ANSI_BR_BLACK_16 + "This text is black!" + ANSI_RESET);*/
        // </editor-fold>
        //printBackgroundColors();  
        // <editor-fold defaultstate="collapsed" desc=""This text is color"">
        /*System.out.println(uColors[0] + "This text is red!");
        System.out.println(uColors[1] + "This text is yellow!");
        System.out.println(uColors[2] + "This text is green!");
        System.out.println(uColors[3] + "This text is purple!");
        System.out.println(uColors[4] + "This text is blue!");
        System.out.println(uColors[5] + "This text is orange!");
        System.out.println(uColors[6] + "This text is pink!");
        System.out.println(uColors[7] + "This text is white!");
        System.out.println(uColors[8] + "This text is brown!");
        System.out.println(uColors[9] + "This text is black!" + ANSI_RESET);*/
        // </editor-fold>
                                                    // <editor-fold defaultstate="collapsed" desc=""Instantiation"">
        /*for (int i = 10; i > 0; i--) {
            if (i > 1) {
                String numword = EnglishNumberToWords.convert(i - 1); //numword.substring(0, 1).toUpperCase()
                System.out.println(i + " little eggs" + firstverses[10 - i]);

                System.out.println("One became a " + colors[10 - i] + " bird, and then there were " + numword + ".");
            } else {
                System.out.println("1 remaining egg beneath an evening sky ...\n"
                        + "A " + colors[10 - i] + " bird with nine friends calling, cooing, \"Hi!\"\n"
                        + colors.length + " feathered friends, each made a nest.\n"
                        + "Each laid eggs, and you know the rest!");
            }
        }*/
        /*Bird redBird = new Bird("Red", "red", "Hi!");
        Bird yellowBird = new Bird("Yellow", "yellow", "Hi!");
        Bird greenBird = new Bird("Green", "green", "Hi!");
        Bird purpleBird = new Bird("Purple", "purple", "Hello!");
        Bird blueBird = new Bird("Blue", "blue", "What's up!");
        Bird orangeBird = new Bird("Orange", "orange", "Buenos dias!");
        Bird pinkBird = new Bird("Pink", "pink", "Hi, there!");
        Bird whiteBird = new Bird("White", "white", "Hi!");
        Bird brownBird = new Bird("Brown", "brown", "Ciao!");
        Bird blackBird = new Bird("Black", "black", "Wow!");
        
        Bird birds[] = {redBird, yellowBird, greenBird, purpleBird, blueBird, orangeBird, pinkBird, whiteBird, brownBird, blackBird};
        // </editor-fold>
        Birds b = new Birds(redBird, yellowBird, greenBird, purpleBird, blueBird, orangeBird, pinkBird, whiteBird, brownBird, blackBird);*/ 
        Birds a = new Birds(null, null, null, null, null, null, null, null, null, null);
        a.getBirds()[0] = new Bird("Red", "red", "Hi!");
        a.getBirds()[1] = new Bird("Yellow", "yellow", "Hi!");
        a.getBirds()[2] = new Bird("Green", "green", "Hi!");
        a.getBirds()[3] = new Bird("Purple", "purple", "Hello!");
        a.getBirds()[4] = new Bird("Blue", "blue", "What's up!");
        a.getBirds()[5] = new Bird("Orange", "orange", "Buenos dias!");
        a.getBirds()[6] = new Bird("Pink", "pink", "Hi, there!");
        a.getBirds()[7] = new Bird("White", "white", "Hi!");
        a.getBirds()[8] = new Bird("Brown", "brown", "Ciao!");
        a.getBirds()[9] = new Bird("Black", "black", "Wow!");
        for (int i = 10; i > 0; i--) {
            if (i > 1) {
                String numword = EnglishNumberToWords.convert(i - 1); //numword.substring(0, 1).toUpperCase()
                System.out.println(ANSI_RESET+""+i + " little eggs" + firstverses[10 - i]);
                System.out.println("One became a " + uColors[10 - i] + BOLD + a.getBirds()[10 - i].getColor() + ANSI_RESET + " bird, and then there were " + numword + ".");
            } else {
                System.out.println("1 remaining egg beneath an evening sky ...\n"
                        + "A " + BOLD + uColors[10 - i] + a.getBirds()[10 - i].getColor() +ANSI_RESET + " bird with nine friends calling, cooing, \"Hi!\"\n"
                        + a.getBirds().length + " feathered friends, each made a nest.\n"
                        + "Each laid eggs, and you know the rest!");
            }
        }
    }

    public static void printTextColors() {
        String code;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Integer q = i * 16 + j;
                code = q.toString();
                System.out.print("\u001B[38;5;" + code + "m " + code + ANSI_RESET);
            }
            System.out.println();
        }
    }
    public static void printBackgroundColors() {
        String code;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Integer q = i * 16 + j;
                code = q.toString();
                System.out.print("\u001B[48;5;" + code + "m " + code + ANSI_RESET);
            }
            System.out.println();
        }
    }
}
