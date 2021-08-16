import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
    private Integer id;
    private String total;
    private String name;
    private Set<Item> items = new HashSet<>();

    public Car() {
    }

    public Car(String total, String name) {
        this.total = total;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(total, car.total) && Objects.equals(name, car.name) && Objects.equals(items, car.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, name, items);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", total='" + total + '\'' +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
