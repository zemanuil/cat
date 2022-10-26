import java.lang.Math ;


public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private int count=0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1700.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    
  /*  public Double mealAmount(Cat cat)
    {
        return amount;
    }
    */
    public void pee()
    {
        weight = weight - 1;
        System.out.println ("Кот писает! Его вес: " + weight);
        count++;
        
    }
    
    public Double mealAmount()
    { Double mealAmount = weight - originWeight + count ;
    System .out.println (mealAmount );
    return mealAmount ;
        
    }
    
    
}

public class Loader
    {
        public static void main(String[] args)
        {
Cat cat = new Cat(), cat1 = new Cat(), cat2 = new Cat(), cat3 = new Cat(), cat4 = new Cat(), cat5 = new Cat();
            System.out.println("Кот 0: " +  Math.ceil(cat.getWeight()));
           System.out.println("Кот 1: " + Math.ceil( cat1.getWeight()));
   System.out.println("Кот 2: " + Math.ceil(cat2.getWeight()));
System.out.println("Кот 3: " + Math.ceil(cat3.getWeight()));
           System.out.println("Кот 4: " + Math.ceil(cat4.getWeight()));
           System.out.println("Кот 5: " + Math.ceil(cat5.getWeight()));
cat.feed(2.0);
cat1.feed(3.0);
System.out.println ("Кота покормили. Вес:" + cat.getWeight());
System.out.println ("Кота покормили. Вес: " + cat1.getWeight());
        
while (cat.getStatus() != "Exploded")
    cat.feed(2.0);
    
System.out.println (cat.getStatus ());
cat3.pee();
cat1.mealAmount();

cat5 .pee ();
cat5 .pee ();
cat5 .pee ();
cat5 .feed(150.0);
cat5 .mealAmount ();

        
        
          /*while (cat.getStatus () != "Dead")
          cat1.meow ();

         System.out.println(cat1.getStatus());*/

        
        }
    }
