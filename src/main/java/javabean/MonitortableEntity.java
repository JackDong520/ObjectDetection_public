package javabean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "monitortable", schema = "objectdetect", catalog = "")
public class MonitortableEntity {
    private byte time;
    private Long instituteSum;
    private Long organizationSum;
    private Long companySum;

    @Id
    @Column(name = "Time")
    public byte getTime() {
        return time;
    }

    public void setTime(byte time) {
        this.time = time;
    }

    @Basic
    @Column(name = "InstituteSum")
    public Long getInstituteSum() {
        return instituteSum;
    }

    public void setInstituteSum(Long instituteSum) {
        this.instituteSum = instituteSum;
    }

    @Basic
    @Column(name = "OrganizationSum")
    public Long getOrganizationSum() {
        return organizationSum;
    }

    public void setOrganizationSum(Long organizationSum) {
        this.organizationSum = organizationSum;
    }

    @Basic
    @Column(name = "CompanySum")
    public Long getCompanySum() {
        return companySum;
    }

    public void setCompanySum(Long companySum) {
        this.companySum = companySum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonitortableEntity that = (MonitortableEntity) o;
        return time == that.time &&
                Objects.equals(instituteSum, that.instituteSum) &&
                Objects.equals(organizationSum, that.organizationSum) &&
                Objects.equals(companySum, that.companySum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, instituteSum, organizationSum, companySum);
    }
}
