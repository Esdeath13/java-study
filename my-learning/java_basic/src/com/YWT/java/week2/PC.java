/**
 * @ClassName PC
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/17 10:20
 **/
public class PC {
    CPU cpu;
    HardDisk disk;

    void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    void setHardDisk(HardDisk disk) {
        this.disk = disk;
    }

    void show() {
        System.out.println("CPU速度" + cpu.getSpeed());
        System.out.println("硬盘容量" + disk.getAmount());
    }

}