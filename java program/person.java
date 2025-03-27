class person{ 
    void display(int age, String name, String address)
    {
        System.out.println("Age:"+age);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        
    }
    public static void main(String[] args) {
         String name,address;
         int age;
        System.out.println("This is the data of person 1");
        
        person obj1=new person();
        obj1.display(19, "samyak", "Nagpur");
        
        System.out.println("This is the data of person 2");
        person obj2=new person();
        obj2.display(69, "sahil", "Amravati");
    }
}