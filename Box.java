final class Box<type>
{
    private type item ;

    public type getItem()
    {
        return this.item ;
    }

    public void setItem(type item)
    {
        this.item = item ;
    }
}

// public static void main(String[] args)
// {
//     Box<String> b1 = new Box<String>() ;
//     Box<Integer> b2 = new Box<Integer>() ;
//     b1.setItem("String Item");
//     b2.setItem(10);

//     System.out.println(b1.getItem());
//     System.out.println(b2.getItem());
// }
