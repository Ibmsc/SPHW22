//умеют колдовать с мощностью в сколько-то баллов
//могут трансгрессировать на какое-то расстояние
//
public class Hogwarts {

    private String name;

    private String Surname;
    int powerOfMagic;
    int distanceTransgression;

    public void Hogwarts(int powerOfMagic, int distanceTransgression) {
        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;

    }
    public void camparePower( Hogwarts studentFirst) {
        if (studentFirst == null ) {
        System.out.println("Вы не передали студента" );
        return;
    }
        int powerStudentOne = studentFirst.getPowerOfMagic() + studentFirst.getDistanceTransgression();
        int powerStudentSecond = this.getPowerOfMagic() + this.getDistanceTransgression();
        if (powerStudentOne < powerStudentSecond) {
            System.out.println(" Победил студент 1 ");
        } else if (powerStudentOne > powerStudentSecond){
            System.out.println( " Победил студент 2 ");
        }else {
            System.out.println(" Победила дружба! ");
        }
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
}
