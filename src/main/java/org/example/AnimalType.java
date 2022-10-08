package org.example;

public class AnimalType {
   private String breedOfAnimal;
   private int liveAnimalTime;

    public AnimalType(String breedOfAnimal, int liveAnimalTime) {
        this.breedOfAnimal = breedOfAnimal;
        this.liveAnimalTime = liveAnimalTime;
    }

    public String getBreedOfAnimal() {
        return breedOfAnimal;
    }

    public void setBreedOfAnimal(String breedOfAnimal) {
        this.breedOfAnimal = breedOfAnimal;
    }

    public int getLiveAnimalTime() {
        return liveAnimalTime;
    }

    public void setLiveAnimalTime(int liveAnimalTime) {
        this.liveAnimalTime = liveAnimalTime;
    }

    @Override
    public String toString() {
        return "AnimalType{" +
                "breedOfAnimal='" + breedOfAnimal + '\'' +
                ", liveAnimalTime=" + liveAnimalTime +
                '}';
    }
}
