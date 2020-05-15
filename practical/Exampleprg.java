class ExamplePrg
{
  void show(String ... person)
  {
     for(String name: person)
     {
        System.out.println("name :"+name);
     }
  }
  public static void main(String [] args)
  {
    ExamplePrg obj=new ExamplePrg();
    obj.show("ashu","tanu");
  }
}