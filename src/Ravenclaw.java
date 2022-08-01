//Когтевран
// умный(smart), мудрый(wise), остроумный(witty) и творческий(creative)
//Чжоу Чанг, Падма Патил и Маркус Белби.
public class Ravenclaw extends Hogwarts{

    private int smart;
    private int wise;
    private int witty;
    private int creative;
    public Ravenclaw(String name, String surname, int powerOfMagic, int distanceTransgression,
                     int smart,int wise,int witty,int creative)
    {
        super(name, surname, powerOfMagic, distanceTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    @Override
    public String toString() {
        return "Я,"+getName()+" "+getSurname()+"- ученик Когтеврана!" +
                " У меня ум = " +smart +
                ", мудрость = " + wise +
                ", остроумие = " + witty +
                ", творчество = " + creative +
                ", сила магии = " + this.getPowerOfMagic() +
                ", расстояние трансгресии = " + this.getDistanceTransgression();
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
