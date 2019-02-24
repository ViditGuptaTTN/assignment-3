package main;

public interface Furniture {

    public void stressTest();
    public void fireTest();
}
class WoodenChair implements Furniture{
    WoodenChair(){
        System.out.println("wooden chair");
    }
    public void stressTest(){
        System.out.println(" stress Test passed");
    }
    public void fireTest(){
        System.out.println(" fire test not passed");
    }
}
class WoodenTable implements Furniture{
    WoodenTable(){
        System.out.println("Wooden table");
    }
    public void stressTest(){
        System.out.println(" stress Test passed");
    }
    public void fireTest(){
        System.out.println(" fire test not passed");
    }
}
class MetalChair implements Furniture{
    MetalChair(){
        System.out.println("Metal Chair");
    }
    public void stressTest(){
        System.out.println(" stress Test passed");
    }
    public void fireTest(){
        System.out.println(" fire test passed");
    }
}
class MetalTable implements Furniture{
    MetalTable(){
        System.out.println("Metal Table");
    }
    public void stressTest(){
        System.out.println(" stress Test passed");
    }
    public void fireTest(){
        System.out.println(" fire test not passed");
    }
}
