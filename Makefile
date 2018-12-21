JFLAGS = -g 
JC = javac
CLASSPATH = -cp
JVM = java
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(CLASSPATH) EnglishNumberToWords.jar *.java

CLASSES = \
	Birds.java \
	Bird.java \
	TenLittleEggs.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
