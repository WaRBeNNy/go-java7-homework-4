import java.util.Arrays;

import static java.util.Arrays.sort;

public class MyCollection {

    int[] elementData;
    private int size = 0;

    public MyCollection() {
        this.elementData = new int[size];
    }



    public boolean add(int e) {
        elementData = Arrays.copyOf(elementData, size + 1 );
        elementData[size] = e;

        for(int i=0;i<size;i++) {
            elementData[i] += e;
        }

        size++;

        return true;
    }

    public int remove(int index) {
        int oldValue = elementData[index];

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index, numMoved);
        --size;

        for(int i=0;i<size;i++) {
            elementData[i] -=oldValue;
        }

        return oldValue;
    }

    public void findByValue(int e) {
        for(int i=0;i<size;i++) {
            if(elementData[i] == e) {
                System.out.println("Элемент " + e + " есть в коллекции.");
            } else {
                System.out.println("Такого элемента в коллекции нет");
            }
        }

    }

    public int findByIndex(int index) {
        return elementData[index];
    }

    public int findMin() {
        int mas[] = elementData.clone();
        sort(mas);
        return mas[0];
    }

    public int findMax() {
        int mas[] = elementData.clone();
        sort(mas);
        return mas[size-1];
    }

    public int findAverage() {
        int sum = 0;
        for(int i=0;i<size;i++) {
            sum += elementData[i];
        }

        return sum / size;
    }

    @Override
    public String toString() {
        String string = "MyCollection:";

        for(int i=0;i<size;i++) {
            string = string + " " + elementData[i];
        }
        return string;
    }
}
