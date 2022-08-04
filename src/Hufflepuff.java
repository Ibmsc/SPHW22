//Пуффендуй
//трудолюбивый(hardworking), верность(loyalty), честность(honesty).
//Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
public class Hufflepuff extends Hogwarts {

    private String name;
    private String Surname;
    private int hardworking;
    private int loyalty;
    private int honesty;
    private int powerOfMagic;
    private int distanceTransgression;
    public Hufflepuff(String name, String surname, int powerOfMagic, int distanceTransgression,
                      int hardworking,int loyalty,int honesty)
    {
        super (powerOfMagic, distanceTransgression);
        this.name = name;
        this.Surname = surname;
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void campare( Hufflepuff studentFirst) {
        if (studentFirst == null) {
            System.out.println("Вы не передали студента");
            return;
        }
        int powerStudentOne = studentFirst.getHardworking() + studentFirst.getLoyalty()+studentFirst.getHonesty();
        int powerStudentSecond = this.getHardworking() + this.getHonesty()+this.getHardworking();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName()+" "+ studentFirst.getSurname() + " лучший Пуффендуец, чем " +
                    this.getName()+" "+ this.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(this.getName()+" "+ this.getSurname() + " лучший Пуффендуец, чем "
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
