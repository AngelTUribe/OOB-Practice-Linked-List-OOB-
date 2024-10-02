class Person {
    private int id;
    public static int next_id=0;
    private String name;

    private int parent_id1;
    private int parent_id2;

    public Person(String name, int parent1, int parent2) {
        id=next_id++;
        this.name=name;
        parent_id1=parent1;
        parent_id2=parent2;
    }

    public int getParent1() {
        return parent_id1;
    }

    public int getParent2() {
        return parent_id2;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}