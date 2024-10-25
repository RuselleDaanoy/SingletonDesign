public class PagIbigQueuingDemo {
    public static void main(String[] args) {

        CentralizedQueuingSystem queueSystem = CentralizedQueuingSystem.getInstance();

        System.out.println("Help Desk Station 1 - Visitor 1 Queue Number: " + queueSystem.generateQueueNumber(1));
        System.out.println("Help Desk Station 1 - Visitor 2 Queue Number: " + queueSystem.generateQueueNumber(1));

        System.out.println("Help Desk Station 2 - Visitor 1 Queue Number: " + queueSystem.generateQueueNumber(2));
        System.out.println("Help Desk Station 2 - Visitor 2 Queue Number: " + queueSystem.generateQueueNumber(2));

        System.out.println("Help Desk Station 3 - Visitor 1 Queue Number: " + queueSystem.generateQueueNumber(3));
        System.out.println("Help Desk Station 3 - Visitor 2 Queue Number: " + queueSystem.generateQueueNumber(3));

        queueSystem.resetQueueNumber(5);
        System.out.println("Help Desk Station 1 - Visitor 3 Queue Number after Reset: " + queueSystem.generateQueueNumber(1));

        for (int i = 0; i < 10; i++) {
            queueSystem.generateQueueNumber(1);
        }

        System.out.println("Help Desk Station 1 - Visitor 4 Queue Number: " + queueSystem.generateQueueNumber(1));
    }
}
