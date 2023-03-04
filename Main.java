
public class Main {

    public static void main(String[] args) {
        FamilyTree familyTree= new FamilyTree();
        
        familyTree.add(new Human("Andrey","Sergeevich", "1982", Gender.муж));
        familyTree.add(new Human("Olga", "Olegovna","1961", Gender.жен));
        familyTree.add(new Human("Anny", "Sergeevna", null, "2000", Gender.жен, null, null,null ));
        familyTree.add(new Human("Anna", "Andreevna", "1980", "1982", Gender.жен, familyTree.getByName("Andrey"), familyTree.getByName("Olga"), null));
System.out.println(familyTree.getInfo());


    }
}