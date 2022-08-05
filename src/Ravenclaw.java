//Когтевран
// умный(smart), мудрый(wise), остроумный(witty) и творческий(creative)
//Чжоу Чанг, Падма Патил и Маркус Белби.
public class Ravenclaw extends Hogwarts{

    private String name;
    private String Surname;
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname,int smart,int wise,int witty,int creative)
    {
        this.name = name;
        this.Surname = surname;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    public void campare( Ravenclaw studentFirst) {
        if (studentFirst == null) {
            System.out.println("Вы не передали студента");
            return;
        }
        int powerStudentOne = studentFirst.getSmart() + studentFirst.getWise()+studentFirst.getWitty()+
                studentFirst.getCreative();
        int powerStudentSecond = this.getSmart() + this.getWise()+this.getWitty()+
                this.getCreative();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName()+" "+ studentFirst.getSurname() + " лучший Когтевранец, чем " +
                    this.getName()+" "+ this.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(this.getName()+" "+ this.getSurname() + " лучший Когтевранец, чем "
                    + studentFirst.getName()+" "+ studentFirst.getSurname());
        }else {
            System.out.println(" Победила дружба! ");
        }
    }
    @Override
    public String toString() {
        return "Я,"+getName()+" "+getSurname()+" - ученик Когтеврана!" +
                " У меня ум = " +smart +
                ", мудрость = " + wise +
                ", остроумие = " + witty +
                ", творчество = " + creative +
                ", сила магии = " + this.getPowerOfMagic() +
                ", расстояние трансгресии = " + this.getDistanceTransgression();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
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
    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }
}
