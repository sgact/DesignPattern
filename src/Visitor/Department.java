package Visitor;

/**
 * @author SG on 2017/10/20
 */
abstract class Department
{
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
