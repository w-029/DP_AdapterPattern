import Duck.Duck;
import Turkey.Turkey;

/*
 * Turkey 适配器 继承了 Duck 接口
 * 功能：将Turkey对象包装成Duck接口的功能
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    /* 通过构造器接收一个待适配的对象 */
    public TurkeyAdapter (Turkey turkey) {
        this.turkey = turkey;
    }

    /* 对外实现了Duck接口，可以像对待Duck那样去调用他的quack方法
     * 但内里是执行的被适配的对象turkey的gobble方法 */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /* 将turkey对象的fly方法包装成Duck接口的fly方法 */
    @Override
    public void fly() {
        for (int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}

/*
 * 适配器模式：将一个类的接口，转换成客户期望的另一个接口。
 * 适配器让原本接口不兼容的类可以合作无间。
 * 注：
 * 1、“双向适配”：适配器不仅可以将接口A适配成接口B，也可以将接口B适配成接口A。
 * 2、“面向对象的适配器”:为了能够使调用接口时能够有确切的执行者，
 *      所以必须接收一个turkey对象。
 * 3、适配器模式与装饰者模式都是对对象进行包装，但两者的差别是“意图不一致”，
 *      装饰者只是为了增加对象的功能，而适配器是为了统一接口。
 */