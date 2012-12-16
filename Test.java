interface X{
  void foo();
}
interface Z extends X{
  void hoge{};
}

abstract class A implements Z{
  public void foo(){
    hoge();
  }
}
class B extends A{
  public void foo(){
    System.out.println("A");
  }
  public void hoge(){
    System.out.println("B");
  }
}


class Test{
  public static void main(Sttring[] args){
    X b = new B();
    b.foo();
  }
}
