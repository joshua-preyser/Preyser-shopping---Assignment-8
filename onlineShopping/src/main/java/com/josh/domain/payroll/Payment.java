package com.josh.domain.payroll;


public class Payment
{
    private String id;
    private Boolean paid;
    private String total;
    private String desc;

    private Payment() {
    }

    public Payment(Builder builder) {
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

        public Builder copy(Payment payment) {
this.id = payment.id;
            this.paid = payment.paid;
            this.total = payment.total;
            this.desc = payment.desc;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }

    }

    @Override
    public String toString()
    {
        return "Payment [desc=" + desc + ", id=" + id + ", paid=" + paid + ", total=" + total + "]";
    }

}