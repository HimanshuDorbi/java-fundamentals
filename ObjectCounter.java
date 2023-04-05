public class ObjectCounter {
    private static int numObjects = 0;

    public ObjectCounter() {
        numObjects++;
    }

    public static int getNumObjects() {
        return numObjects;
    }

    public static void main(String[] args) {
        ObjectCounter[] objArray = new ObjectCounter[5];

        for (int i = 0; i < objArray.length; i++) {
            objArray[i] = new ObjectCounter();
        }

        System.out.println("Number of objects created: " + ObjectCounter.getNumObjects());
    }
}

