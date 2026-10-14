package cat.awanit20;

public class CatAwanit20 {

    // Singly Linked List

    // Node
    class CatAwanit {
        int catData;
        CatAwanit catNext;

        CatAwanit(int catData) {
            this.catData = catData;
            this.catNext = null;
        }
    }

    CatAwanit catHead;

    // Add
    void catAdd(int catData) {

        CatAwanit catNew = new CatAwanit(catData);

        if (catHead == null) {
            catHead = catNew;
            return;
        }

        CatAwanit catCurrent = catHead;

        while (catCurrent.catNext != null) {
            catCurrent = catCurrent.catNext;
        }

        catCurrent.catNext = catNew;
    }

    // Display
    void catDisplay() {

        CatAwanit catCurrent = catHead;

        while (catCurrent != null) {
            System.out.print(catCurrent.catData + " -> ");
            catCurrent = catCurrent.catNext;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        CatAwanit20 catList = new CatAwanit20();

        catList.catAdd(10);
        catList.catAdd(20);
        catList.catAdd(30);

        catList.catDisplay();
    }
}