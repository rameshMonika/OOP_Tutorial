public class Anna {
    int annaPoint, annaMove;

    public Anna() {
        this.annaPoint = 0;
        this.annaMove = -1;
    }

    void SetPoint() {
        this.annaPoint += 1;
    }

    public int getPoint() {
        return this.annaPoint;
    }

    void setRock() {
        this.annaMove = 0;
    }

    void setPaper() {
        this.annaMove = 1;
    }

    void setScissors() {
        this.annaMove = 2;
    }

    public int getMove() {
        return this.annaMove;
    }
}
