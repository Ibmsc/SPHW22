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
    public void campare( Ravenclaw studentFirst,  Ravenclaw studentSecond) {
        int powerStudentOne = studentFirst.getSmart() + studentFirst.getWise()+studentFirst.getWitty()+
                studentFirst.getCreative();
        int powerStudentSecond = studentSecond.getSmart() + studentSecond.getWise()+studentSecond.getWitty()+
                studentSecond.getCreative();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName()+" "+ studentFirst.getSurname() + " лучший Когтевранец, чем " +
                    studentSecond.getName()+" "+ studentSecond.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(studentSecond.getName()+" "+ studentSecond.getSurname() + " лучший Когтевранец, чем "
                    + studentFirst.getName()+" "+ studentFirst.getSurname());
        }else {
            System.out.println(" Победила дружба! ");
        }
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
