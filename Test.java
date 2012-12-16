interface X{
  void foo();
}
interface Y{
  void bar();
}
interface Z extends X, Y{
  void hoge{};
}

abstract class A implements Z{
  public void foo(){
    System.out.println("A");
  }
}
class B extends A{
  public void foo(){
    System.out.println("B");
  }
  public void hoge(){
    System.out.println("C");
  }
}


class Test{
  public static void main(Sttring[] args){
    X b = new B();
    b.foo();
  }
}
