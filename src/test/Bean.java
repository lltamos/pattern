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
public class Bean extends pp {
    static Bean1 bean1;
    private Bean1 xx = new Bean1("xx");
    public Bean() {
        System.out.println("bean构造方法执行");
    }
    {
        System.out.println("bean非静态代码执行");
    }
    static {
        System.out.println("bean静态代码执行");
    }
}
