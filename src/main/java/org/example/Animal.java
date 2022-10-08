package org.example;



public interface Animal<E> extends Iterable<E>{


   void addAnimal(E e) ;

   void removeAnimal(E e) ;


}
