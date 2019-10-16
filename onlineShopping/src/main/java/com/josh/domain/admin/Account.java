package com.josh.domain.admin;

import java.util.Date;

public class Account {
    private String id;
    private String address;
    private Boolean is_closed;
    private Date open;
    private Date closed;

    private Account() {
    }

    public Account(Builder builder) {
        this.id = builder.id;
        this.address = builder.address;
        this.is_closed = builder.is_closed;
        this.open = builder.open;
        this.closed = builder.closed;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getIs_closed() {
        return is_closed;
    }

    public Date getOpen() {
        return open;
    }

    public Date getClosed() {
        return closed;
    }

    public static class Builder {
        private String id;
        private String address;
        private Boolean is_closed;
        private Date open;
        private Date closed;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder is_closed(Boolean is_closed) {
            this.is_closed = is_closed;
            return this;
        }

        public Builder open(Date open) {
            this.open = open;
            return this;
        }

        public Builder closed(Date closed) {
            this.closed = closed;
            return this;
        }

        public Builder copy(Account account) {
this.id = account.id;
            this.address = account.address;
            this.is_closed = account.is_closed;
            this.open = account.open;
            this.closed = account.closed;
            return this;
        }

        public Account build() {
            return new Account(this);
        }

    }

    @Override
    public String toString() {
        return "Account [address=" + address + ", closed=" + closed + ", id=" + id + ", is_closed=" + is_closed
                + ", open=" + open + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((closed == null) ? 0 : closed.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((is_closed == null) ? 0 : is_closed.hashCode());
        result = prime * result + ((open == null) ? 0 : open.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (closed == null) {
            if (other.closed != null)
                return false;
        } else if (!closed.equals(other.closed))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (is_closed == null) {
            if (other.is_closed != null)
                return false;
        } else if (!is_closed.equals(other.is_closed))
            return false;
        if (open == null) {
            if (other.open != null)
                return false;
        } else if (!open.equals(other.open))
            return false;
        return true;
    }
    
}