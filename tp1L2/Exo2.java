/*enum Type {
    Herbivore, Carnivore
}

class Animal {
    private String name;
    private String race;
    private Type type;

    public Animal(String name, String race, Type type) {
        this.name = name;
        this.race = race;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal [Nom=" + getName() + ", Race=" + getRace() + ", Type=" + getType() + "]";
    }
}

public class Exo2 {
    public static void main(String[] args) {
        Animal[] tab = new Animal[3];
        Animal a = new Animal("kiwi", "cat", Type.Herbivore);
        Animal a2 = new Animal("kuku", "cat", Type.Carnivore);
        Animal a3 = new Animal("kuu", "at", Type.Herbivore);

        tab[0] = a;
        tab[1] = a2;
        tab[2] = a3;

        As(tab);
        for (Animal animal : tab) {
            System.out.println(animal);
        }
        
    }

    public static void As(Animal[] tab) {
        int carnivoreCount = 0;
        int herbivoreCount = 0;

        for (Animal n : tab) {
            if (n.getType() == Type.Carnivore) {
                carnivoreCount++;
                System.out.println("en c"+carnivoreCount);
            } else if (n.getType() == Type.Herbivore) {
                herbivoreCount++;
                System.out.println("en h"+herbivoreCount);
            }
        }
        System.out.println("Nombre de Carnivores: " + carnivoreCount);
        System.out.println("Nombre d'Herbivores: " + herbivoreCount);

      
     
    }
}
*/