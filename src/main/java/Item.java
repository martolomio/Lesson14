import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
        private  Integer id;
        private String total;
        private Set<Car> cars = new HashSet<>();

    public Item() {
    }

    public Item( String total) {
        this.total = total;
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

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(total, item.total) && Objects.equals(cars, item.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, cars);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", total='" + total + '\'' +
                ", cars=" + cars +
                '}';
    }
}
