//умеют колдовать с мощностью в сколько-то баллов
//могут трансгрессировать на какое-то расстояние
//
public class Hogwarts {

    private String name;
    private String surname;
    private int powerOfMagic;
    private int distanceTransgression;

    public Hogwarts(String name, String surname, int powerOfMagic, int distanceTransgression) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public void campare( Hogwarts studentFirst,  Hogwarts studentSecond) {
        int powerStudentOne = studentFirst.getPowerOfMagic() + studentFirst.getDistanceTransgression();
        int powerStudentSecond = studentSecond.getPowerOfMagic() + studentSecond.getDistanceTransgression();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName() + studentFirst.getSurname() + " обладает большей мощностью магии, чем " +
                    studentSecond.getName() + studentSecond.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(studentSecond.getName() + studentSecond.getSurname() + "обладает большей мощностью магии, чем"
                    + studentFirst.getName() + studentFirst.getSurname());
        }else {
            System.out.println("Победила дружба!");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
