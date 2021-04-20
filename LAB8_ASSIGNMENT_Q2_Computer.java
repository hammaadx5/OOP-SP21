public class Computer {
    protected int wordsize;
    protected int memorysize;
    protected int storagesize;
    protected double speed;
    public Computer(){}
    public Computer(int wordsize, int memorysize, int storagesize,double speed){
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;
    }
    public void display(){
        System.out.println("Wordsize: "+wordsize+" bits");
        System.out.println("MemorySize: "+memorysize+" megabytes");
        System.out.println("Storagesize: "+storagesize+" megabytes");
        System.out.println("Speed: "+speed+" megahertz");
    }
    
}