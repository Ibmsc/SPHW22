//Слизерин
// хитрый(cunning), решительный(determined), амбициозный(ambitious), находчивый(resourceful) и
// жажда власти( thirst for power).
//Драко Малфой, Грэхэм Монтегю, Грегори Гойл
public class Slytherin extends Hogwarts {
    private int cunning;
    private int determined;
    private int ambitious;
    private int resourceful;
    private int thirstForPower;
    public Slytherin(String name, String surname, int powerOfMagic, int distanceTransgression,
                     int cunning,int determined,int ambitious,int resourceful,int thirstForPower)
    {
        super(name, surname, powerOfMagic, distanceTransgression);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.thirstForPower = thirstForPower;
    }
    @Override
    public String toString() {
        return "Я,"+getName()+" "+getSurname()+"- ученик Слизерина!" +
                " У меня хитрость = " + cunning +
                ", решительность = " + determined +
                ", амбициозность = " + ambitious +
                ", находчивость = " + resourceful +
                ", жажда власти = " + thirstForPower +
                ", сила магии = " + this.getPowerOfMagic() +
                ", расстояние трансгресии = " + this.getDistanceTransgression();
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
}
