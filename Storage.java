import java.util.ArrayList ;

final class Storage<Type>
{
    private ArrayList<Type> storage = new ArrayList<Type>();

    public Type getItem(int index)
    {
        return this.storage.get(index) ;
    }

    public void addItem(Type item)
    {
        this.storage.add(item);
    }

    public void displayAll()
    {
        for (Type item : this.storage)
        {
            System.out.println(item);
        }
    }
}

// Storage<String> storage = new Storage<String>() ;
// storage.addItem("item 1");
// storage.addItem("item 2");
// storage.addItem("item 3");

// Storage<Integer> storage2 = new Storage<Integer>() ;
// storage2.addItem(1);
// storage2.addItem(2);
// storage2.addItem(3);

// // System.out.println(storage.getItem(2));
// storage.displayAll();
// storage2.displayAll();