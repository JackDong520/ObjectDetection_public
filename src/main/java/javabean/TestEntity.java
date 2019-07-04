package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "test", schema = "objectdetect", catalog = "")
public class TestEntity {
    private int num;
    private String name;

    @Id
    @Column(name = "num")
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEntity that = (TestEntity) o;
        return num == that.num &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}
