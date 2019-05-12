package composite;


/**
 * Leaf
 */
public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println(name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}