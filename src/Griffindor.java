//Гриффиндор
//благородство(nobility), честь(honor) и храбрость(bravery)
//Гарри Поттер, Гермиона Грейнджер и Рон Уизли
public class Griffindor extends Hogwarts {


    private String name;
    private String Surname;
    private int nobility;
    private int honor;
    private int bravery;
    private int powerOfMagic;
    private int distanceTransgression;

    public Griffindor(String name, String surname, int powerOfMagic, int distanceTransgression,
                      int nobility,int honor,int bravery)
    {
        super( powerOfMagic, distanceTransgression);
        this.name = name;
        this.Surname = surname;
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public void campare( Griffindor studentFirst) {
        if (studentFirst == null) {
            System.out.println("Вы не передали студента");
            return;
        }

        int powerStudentOne = studentFirst.getBravery() + studentFirst.getHonor()+studentFirst.getNobility();
        int powerStudentSecond = this.getBravery() + this.getHonor()+this.getNobility();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName()+" "+ studentFirst.getSurname() + " лучший Гриффиндорец, чем " +
                    this.getName()+" "+ this.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(this.getName()+" "+ this.getSurname() + " лучший Гриффиндорец, чем "
                    + studentFirst.getName()+" "+ studentFirst.getSurname());
        }else {
            System.out.println(" Победила дружба! ");
        }
    }

    @Override
    public String toString() {
        return "Я,"+getName()+" "+getSurname()+"- ученик Гриффиндора!" +
                " У меня благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                ", сила магии = " + this.getPowerOfMagic() +
                ", расстояние трансгресии = " + this.getDistanceTransgression();
    }


    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setName(String name) {
        this.name = name;
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
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}