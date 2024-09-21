
import java.util.ArrayList;
import java.util.List;

public class PrintManager {
    private static PrintManager instance;
    private List<String> printQueue;

    private PrintManager() {
        printQueue = new ArrayList<>();
    }

    public static synchronized PrintManager getInstance() {
        if (instance == null) {
            instance = new PrintManager();
        }
        return instance;
    }

    public void addJob(String document) {
        printQueue.add(document);
        System.out.println("Documento '" + document + "' adicionado à fila.");
    }

    public void printAll() {
        for (String document : printQueue) {
            System.out.println("Imprimindo: " + document);
        }
        printQueue.clear();
    }

    public static void main(String[] args) {
        PrintManager printManager = PrintManager.getInstance();
        printManager.addJob("Documento 1");
        printManager.addJob("Documento 2");
        printManager.printAll();
    }
}
