package Visitor;

import java.util.ArrayList;

/**
 * @author SG on 2017/10/20
 */
class EmployeeList
{
    private ArrayList<Employee> list = new ArrayList<Employee>();

    public void addEmployee(Employee employee)
    {
        list.add(employee);
    }

    public void accept(Department handler)
    {
        for(Object obj : list)
        {
            ((Employee)obj).accept(handler);
        }
    }
}