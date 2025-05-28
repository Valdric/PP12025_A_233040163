package pertemuan11;

public class Vertex {
    private char label;
    private boolean wasVisited;

    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }

    // Getter untuk label
    public char getLabel() {
        return label;
    }

    // Setter untuk label
    public void setLabel(char label) {
        this.label = label;
    }

    // Getter untuk wasVisited
    public boolean isWasVisited() {
        return wasVisited;
    }

    // Setter untuk wasVisited
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
