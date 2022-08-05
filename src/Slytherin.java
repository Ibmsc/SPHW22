//Слизерин
// хитрый(cunning), решительный(determined), амбициозный(ambitious), находчивый(resourceful) и
// жажда власти( thirst for power).
//Драко Малфой, Грэхэм Монтегю, Грегори Гойл
public class Slytherin extends Hogwarts {
    private String name;
    private String Surname;
    private int cunning;
    private int determined;
    private int ambitious;
    private int resourceful;
    private int thirstForPower;

    public Slytherin(String name, String surname,int cunning,int determined,int ambitious,int resourceful,int thirstForPower)
    {

        this.name = name;
        this.Surname = surname;
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.thirstForPower = thirstForPower;
    }
    public void campare( Slytherin studentFirst) {
        if (studentFirst == null) {
            System.out.println("Вы не передали студента");
            return;
        }
        int powerStudentOne = studentFirst.getCunning() + studentFirst.getDetermined()+studentFirst.getAmbitious()+
                studentFirst.getResourceful()+studentFirst.getThirstForPower();
        int powerStudentSecond = this.getCunning() + this.getDetermined()+this.getAmbitious()+
                this.getResourceful()+this.getThirstForPower();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName()+" "+ studentFirst.getSurname() + " лучший Слизеринец, чем " +
                    this.getName()+" "+ this.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(this.getName()+" "+ this.getSurname() + " лучший Слизеринец, чем "
                    + studentFirst.getName()+" "+ studentFirst.getSurname());
        }else {
            System.out.println(" Победила дружба! ");
        }
    }

    @Override
    public String toString() {
        return "Я,"+getName()+" "+getSurname()+" - ученик Слизерина!" +
                " У меня хитрость = " + cunning +
                ", решительность = " + determined +
                ", амбициозность = " + ambitious +
                ", находчивость = " + resourceful +
                ", жажда власти = " + thirstForPower +
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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public void setDetermined(int determined) {
        this.determined = determined;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
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
