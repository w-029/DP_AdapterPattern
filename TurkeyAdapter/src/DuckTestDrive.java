import Duck.Duck;
import Duck.MallardDuck;
import Turkey.WildTurkey;

public class DuckTestDrive {

    public static void main (String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        /* TurkeyAdapter会将turkey对象适配成Duck接口，
         * 之后就可以像Duck对象那样去使用这个turkeyAdapter了 */
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck syas...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    /* 继承/适配了Duck接口的对象，都可以统一调用Duck接口方法 */
    static void testDuck (Duck duck) {
        duck.quack();
        duck.fly();
    }
}
