package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class AnimalArray<E> implements Animal<E>, Iterator<E> {

    private Object[] arrayAnimal;
    private Object[] arrayAnimalTemp;
    private int index;
    private int arraySize;
    private final int default_size = 10;

    public AnimalArray() {
        arraySize = default_size;
        arrayAnimal = new Object[arraySize];
    }

    public AnimalArray(Object[] arrayAnimal) {
        this.arrayAnimal = arrayAnimal;
    }

    @Override
    public void addAnimal(E e) {
        if (index < arrayAnimal.length) {
            arrayAnimal[index] = e;
            index++;
        } else {
            arraySize = arraySize + 1;
            arrayAnimalTemp = new Object[arraySize];
            for (int i = 0; i < arraySize; i++) {
                if (i < arraySize - 1) {
                    arrayAnimalTemp[i] = arrayAnimal[i];
                } else {
                    arrayAnimalTemp[i] = e;
                    index++;
                }
            }
            arrayAnimal = Arrays.copyOf(arrayAnimalTemp, arrayAnimalTemp.length);
        }


       //  System.out.println(Arrays.toString(arrayAnimal));
    }
    @Override
    public void removeAnimal(E e) {
        int tempNumb = 0;
        for (int i = 0; i < arrayAnimal.length - 1; i++) {
            if(arrayAnimal[i] != e) {
                tempNumb++;
            }else{
                break;
            }
        }
        arraySize = arraySize - 1;
        arrayAnimalTemp = new Object[arraySize];
        for (int i = 0; i < arrayAnimal.length - 1; i++) {
            if (i < tempNumb) {
                arrayAnimalTemp[i] = arrayAnimal[i];
            }else{
                arrayAnimalTemp[i] = arrayAnimal[i+1];
            }

        }
        arrayAnimal = Arrays.copyOf(arrayAnimalTemp, arrayAnimalTemp.length);
        //System.out.println(Arrays.toString(arrayAnimal));
    }



    @Override
    public Iterator<E> iterator() {
        return new AnimalArray (arrayAnimal);
    }


    @Override
    public void forEach(Consumer<? super E> action) {
        for (Object animal : arrayAnimal){
            System.out.println(animal);
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        return Animal.super.spliterator();
    }

    @Override
    public String toString() {
        return "AnimalArray{" +
                "arrayAnimal=" + Arrays.toString(arrayAnimal) +
                '}';
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}

 
