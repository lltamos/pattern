package test;

/**
 * <pp>Title:${type_inName}<pp/>
 * <pp>Description:<pp/>
 * <pp>Company: </pp>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/14
 */
public class pp {
    static {
        System.out.println("父类静态代码块");
    }
    public pp() {
        System.out.println("父类构造函数");
    }
    {
        System.out.println("父类非静态代码块 ");
    }
}
