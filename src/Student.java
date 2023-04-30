public class Student extends Person{
    private int ControlNumber;
    private String carrer;
    private double generalAverage;

    public Student() {
    }

    public Student(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public Student(String name, String lastName, String email, String address,
                   int controlNumber, String carrer, double generalAverage) {
        super(name, lastName, email, address);
        ControlNumber = controlNumber;
        this.carrer = carrer;
        this.generalAverage = generalAverage;
    }

    public int getControlNumber() {
        return ControlNumber;
    }

    public void setControlNumber(int controlNumber) {
        ControlNumber = controlNumber;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public double getGeneralAverage() {
        return generalAverage;
    }

    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }
    // se sobrecarga un metodo que ya existe
    public String toString() {
        String texto = "el alumno " + getName() + " " + getLastName() +
                "\n con el numero de control " + getControlNumber() +
                "\n correo electronico " + getEmail();

        return texto;
    }
    public String soy(){
        return "Soy una persona y estudiante" ;

    }
}
