package com.josh.domain.payroll;


public class EmployeePay
{
    private String id;
    private Boolean paid;
    private String total;
    private String desc;

    private EmployeePay() {
    }

    public EmployeePay(Builder builder) {
        this.id = builder.id;
        this.paid = builder.paid;
        this.total = builder.total;
        this.desc = builder.desc;
    }

    public String getId() {
        return id;
    }


    public Boolean getPaid() {
        return paid;
    }

    public String getTotal() {
        return total;
    }

    public String getDesc() {
        return desc;
    }

    public static class Builder {
        private String id;
        private Boolean paid;
        private String total;
        private String desc;
        public Builder id(String id) {
            this.id = id;
            return this;
        }
        public Builder paid(Boolean paid) {
            this.paid = paid;
            return this;
        }

        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public Builder desc(String desc)
        {
            this.desc = desc;
            return this;
        }

        public Builder copy(EmployeePay employeePay) {
this.id = employeePay.id;
            this.paid = employeePay.paid;
            this.total = employeePay.total;
            this.desc = employeePay.desc;
            return this;
        }

        public EmployeePay build() {
            return new EmployeePay(this);
        }

    }

    @Override
    public String toString() {
        return "EmployeePay [desc=" + desc + ", id=" + id + ", paid=" + paid + ", total=" + total + "]";
    }


}