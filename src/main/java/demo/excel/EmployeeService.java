package demo.excel;

import act.cli.Command;
import act.util.PropertySpec;
import org.osgl.inject.annotation.LoadCollection;
import org.osgl.mvc.annotation.GetAction;

import java.util.List;

public class EmployeeService {

    @LoadCollection(TestDataGenerator.class)
    private List<Employee> employees;

    @GetAction("template")
    public List<Employee> template() {
        return employees;
    }

    @GetAction
    @PropertySpec(cli = "id as Id, firstName as First name, lastName as Last name, grade as Grade")
    @Command(value = "employees", help = "list all employees")
    public List<Employee> list() {
        return employees;
    }

}
