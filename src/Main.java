public class Main {
        public static void main(String[] args) {

           Griffindor harry = new Griffindor("Гарри","Поттер",9,8, 7);
            harry.setPowerOfMagic(90);
            harry.setDistanceTransgression(80);

           Griffindor germiona = new Griffindor("Гермиона","Грейнджер",8,7, 8);
            germiona.setPowerOfMagic(80);
            germiona.setDistanceTransgression(78);
           Griffindor ron = new Griffindor("Рон","Уизли",7,7, 8);
            ron.setPowerOfMagic(75);
            ron.setDistanceTransgression(91);
           Hufflepuff zahariya = new Hufflepuff("Захария","Смит",7,
                   7,9);
            zahariya.setPowerOfMagic(71);
            zahariya.setDistanceTransgression(80);
           Hufflepuff sedrik = new Hufflepuff("Седрик","Диггори",
                   4,6,7);
            sedrik.setPowerOfMagic(66);
            sedrik.setDistanceTransgression(50);
           Hufflepuff jastin = new Hufflepuff("Джастин","Финч-Флетчли",
                   9,2,4);
            jastin.setPowerOfMagic(85);
            jastin.setDistanceTransgression(49);
           Ravenclaw  chang = new Ravenclaw("Чжоу","Чанг",
                   7,8,5,6);
            chang.setPowerOfMagic(75);
            chang.setDistanceTransgression(90);
           Ravenclaw  padma = new Ravenclaw("Падма","Патил",
                   8,6,5,9);
            padma.setPowerOfMagic(76);
            padma.setDistanceTransgression(88);
           Ravenclaw  markys = new Ravenclaw("Маркус","Белби",
                   7,5,8,4);
            markys.setPowerOfMagic(89);
            markys.setDistanceTransgression(89);
           Slytherin drako =  new Slytherin("Драко","Малфой",9,5,7,
                            8,10);
           drako.setPowerOfMagic(88);
           drako.setDistanceTransgression(79);
           Slytherin greham = new Slytherin("Грэхэм","Монтегю",7,8,9,
                            4,7);
            greham.setPowerOfMagic(33);
            greham.setDistanceTransgression(44);
           Slytherin gregory = new Slytherin("Грегори","Гойл",8,7,6,
                            2,5);
            gregory.setPowerOfMagic(50);
            gregory.setDistanceTransgression(90);

            System.out.println();
            System.out.println("harry = " + harry);
            System.out.println("sedrik = " + ron);
            harry.campare(ron);
            System.out.println();
            System.out.println("germiona = " + germiona);
            System.out.println("sedrik = " + sedrik);
            harry.camparePower(sedrik);
            System.out.println();
            harry.camparePower(drako);
            drako.camparePower(harry);
            chang.camparePower(harry);

        }
}