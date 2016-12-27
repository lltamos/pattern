package test;

/**
 * <pp>Title:${type_inName}<pp/>
 * <pp>Description:<pp/>
 * <pp>Company: </pp>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/5
 */
public class Bean1 {

//    public Bean1() {
//    }

    public Bean1(String msg) {
        System.out.println(msg);
    }

    static {
        System.out.println("bean1 静态代码块");
    }

    {
        System.out.println("bean1 非静态代码块");
    }
}
