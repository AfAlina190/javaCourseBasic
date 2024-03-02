package homework.homework_33.task_3;

public class TourCollectionDemo {
    public static void main(String[] args) {
        TourCollection tourCollection = new TourCollection(3);

        tourCollection.addRequest("Cruise to the Bahamas");
        tourCollection.addRequest("Safari in Africa");
        tourCollection.addRequest("Skiing in the Alps");

        tourCollection.processRequest();
        tourCollection.processRequest();

        tourCollection.addRequest("City tour in Paris");

        System.out.println("Current queue size: " + tourCollection.getQueueSize());
        System.out.println("Max size of the collection: " + tourCollection.getMaxSize());
        System.out.println("Current requests in the queue: " + tourCollection.getRequests());
    }
}
