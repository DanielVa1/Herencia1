public class SchoolApp {
    public static void main(String[] args) {
        Student Student1 = new Student("Juan", "perez",
                "juanpi@gmail,com", "Conocido en iguala, Gro");


        Teacher teacher1 = new Teacher("Maria",
                "Morales", "maria@gmail.com", "Ruffo Figuero");

        teacher1.setBioCard(78945);
        teacher1.setAssignedHours(5);
        teacher1.setAbscription("division de estudios");

        System.out.println("El nombre del Student1 = " + Student1.getName() + " " + Student1.getLastName());
        System.out.println("El nombre del Teacher1 = " + teacher1.getName() + " " + teacher1.getLastName());

        Student1.setControlNumber(12356635);
        System.out.println("El numero de control de " + Student1.getName() + " es " + Student1.getControlNumber());

        //probando la sobrecarga de metodos
        System.out.println("metodo toString() de Student: " + Student1.toString());
        System.out.println("metodo toString () de Teacher :" +  teacher1.toString());

        System.out.println("" + Student1.soy());
        System.out.println("" + teacher1.soy());

    }
}
