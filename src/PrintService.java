public class PrintService {
    public void print(Griffindor[] griffindors) {
        System.out.println("Ученики факультета Гриффиндор: " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println(" Имя:" + griffindor.getName() +
                    "; Фамилия: " + griffindor.getSurname() +
                    "; Сила магии: " + griffindor.getPowerOfMagic() +
                    "; Расстояние трансгресии: " + griffindor.getDistanceTransgression() +
                    "; Благородство: " + griffindor.getNobility() +
                    "; Честь: " + griffindor.getHonor() +
                    "; Храбрость: " + griffindor.getBravery() + ".");
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Ученики факультета Пуффендуй: " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(" Имя:" + hufflepuff.getName() +
                    "; Фамилия: " + hufflepuff.getSurname() +
                    "; Сила магии: " + hufflepuff.getPowerOfMagic() +
                    "; Расстояние трансгресии: " + hufflepuff.getDistanceTransgression() +
                    "; Трудолюбие: " + hufflepuff.getHardworking() +
                    "; Верность: " + hufflepuff.getLoyalty() +
                    "; Честность: " + hufflepuff.getHonesty() + ".");

        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Ученики факультета Когтевран: " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(" Имя:" + ravenclaw.getName() +
                    "; Фамилия: " + ravenclaw.getSurname() +
                    "; Сила магии: " + ravenclaw.getPowerOfMagic() +
                    "; Расстояние трансгресии: " + ravenclaw.getDistanceTransgression() +
                    "; Ум: " + ravenclaw.getSmart() +
                    "; Мудрость: " + ravenclaw.getWise() +
                    "; Остроумие: " + ravenclaw.getWitty()+
                    "; Творчество: " + ravenclaw.getCreative() + ".");
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Ученики факультета Слизерин: " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(" Имя:" + slytherin.getName() +
                    "; Фамилия: " + slytherin.getSurname() +
                    "; Сила магии: " + slytherin.getPowerOfMagic() +
                    "; Расстояние трансгресии: " + slytherin.getDistanceTransgression() +
                    "; Хитрость: " + slytherin.getCunning() +
                    "; Решительность: " + slytherin.getDetermined() +
                    "; Амбициозность: " + slytherin.getAmbitious()+
                    "; Находчивость: " + slytherin.getResourceful()+
                    "; Жажда власти: " + slytherin.getThirstForPower() + ".");
        }

        System.out.println();
    }


}

