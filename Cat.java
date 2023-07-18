 class Cat {
    private String name; // кличка
    private String breed; // порода
    private int age; // возраст
    private double weight; // вес
    private String feed; // любимый корм
    
    // конструктор кота
    public Cat(String n, String b, int a, double w, String f) {
        name = n;
        breed = b;
        age = a;
        weight = w;
        feed = f;
    }
	
	// получение клички
	public String getName() {
		return name;
	}
	
	// изменение клички
	public void setName(String n) {
		name = n;
	}
	
	// получение возраста
	public int getAge() {
		return age;
	}
	
	// изменение возраста
	public void setAge(int a) {
		age = a;
	}
	
	// получение веса
	public double getWeight() {
		return weight;
	}
	
	// изменение веса
	public void setWeight(double w) {
		weight = w;
	}
	
	// получение любимого корма
	public String getFeed() {
		return feed;
	}
	
	// изменение любимого корма
	public void setFeed(String f) {
		feed = f;
	}
    
	// вывод данных о коте
    public void print() {
        System.out.println("Кличка - " + name);
        System.out.println("Порода - " + breed);
        System.out.println("Возраст - " + String.valueOf(age));
        System.out.println("Вес - " + String.valueOf(weight));
        System.out.println("Любимый корм - " + feed);
    }
}

class Main {
    public static void main (String[] args) {
        Cat c1 = new Cat("Тимофей", "Йоркширская шоколадная", 5, 5.5, "Рыбий фарш");
		c1.print();
		System.out.println();
		Cat c2 = new Cat("Снежана", "Центральноазиатская кошка", 6, 4.2, "Куриный рулет");
		c2.print();
    }
}