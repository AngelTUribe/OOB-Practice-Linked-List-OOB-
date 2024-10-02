import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myScan=new Scanner(System.in);
        Family myFamily=new Family();

        myFamily.addPerson("John Bissett",-1,-1);
        myFamily.addPerson("Wilhelm Busart",-1,-1);
        myFamily.addPerson("John Leach",-1,-1);
        myFamily.addPerson("Georgianna Morningstar",-1,-1);
        myFamily.addPerson("John Campana",-1,-1);
        myFamily.addPerson("Anthony Germanotta",-1,-1);
        myFamily.addPerson("Rosaria X",-1,-1);
        myFamily.addPerson("George Lindsey Bissett",0,1);
        myFamily.addPerson("Sarah Ann Leach Sally",2,3);
        myFamily.addPerson("James Ferrie",-1,-1);
        myFamily.addPerson("Minnie Campana",4,-1);
        myFamily.addPerson("Joseph Germanotta",5,6);
        myFamily.addPerson("Angeline C",-1,-1);
        myFamily.addPerson("Paul Douglas Bissett",7,8);
        myFamily.addPerson("Veronica R Ferrie",9,10);
        myFamily.addPerson("Joseph A Germanotta",11,12);
        myFamily.addPerson("Cynthia B. Bissett",13,14);
        myFamily.addPerson("Stephanie Joanne Germanotta",15,16);
        myFamily.addPerson("Natali Germanotta",15,16);

        boolean done=false;

        do {
            System.out.println("What would you like to do");
            System.out.println("1. Add a person to the tree");
            System.out.println("2. See a person's ancestors");
            System.out.println("3. See a person's descendants");
            System.out.println("4. Quit");

            int choice=Integer.parseInt(myScan.nextLine());
            String listOfPeople=myFamily.everyone();
            if(choice==1) {
                System.out.println("What is this person's name?");
                String name=myScan.nextLine();

                System.out.println("Who is their first parent");
                System.out.println("-1 Unknown");
                System.out.println(listOfPeople);
                int parent1=Integer.parseInt(myScan.nextLine());

                System.out.println("Who is their other parent");
                System.out.println("-1 Unknown");
                System.out.println(listOfPeople);
                int parent2=Integer.parseInt(myScan.nextLine());

                myFamily.addPerson(name,parent1,parent2);

            }
            else if(choice==2) {

                System.out.println("Who do you want to see ancestors of?");
                System.out.println(listOfPeople);
                int who=Integer.parseInt(myScan.nextLine());
                myFamily.printParents(who,"Self");
            }
            else if(choice==3) {

                System.out.println("Who do you want to see descendants of?");
                System.out.println(listOfPeople);
                int who=Integer.parseInt(myScan.nextLine());
                myFamily.printChildren(who,"Self");
            }
            else if(choice==4) {
                done=true;
            }

        }while(!done);
    }
}