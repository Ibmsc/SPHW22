//Пуффендуй
//трудолюбивый(hardworking), верность(loyalty), честность(honesty).
//Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
public class Hufflepuff extends Hogwarts {

    private int hardworking;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, String surname, int powerOfMagic, int distanceTransgression,
                      int hardworking,int loyalty,int honesty)
    {
        super(name, surname, powerOfMagic, distanceTransgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public void campare( Hufflepuff studentFirst,  Hufflepuff studentSecond) {
        int powerStudentOne = studentFirst.getHardworking() + studentFirst.getLoyalty()+studentFirst.getHonesty();
        int powerStudentSecond = studentSecond.getHardworking() + studentSecond.getHonesty()+studentSecond.getHardworking();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName()+" "+ studentFirst.getSurname() + " лучший Пуффендуец, чем " +
                    studentSecond.getName()+" "+ studentSecond.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(studentSecond.getName()+" "+ studentSecond.getSurname() + " лучший Пуффендуец, чем "
                    + studentFirst.getName()+" "+ studentFirst.getSurname());
        }else {
            System.out.println(" Победила дружба! ");
        }
    }
    @Override
    public String toString() {
        return "Я,"+getName()+" "+getSurname()+"- ученик Пуффендуя!" +
                " У меня трудолюбие = " + hardworking +
                ", верность = " + loyalty +
                ", честность = " + honesty +
                ", сила магии = " + this.getPowerOfMagic() +
                ", расстояние трансгресии = " + this.getDistanceTransgression();
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }


}
