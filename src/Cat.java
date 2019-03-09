
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    private Double eatenFood;

    private static int count;

    public Cat()
    {
        this(1500.0 + 3000.0 * Math.random());
//        originWeight = weight;
//        minWeight = 1000.0;
//        maxWeight = 9000.0;
//        eatenFood = 0.0;
//        count++;
    }

    public Cat(double weight)
    {
        this(weight, weight, 100.0, 9000.0, 0.0);
    }

    private Cat(double weight, double originWeight, double minWeight, double maxWeight, double eatenFood)
    {
        this.weight = weight;
        this.originWeight = originWeight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.eatenFood = eatenFood;
        if (isAlive())
            count++;
    }

    public Cat (Cat other)
    {
        this(other.weight, other.originWeight, other.minWeight, other.maxWeight, other.eatenFood);

    }

    private void setEatenFood(Double eatenFood)
    {
        if (isAlive())
        {
            this.eatenFood = eatenFood;
        }
    }

    private void addEatenFood(Double eatenFood)
    {
        setEatenFood(getEatenFood() + eatenFood);
    }

    public Double getEatenFood()
    {
        return eatenFood;
    }

    public static int getCount()
    {
        return count;
    }

    public void shit()
    {
        if (isAlive())
        {
            addWeight(-3.0);
            System.out.println("Master, i crap");
        }
    }

    public void meow()
    {
        if (isAlive())
        {
            addWeight(-1.0);
            System.out.println("Meow");
        }
    }

    public void feed(Double amount)
    {
        addEatenFood(amount);
        addWeight(amount);
    }


    public void drink(Double amount)
    {
        addWeight(amount);
    }

    private void setWeight(Double weight)
    {
        if (isAlive())
        {
            this.weight = weight;
            if (!isAlive())
            {
                count--;
            }
        }
    }

    private void addWeight(Double weight)
    {
        setWeight(getWeight() + weight);
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

    public boolean isAlive()
    {
        return getWeight() >= minWeight && getWeight() <= maxWeight;
    }

    public static Cat getKitten()
    {
        double weight = 100 + 100 * Math.random();
        return new Cat (weight);
    }

    public Cat copy()
    {
        return new Cat(this);
    }

    public static Cat copy(Cat other)
    {
        return other.copy();
    }
}