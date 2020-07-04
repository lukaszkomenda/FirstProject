package Dog;

public class Dog {
    public String rasa;
    public String plec;
    public byte wiek;

    public Dog() {
        this.rasa = rasa;
        this.plec = plec;
        this.wiek = 0;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public byte getWiek() {
        return wiek;
    }

    public void setWiek(byte wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "rasa='" + rasa + '\'' +
                ", plec='" + plec + '\'' +
                ", wiek=" + wiek;
    }

    public String dzwiek (String woof){
        woof = "Woof";
        return woof;
    }
}
