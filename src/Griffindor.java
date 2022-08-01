//Гриффиндор
//благородство(nobility), честь(honor) и храбрость(bravery)
//Гарри Поттер, Гермиона Грейнджер и Рон Уизли
public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int powerOfMagic, int distanceTransgression,
                      int nobility,int honor,int bravery)
    {
        super(name, surname, powerOfMagic, distanceTransgression);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public void campare( Griffindor studentFirst,  Griffindor studentSecond) {
        int powerStudentOne = studentFirst.getBravery() + studentFirst.getHonor()+studentFirst.getNobility();
        int powerStudentSecond = studentSecond.getBravery() + studentSecond.getHonor()+studentSecond.getNobility();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName()+" "+ studentFirst.getSurname() + " лучший Гриффиндорец, чем " +
                    studentSecond.getName()+" "+ studentSecond.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(studentSecond.getName()+" "+ studentSecond.getSurname() + " лучший Гриффиндорец, чем "
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