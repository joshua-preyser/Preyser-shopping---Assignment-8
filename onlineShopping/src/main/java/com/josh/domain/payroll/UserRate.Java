package com.josh.domain.payroll;


public class UserRate
{
    private int rateCode, userRate, rateId;

    private UserRate() {
    }

    public UserRate(Builder builder) {
        this.rateCode = builder.rateCode;
        this.userRate = builder.userRate;
        this.ratId = builder.rateId;
    }

    public int getRateCode() {
        return rateCode;
    }


    public int getUserRate) {
        return userRate;
    }

    public int getrateId() {
        return rateId;
    }

    public static class Builder {
        private int rateCode, userRate, rateId;
        public Builder rateCode(int rateCode) {
            this.rateCode = rateCode;
            return this;
        }
        public Builder userRate(int userRate) {
            this.userRate = userRate;
            return this;
        }

        public Builder rateId(int rateId)
        {
        this.rateId = rateId;
        return this;
        }

        public Builder copy(UserRate userRate) {
this.rateCode = userRate.rateCode;
            this.userRate = userRate..userRate;
        this.rateId = userRate.rateId;
        return this;
        }

        public UserRate build() {
        return new UserRate(this);
        }

    }



}