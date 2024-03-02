package homework.homework_33.task_3;

import java.util.LinkedList;
import java.util.Queue;

class TourCollection {
    private Queue<String> requests;
    private int maxSize;

    public TourCollection(int maxSize) {
        this.requests = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public void addRequest(String request) {
        if (requests.size() < maxSize) {
            requests.add(request);
            System.out.println("Request added: " + request);
        } else {
            System.out.println("Tour requests collection is full. Cannot add request: " + request);
        }
    }

    public void processRequest() {
        if (!requests.isEmpty()) {
            String processedRequest = requests.poll();
            System.out.println("Processing request: " + processedRequest);
        } else {
            System.out.println("Tour requests collection is empty. No requests to process.");
        }
    }

    public int getQueueSize() {
        return requests.size();
    }

    public Queue<String> getRequests() {
        return requests;
    }

    public int getMaxSize() {
        return maxSize;
    }
}

