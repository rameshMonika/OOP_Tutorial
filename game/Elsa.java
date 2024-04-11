public class Elsa {
    int elsaPoint, elsaMove;

    public Elsa() {
        this.elsaPoint = 0;
        this.elsaMove = -1;
    }

    void SetPoint() {
        this.elsaPoint += 1;
    }

    public int getPoint() {
        return this.elsaPoint;
    }

    void setRock() {
        this.elsaMove = 0;
    }

    void setPaper() {
        this.elsaMove = 1;
    }

    void setScissors() {
        this.elsaMove = 2;
    }

    public int getMove() {
        return this.elsaMove;
    }

}
