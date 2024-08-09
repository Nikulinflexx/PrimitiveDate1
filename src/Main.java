public class Main {
    public static void main(String[] args) {
        int carriage = 122221; //стоимость авиабилета
        int bonus; //колл-во бонусов
        bonus = carriage / 20;
        System.out.println("колл-во начисленных миль при авиаперелете = "
                + bonus + " миль при стоимости билета " + carriage + " рубл(я)-(ей)");
    }
}