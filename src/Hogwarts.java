//умеют колдовать с мощностью в сколько-то баллов
//могут трансгрессировать на какое-то расстояние
//
public class Hogwarts {


    private int powerOfMagic;
    private int distanceTransgression;

    public Hogwarts( int powerOfMagic, int distanceTransgression) {

        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public void campare( Hogwarts studentFirst,  Hogwarts studentSecond) {
        int powerStudentOne = studentFirst.getPowerOfMagic() + studentFirst.getDistanceTransgression();
        int powerStudentSecond = studentSecond.getPowerOfMagic() + studentSecond.getDistanceTransgression();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(" обладает большей мощностью магии, чем " );
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println( " обладает большей мощностью магии, чем ");
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


}
