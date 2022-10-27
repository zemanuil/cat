import java.lang.Math ;


public class Cat
{
    public static int createCatCount=0;
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
        createCatCount++;

    }
    
//метод мяукает
    public void meow()
    {
        weight = weight - 1;
        System.out.print("Meow -");
    }

//метод кормит кота
    public void feed(Double amount)
    {
        weight = weight + amount;
    }
    
//метод поит кота
    public void drink(Double amount)
    {
        weight = weight + amount;
    }
    
//метод возвращает вес кота
    public Double getWeight()
    {
        return weight;
    }
    
//метод возвращает статус кота в зависимости от веса 
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
    
//метод кот писает
    public void pee()
    {
        weight = weight - 1;
        System.out.println ("Кот писает! Его вес: " + weight);
        count++;
        
    }
    
//метод считает сколько съел кот   
    public Double mealAmount()
    { Double mealAmount = weight - originWeight + count ;
    System .out.println (mealAmount);
    return mealAmount ;
        
    }
    
//метод считает кол-во созданных котов    
    public static int getCount()
    {
    return createCatCount;
    }
    
//метод перекарливает насмерть кота
    public void explode()
    {
        while (getStatus() != "Exploded")
            feed(2.0);
        //кот взорвался - уменьшаем счетчик котов
        Cat.createCatCount--;
        //извещаем о взрыве кота
        System.out.println (getStatus ());
            
    }
    
//метод замяукивает насмерть кошку    
    public void deadMeow () {
         while (getStatus () != "Dead")
              meow ();
         Cat.createCatCount--;

         System.out.println(getStatus());
    }
}

public class Loader
    {
        public static void main(String[] args)
        {
        
//создаем котов
Cat cat = new Cat(), cat1 = new Cat(), cat2 = new Cat(), cat3 = new Cat(), cat4 = new Cat(), cat5 = new Cat();

//выводим вес котов
            System.out.println("Кот 0: " +  Math.ceil(cat.getWeight()));
           System.out.println("Кот 1: " + Math.ceil( cat1.getWeight()));
   System.out.println("Кот 2: " + Math.ceil(cat2.getWeight()));
System.out.println("Кот 3: " + Math.ceil(cat3.getWeight()));
           System.out.println("Кот 4: " + Math.ceil(cat4.getWeight()));
           System.out.println("Кот 5: " + Math.ceil(cat5.getWeight()));
           
//кормление котов          
cat.feed(2.0);
cat1.feed(3.0);
System.out.println ("Кота покормили. Вес:" + cat.getWeight());
System.out.println ("Кота покормили. Вес: " + cat1.getWeight());
        

//закармливаем кота
cat.explode ();

//кот писает; измеряем  общую съеденную еду котом
cat3.pee();
cat1.mealAmount();

//кот в туалет
cat5 .pee ();
cat5 .pee ();
cat5 .pee ();

//кормление кота; вывод сколько он съел на экран
cat5 .feed(150.0);
cat5 .mealAmount ();


//замяукать кота
cat1.deadMeow  ();

//выводим количество живых котов
System.out.println("Всего живых котов на данный момент:" + Cat.createCatCount);


 }
    }
